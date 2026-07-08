package ClassesAndObjects;

public class Box {

    int width;
    int height;
    int depth;

    // Parameterized Constructor
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please enter 3 integer values.");
            return;
        }

        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        int depth = Integer.parseInt(args[2]);

        Box b = new Box(width, height, depth);

        System.out.println("Width  : " + b.width);
        System.out.println("Height : " + b.height);
        System.out.println("Depth  : " + b.depth);
        System.out.println("Volume : " + b.volume());
    }
}