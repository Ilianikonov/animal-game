package org.example;

public class Map {
    private int xMax;
    private int yMax;
    private Item [][] map = new Item[xMax] [yMax];

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
    public void monitoringCart (){
        for (int i = 0; i < getxMax(); i++){
            for (int j = 0; j < getyMax(); j++){
                System.out.print(map[i][j]);
            }
        }
    }

}
