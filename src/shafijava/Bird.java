package shafijava;

public abstract class Bird {
    void run()
    {
        System.out.println("Running");
    }

    abstract void fly();
}

/*
class A{

    public static void main(String[] args) {
        Bird b = new Ostrich();
        b.fly();
        b.run();
    }
}
 */
