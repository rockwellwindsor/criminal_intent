package com.example.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by rockwellrice on 2/13/17.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the view to be inflated by activity_fragment.xml
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();

        // Look for the fragment in FragmentManager...
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        // ...and if it does not exist create one.
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
