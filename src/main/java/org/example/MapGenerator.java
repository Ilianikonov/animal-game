package org.example;

import java.util.ArrayList;

public class MapGenerator {

    public static   Map generateMap(int countFox, int countBear, int countBerries, int countHare, int countHunter, int countMouse, int xMaxMap, int yMaxMap){
        Map map = new Map(xMaxMap, yMaxMap);

        ArrayList<Coordinate> arrayList = new ArrayList<>();
        for (int y = 0; y < xMaxMap; y++) {
            for (int x = 0; x < yMaxMap; x++) {
                arrayList.add(new Coordinate(x, y));
            }
        }
        for (int i = 0; i < countFox; i++) {
            int randomPosition = (int) (Math.random() * arrayList.size());
            Coordinate coordinate = arrayList.remove(randomPosition);
            Fox fox = new Fox(coordinate, 2, 100, 50);
            map.setItem(fox, fox.getCoordinate());
        }
        for (int i = 0; i < countBear; i++) {
            int randomPosition = (int) (Math.random() * arrayList.size());
            Coordinate coordinate = arrayList.remove(randomPosition);
            Bear bear = new Bear(coordinate, 2, 100, 50);
            map.setItem(bear, bear.getCoordinate());
        }
        for (int i = 0; i < countBerries; i++) {
             int randomPosition = (int) (Math.random() * arrayList.size());
             Coordinate coordinate = arrayList.remove(randomPosition);
             Berries berries = new Berries(coordinate);
             map.setItem(berries, berries.getCoordinate());
        }
        for (int i = 0; i < countHare; i++) {
             int randomPosition = (int) (Math.random() * arrayList.size());
             Coordinate coordinate = arrayList.remove(randomPosition);
             Hare hare = new Hare(coordinate, 2, 100, 50);
             map.setItem(hare, hare.getCoordinate());
        }
        for (int i = 0; i < countHunter; i++) {
             int randomPosition = (int) (Math.random() * arrayList.size());
             Coordinate coordinate = arrayList.remove(randomPosition);
             Hunter hunter = new Hunter(coordinate, 1);
             map.setItem(hunter, hunter.getCoordinate());
        }
        for (int i = 0; i < countMouse; i++) {
              int randomPosition = (int) (Math.random() * arrayList.size());
              Coordinate coordinate = arrayList.remove(randomPosition);
              Mouse mouse = new Mouse(coordinate, 2, 100, 50);
              map.setItem(mouse, mouse.getCoordinate());
        }
        return map;
    }
}
