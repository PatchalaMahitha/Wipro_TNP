package miniproject11;

class Hare extends Thread {

    public Hare() {
        super("Hare");
    }

    public void run() {

        for (int distance = 1; distance <= 100; distance++) {

            // Hare sleeps after running 60 meters
            if (distance == 61) {
                try {
                    System.out.println("Hare reached 60 meters and is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Hare interrupted");
                }
            }

            System.out.println("Hare: " + distance + " meters");

            // Check whether Tortoise has already won
            if (Race.tortoiseWon) {
                return;
            }
        }

        Race.hareWon = true;
        System.out.println("Hare wins the race!");
    }
}

class Tortoise extends Thread {

    public Tortoise() {
        super("Tortoise");
    }

    public void run() {

        for (int distance = 1; distance <= 100; distance++) {

            System.out.println("Tortoise: " + distance + " meters");

            // Check whether Hare has already won
            if (Race.hareWon) {
                return;
            }
        }

        Race.tortoiseWon = true;
        System.out.println("Tortoise wins the race!");
    }
}

public class HareTortoiseRace {

    public static volatile boolean hareWon = false;
    public static volatile boolean tortoiseWon = false;

    public static void main(String[] args) {

        Hare hare = new Hare();
        Tortoise tortoise = new Tortoise();

        // Set higher priority to Hare
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Hare Priority: " + hare.getPriority());
        System.out.println("Tortoise Priority: " + tortoise.getPriority());

        System.out.println("Race Started!");

        // Start both threads
        hare.start();
        tortoise.start();

        try {
            // Wait for both threads to finish
            hare.join();
            tortoise.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Race Finished!");
    }
}