package threadcreation;

import java.util.Random;

class ColourTask implements Runnable {

    String[] colours = {
            "white",
            "blue",
            "black",
            "green",
            "red",
            "yellow"
    };

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equalsIgnoreCase("red")) {
                System.out.println("Red Found. Stopping...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RandomColor {

    public static void main(String[] args) {

        Thread t = new Thread(new ColourTask());
        t.start();
    }
}