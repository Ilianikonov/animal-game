package org.example;

public class Map {
    private int xMax;
    private int yMax;
    private Item [][] map;

    public Map(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
        map = new Item[xMax] [yMax];
    }

    public Item getMap(int x, int y) {
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
}
