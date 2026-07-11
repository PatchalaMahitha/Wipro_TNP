package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    public String getModelName() {
        return "Ford EcoSport";
    }

    public String getRegistrationNumber() {
        return "TS09CD2222";
    }

    public String getOwnerName() {
        return "Naga";
    }

    public int speed() {
        return 160;
    }

    public int tempControl() {
        return 22;
    }
}