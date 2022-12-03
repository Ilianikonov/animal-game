package org.example;

import java.util.Arrays;

public class Map {
    private int xMax;
    private int yMax;
    private Item [][] map = new Item[xMax] [yMax];

    public Map(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
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
//    public boolean  (){
//        boolean zooEst = true;
//        for (int i = 0; i < getxMax(); i++){
//            for (int j = 0; j < getyMax(); j++){
//                if (map[i][j] == 0){
//                    zooEst = false;
//                } else if (map[i][j] == 1){
//                    zooEst = true;
//                    return zooEst;
//                }
//            }
 //       }
 //       return zooEst;
//    }
    @Override
    public String toString() {
        String stringMap = "";
        for (int i = 0; i < getxMax(); i++){
            for (int j = 0; j < getyMax(); j++){
               if (j < (getxMax() - 1)){
                   stringMap += map[i][j] + " ";
               } else {
                   stringMap += map[i][j] + "\n";
               }
            }
        }
        return stringMap;
    }
    private int countAnimal (){
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
