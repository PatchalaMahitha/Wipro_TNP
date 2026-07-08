package Overriding;

public class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " tastes " + taste);
    }

    public static void main(String[] args) {
        Fruit f = new Fruit("Fruit", "Unknown", "Medium");
        Apple a = new Apple();
        Orange o = new Orange();

        f.eat();
        a.eat();
        o.eat();
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}