import Cats.Cat;
import Cats.Plate;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(45);
        Cat cat[] = new Cat[]{
                new Cat("Барсик", 10),
                new Cat("Буся", 8),
                new Cat("Тёма", 15),
                new Cat("Пушок", 11),
                new Cat("Нюша", 5),
                new Cat("Соня", 9)
        };
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            plate.addFood(cat[i]);
            plate.info();


        }
    }
}
