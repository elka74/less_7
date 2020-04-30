package Cats;

public class Cat {
    String name;
    int APPETITE;
    boolean satiety = false;
    public Cat(String name, int APPETITE) {
        this.name = name;
        this.APPETITE = APPETITE;
    }
    public void eat(Plate plate){
        System.out.println("Кот/кошка "+ name + " кушает...");
        if (plate.food > 0 && plate.food > APPETITE){
            satiety = true;
            System.out.println(name + " наелся(ась) и мурлычит ♫");
        }else {
            System.out.println(name +" хочет кушать !!!");
        }
        plate.decreaseFood(APPETITE);
    }

}
