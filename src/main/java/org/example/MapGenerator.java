package org.example;


import org.apache.commons.lang3.ArrayUtils;

public class MapGenerator {

    public  Map generateMap(int countFox, int countBear, int countBerries, int countHare, int countHunter, int counterMouse, int xMaxMap, int yMaxMap){
        Map map = new Map(xMaxMap, yMaxMap);
        Item[][] arrayFreeElements = new Item[xMaxMap][yMaxMap];
       // arrayFreeElements.ArrayUtils.removeElement();
        for (int i = 1; i <= countFox; i++) {
            int xRandom = (int) (Math.random() *(xMaxMap - 1) -1);
            int yRandom = (int) (Math.random() *(yMaxMap - 1) -1);
                Fox fox = new Fox(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(fox, fox.getCoordinate());
                }

        for (int i = 1; i <= countBear; i++) {
            int xRandom = (int) (Math.random() *(xMaxMap - 1) -1);
            int yRandom = (int) (Math.random() *(yMaxMap - 1) -1);
            if (map.getMap(xRandom,yRandom) == null) {
                Bear bear = new Bear(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(bear, bear.getCoordinate());
            } else if (map.getMap(xRandom,(yRandom++)) == null && yRandom < yMaxMap){
                Bear bear = new Bear(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(bear, bear.getCoordinate());
            } else if (map.getMap(xRandom,(yRandom--)) == null && yRandom >= 0){
                Bear bear = new Bear(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(bear, bear.getCoordinate());
            } else if (map.getMap((xRandom++),yRandom) == null && xRandom < xMaxMap){
                Bear bear = new Bear(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(bear, bear.getCoordinate());
            }else if (map.getMap((xRandom--),yRandom) == null && xRandom >= 0){
                Bear bear = new Bear(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(bear, bear.getCoordinate());
            }else {
                while (map.getMap(xRandom,yRandom) != null){
                    xRandom = (int) (Math.random() *(xMaxMap - 1) -1);
                    yRandom = (int) (Math.random() *(yMaxMap - 1) -1);
                }
                Bear bear = new Bear(new Coordinate(xRandom, yRandom), 2, 100, 50);
                map.setItem(bear, bear.getCoordinate());
            }
        }
        return map;
    }
}
