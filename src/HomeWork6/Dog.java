package HomeWork6;

public class Dog extends Animal {

    public static int cnt;

    public Dog(String name) {
        super(name);
        cnt++;
    }

    @Override
    public void jump(double height) {
        int h = (int) (0.5 + Math.random() * 1);
        if (height <= h) {
            System.out.println(name + " подпрыгнул на высоту " + height + "м");
        } else {
            System.out.println(name +" не может прыгнуть так высоко, его предел " + h + "м");
        }
    }

    @Override
    public void run(int distance) {
        int d = (int) (400 + Math.random() * 250);
        if (distance <= d) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " пробежал " + d + "м и устал");
        }
    }

    @Override
    public void swim(int distance) {
        int d = (int) (8 + Math.random() * 7);
        if (distance <= d) {
            System.out.println(name + " проплыл " + distance + "м");
        } else {
            System.out.println(name + " проплыл " + d + "м и устал");
        }
    }
}
