package HomeWork6;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Жора");
        Cat cat1 = new Cat("Вася");
        Dog dog = new Dog("Степа");
        dog.run(450);
        cat.swim(10);
        cat1.run(240);
        cat.run(300);
        dog.swim(30);
        cat.jump(2.9);
        System.out.println(cat.cnt);
        System.out.println(dog.cnt);
    }
}
