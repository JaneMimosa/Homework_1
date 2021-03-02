package HomeWork6;

public abstract class Animal {

    protected String name;
    static int s;

    protected Animal(String name) {
        this.name = name;
    }


    public static void print() {
        System.out.println(s);
    }

    public String getName() {
        return name;
    }


    public abstract void jump(double height);

    public abstract void run(int distance);

    public abstract void swim(int distance);

}
