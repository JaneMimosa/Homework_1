package HomeWork6;

public class Cat extends Animal {

    public static int cnt;

    public Cat(String name) {
        super(name);
        cnt++;
    }

    @Override
    public void jump(double height) {
        int h = (int) (1.5 + Math.random() * 2);
        if (height <= h) {
            System.out.println(name + " подпрыгнул на высоту " + height + "м");
        } else {
            System.out.println(name +" отказался прыгать так высоко, его предел " + h + "м");
        }
    }

    @Override
    public void run(int distance) {
        int d = (int) (150 + Math.random() * 200);
        if (distance <= d) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " отказался бежать, его предел " + d + "м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!!!");
    }
}
