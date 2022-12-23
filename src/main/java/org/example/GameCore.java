package org.example;

public class GameCore {
    public void start() {
        Map map = MapGenerator.generateMap(10, 4, 4, 4, 4, 4, 10, 10);
        while (map.countAnimal() > 0) {
            for (int y = 0; y < map.getyMax(); y++) {
                for (int x = 0; x < map.getxMax(); x++) {
                    Item item = map.getItem(new Coordinate(x, y));
                    if (item instanceof MovableItem) {
                        doMove((MovableItem) item, map);
                    }
                }
            }
        }
    }

    private void doMove(MovableItem movableItem, Map map) {
        Direction direction = map.getDirectionForMove(movableItem.getCoordinate());
        int speed = movableItem.getSpeed();
        int finalX = 0;
        int finalY = 0;
        if (direction == Direction.LEFT) {
            int currentX = movableItem.getCoordinate().getX() - 1;
            for (int i = 0; i < speed - 1; i++) {
                if (currentX >= 0 && map.getItem(new Coordinate(currentX, movableItem.getCoordinate().getY())) == null) {
                    currentX--;
                } else {
                    finalX = currentX + 1;
                    finalY = movableItem.getCoordinate().getY();
                    break;
                }
            }
        } else if (direction == Direction.RIGHT) {
            int currentX = movableItem.getCoordinate().getX() + 1;
            for (int i = 0; i < speed - 1; i++) {
                if (currentX < map.getxMax() && map.getItem(new Coordinate(currentX, movableItem.getCoordinate().getY())) == null) {
                    currentX++;
                } else {
                    finalX = currentX - 1;
                    finalY = movableItem.getCoordinate().getY();
                    break;
                }
            }
        } else if (direction == Direction.UP) {
            int currentY = movableItem.getCoordinate().getY() - 1;
            for (int i = 0; i < speed - 1; i++) {
                if (currentY >= 0 && map.getItem(new Coordinate(movableItem.getCoordinate().getX(), currentY)) == null) {
                    currentY--;
                } else {
                    finalX = movableItem.getCoordinate().getX();
                    finalY = currentY + 1;
                    return;
                }
            }
        } else if (direction == Direction.DOWN) {
            int currentY = movableItem.getCoordinate().getY();
            for (int i = 0; i < speed - 1; i++) {
                if (currentY < map.getyMax() && map.getItem(new Coordinate(movableItem.getCoordinate().getX(), currentY)) == null) {
                    currentY++;
                } else {
                    finalX = movableItem.getCoordinate().getX();
                    finalY = currentY - 1;
                    break;
                }
            }
        }
        map.removeItem(movableItem.getCoordinate());
        movableItem.setCoordinate(new Coordinate(finalX,finalY));
        map.setItem(movableItem,movableItem.getCoordinate());
    }
}
//            int counter = 0;
//            for (int newX = x - 1; newX >= (x - speed); newX--) {
//                if (newX >= 0 && map.getItem(new Coordinate(newX, y)) == null) {
//                    counter++;
//                }
//            }
//            map.setItem(map.getItem(new Coordinate(x, y)), new Coordinate(x - counter, y));
//            map.removeItem(new Coordinate(x, y));
//        } else if (direction == Direction.RIGHT ) {
//            int counter = 0;
//            for (int newX = x+1; newX <= (x + speed); newX++) {
//                if (newX < map.getxMax() && map.getItem(new Coordinate(newX, y)) == null) {
//                    counter++;
//                }
//            }
//            map.setItem(map.getItem(new Coordinate(x, y)), new Coordinate(x + counter, y));
//            map.removeItem(new Coordinate(x, y));
//        } else if (direction == Direction.UP) {
//            int counter = 0;
//            for (int newY = y - 1; newY >= (y - speed); newY--) {
//                if (newY >= 0 && map.getItem(new Coordinate(x, newY)) == null) {
//                    counter++;
//                }
//            }
//            map.setItem(map.getItem(new Coordinate(x, y)), new Coordinate(x, y - counter));
//            map.removeItem(new Coordinate(x, y));
//        } else if (direction == Direction.DOWN){
//            int counter = 0;
//            for (int newY = y + 1; newY <= y + speed; newY++) {
//                if (newY < map.getyMax() && map.getItem(new Coordinate(x, newY)) == null) {
//                    counter++;
//                }
//            }
//            map.setItem(map.getItem(new Coordinate(x, y)), new Coordinate(x, y + counter));
//            map.removeItem(new Coordinate(x, y));
//        }

