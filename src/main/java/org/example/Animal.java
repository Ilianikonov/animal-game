package org.example;

public abstract class Animal extends MovableItem {
    private int hp;
    private int foodLevel;

    public Animal(Coordinate coordinate, int speed, int hp, int foodLevel) {
        super(coordinate, speed);
        this.hp = hp;
        this.foodLevel = foodLevel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hp=" + hp +
                ", foodLevel=" + foodLevel +
                "} " + super.toString();

    }
}
