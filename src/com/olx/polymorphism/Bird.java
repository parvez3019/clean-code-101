package com.olx.polymorphism;

class Bird {
    final String EUROPEAN = "european";
    final String AFRICAN = "african";
    final String NORWEGIAN_BLUE = "norwegian blue";

    String type;
    boolean isNailed;
    int voltage;

    double getSpeed() {
//        IF ELSE
//        if (type == EUROPEAN) {
//           do something
//        } else if type == AFRICAN {
//           do something
//        } else if type == NORWEGIAN_BLUE {
//           do something
//        }

        // Switch Case
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor();
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    double getBaseSpeed() {
        return 0;
    }

    double getBaseSpeed(int voltage) {
        return 0;
    }

    double getLoadFactor() {
        return 0;
    }


}
