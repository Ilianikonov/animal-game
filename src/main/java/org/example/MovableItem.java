package org.example;

public class MovableItem extends Item{
    private int speed;
    public MovableItem(Coordinate coordinate) {
        super(coordinate);
    }

    public MovableItem(Coordinate coordinate, int speed) {
        super(coordinate);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "MovableItem{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
