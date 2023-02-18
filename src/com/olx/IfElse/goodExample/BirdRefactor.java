package com.olx.IfElse.goodExample;

import java.util.HashMap;
import java.util.Map;

abstract class Bird {
    boolean isNailed;
    int voltage;

    abstract double getSpeed();
    double getBaseSpeed () {
        return 0;
    }
    double getBaseSpeed(int voltage) {
        return 0;
    }
    double getLoadFactor() {
        return 0;
    }
}

class European extends Bird {
    double getSpeed() {
        return getBaseSpeed();
    }
}

class African extends Bird {
    double getSpeed() {
        return getBaseSpeed() - getLoadFactor();
    }
}

class NorwegianBlue extends Bird {
    double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }
}

// Somewhere in client code
public class Client {
    Map<String, Bird> birdMap = new HashMap<>();

    final String EUROPEAN = "european";
    final String AFRICAN = "african";
    final String NORWEGIAN_BLUE = "norwegian blue";

    static {
        birdMap.put(EUROPEAN, new European());
        birdMap.put(AFRICAN, new African());
        birdMap.put(NORWEGIAN_BLUE, new NorwegianBlue());
    }

    double getSpeed(String birdType) {
        return birdMap.get(birdType).getSpeed();
    }
}
