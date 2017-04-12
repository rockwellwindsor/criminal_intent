package com.example.android.criminalintent.database;

/**
 * Created by rockwellrice on 4/8/17.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        // Set out the columns needed for the database
        public static final class Cols {
            public static final String UUID = "uuid"; // CrimeTable.Cols.UUID
            public static final String TITLE = "title"; // CrimeTable.Cols.TITLE
            public static final String DATE = "date"; // CrimeTable.Cols.DATE
            public static final String SOLVED = "solved"; // CrimeTable.Cols.SOLVED
            public static final String SUSPECT = "suspect"; // CrimeTable.Cols.SUSPECT
        }
    }
}
