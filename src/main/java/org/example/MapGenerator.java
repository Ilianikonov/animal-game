package org.example;

public class MapGenerator {

    public  Map generateMap(int countFox, int countBear, int countBerries, int countHare, int countHunter, int counterMouse, int xMaxMap, int yMaxMap){
        Map map = new Map(xMaxMap, yMaxMap);

        for (int i = 1; i <= countFox; i++) {
            Fox fox = new Fox(new Coordinate(2,8), 2, 100, 50);
            map.setItem(fox, fox.getCoordinate());
        }
        return map;
    }
}
