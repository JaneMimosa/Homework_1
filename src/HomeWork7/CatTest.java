package HomeWork7;

public class CatTest {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Вася", 15);
        cat[1] = new Cat("Жора", 10);
        cat[2] = new Cat("Мурка", 12);
        cat[3] = new Cat("Пушок", 11);
        cat[4] = new Cat("Чернуша", 9);
        for (Cat c : cat) {
            c.eat(plate);
            plate.info();
            c.fullness();
        }
        plate.addFood(50);
        plate.info();
    }
}
