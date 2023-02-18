package com.olx;

public class MagicNumbers {

    // BAD
    double potentialEnergyBad(double mass, double height) {
        return mass * height * 9.81;
    }

    void setPasswordBad(String password) throws Exception {
        // don't do this
        if (password.length() > 7) {
            throw new Exception("password");
        }
    }



    // GOOD
    public static final double GRAVITATIONAL_CONSTANT = 9.81;

    double potentialEnergyGood(double mass, double height) {
        return mass * height * GRAVITATIONAL_CONSTANT;
    }

    public static final int MAX_PASSWORD_SIZE = 7;

    void setPasswordGood(String password) throws Exception {
        if (password.length() > MAX_PASSWORD_SIZE) {
            throw new Exception("password");
        }
    }


    //    Final Example -
//        for (int j = 0; j < 34; j++) {
//            s += (t[j] * 4) / 5;
//        }

//        int realDaysPerIdealDay = 4;
//        const int WORK_DAYS_PER_WEEK = 5;
//        int sum = 0;
//        for (int = 0; j < NUMBER_OF_TASKS; j++) {
//            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
//            int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
//            sum += realTaskWeeks;
//        }
}
