package org.example;

import java.util.ArrayList;

public class Map {
    private int xMax;
    private int yMax;
    private Item [][] map;

    public Map(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
        map = new Item[xMax] [yMax];
    }

    public Item getItem(int x, int y) {
        return map[x][y];
    }

    public int getxMax() {
        return xMax;
    }
    public int getyMax() {
        return yMax;
    }

    public void setItem(Item item, Coordinate coordinate){
        map[coordinate.getY()][coordinate.getX()] = item;
    }
    public void removeItem (Coordinate coordinate){
        map[coordinate.getY()][coordinate.getX()] = null;
    }

    @Override
    public String toString() {
        String stringMap = "";
        for (int i = 0; i < getxMax(); i++){
            for (int j = 0; j < getyMax(); j++){
               if (j < (getxMax() - 1)){
                   stringMap += getSimpleName(map[i][j]) + " ";
               } else {
                   stringMap += getSimpleName(map[i][j]) + "\n";
               }
            }
        }
        return stringMap;
    }
    public String getSimpleName(Object object){
        if (object != null) {
            String simpleName = object.getClass().getSimpleName();
            String shortName = "";
            if (simpleName.length() > 4) {
                for (int i = 0; i < 4; i++) {
                    shortName += simpleName.charAt(i);
                }
            } else {
                int countSpace = 4 - simpleName.length();
                shortName += simpleName;
                for (int i = 0; i < countSpace; i++) {
                    shortName += " ";
                }

            }
            return shortName;
        }
        return null;
    }
    public int countAnimal (){
        int counterAnimal = 0;
        for (int i = 0; i < xMax; i++) {
            for ( int j = 0; j < yMax; j++){
                if (map[i][j] instanceof Animal){
                    counterAnimal++;
                }
            }
        }
        return counterAnimal;
    }
    public Direction getDirectionForMove (Coordinate coordinate){
        ArrayList <Direction> arrayList = new ArrayList<>();
        arrayList.add(Direction.LEFT);
        arrayList.add(Direction.RIGHT);
        arrayList.add(Direction.UP);
        arrayList.add(Direction.DOWN);
        while (arrayList.size() > 0){
            int index = (int)  (Math.random() * (((arrayList.size()-1) - 0) + 1)) + 0;
            Direction direction = arrayList.get(index);
            int x = coordinate.getX();
            int y = coordinate.getY();
            if (direction == Direction.LEFT) {
                if (x - 1 >= 0 && getItem(x - 1, y) == null) {
                    return Direction.LEFT;
                } else {
                    arrayList.remove(index);
                }
            } else if (direction == Direction.RIGHT) {
                if (x + 1 < getxMax() && getItem(x + 1, y) == null) {
                    return Direction.RIGHT;
                } else {
                    arrayList.remove(index);
                }
            } else if (direction == Direction.UP) {
                if (y + 1 < getyMax() && getItem(x, y + 1) == null) {
                return Direction.UP;
                } else {
                    arrayList.remove(index);
                }
            } else if (direction == Direction.DOWN) {
                if (y - 1 >= 0 && getItem(x, y - 1) == null) {
                    return Direction.DOWN;
                } else {
                    arrayList.remove(index);
                }
            }
        }
        return Direction.STOP;
    }
}
