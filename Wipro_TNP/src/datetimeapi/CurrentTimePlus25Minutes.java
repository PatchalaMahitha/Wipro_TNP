package datetimeapi;

import java.time.LocalTime;

public class CurrentTimePlus25Minutes {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();

        LocalTime after25Minutes = currentTime.plusMinutes(25);

        System.out.println("Current Time     : " + currentTime);
        System.out.println("After 25 Minutes : " + after25Minutes);
    }
}