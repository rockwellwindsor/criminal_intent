package com.example.android.criminalintent;

import java.util.UUID;

/**
 * Created by rockwellrice on 2/8/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }
}
