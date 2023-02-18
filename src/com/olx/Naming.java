package com.olx;

public class Naming {

//  Example 1 - Short names / abbreviations
    static class BadNaming {
        int d;
        // elapsed time in days
        int ds;
        int dsm;
        int faid;

        boolean active;
    }

    static class GoodNaming {
        int elapsedTimeInDays;
        int daysSinceCreation;
        int daysSinceModification;
        int fileAgeInDays;

        boolean isActive;
    }

// Example 2 - Self Context
    static class Address {
        String addressCity;
        String addressHomeNumber;
        String addressPostCode;
        String streetNameString;
        Double pinCodeAsDouble;
    }
}
