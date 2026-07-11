package test;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class TestVehicle {

    public static void main(String[] args) {

        Logan logan = new Logan();

        System.out.println("----- LOGAN -----");
        System.out.println("Model : " + logan.getModelName());
        System.out.println("Registration : " + logan.getRegistrationNumber());
        System.out.println("Owner : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed());
        System.out.println("GPS : " + logan.gps());

        System.out.println();

        Ford ford = new Ford();

        System.out.println("----- FORD -----");
        System.out.println("Model : " + ford.getModelName());
        System.out.println("Registration : " + ford.getRegistrationNumber());
        System.out.println("Owner : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed());
        System.out.println("Temperature : " + ford.tempControl());

    }
}