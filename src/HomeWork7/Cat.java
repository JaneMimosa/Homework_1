package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate p) {
        if (!isFull) {
            p.decreaseFood(appetite);
            isFull = true;
        } else {
            System.out.println(name + " уже поел");
        }
    }

    public void fullness() {
        if (isFull) {
            System.out.println(name + " сыт");
        } else {
            System.out.println(name + " голоден");
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
