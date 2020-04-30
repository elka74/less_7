package Cats;

import Cats.Cat;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
            System.out.println("Food : " + food);
        }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food < amount) {
            System.out.println("В тарелке недостаточно еды");
            food = food;
        } else
            food -= amount;
    }
    public void addFood( Cat cat){
        if (food <= cat.APPETITE){
            food += cat.APPETITE ;
            System.out.println("Еда в тарелке увеличена на  " + cat.APPETITE);
        }
    }

}
