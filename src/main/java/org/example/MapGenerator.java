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
//      for (int i = 1; i <= countBear; i++) {
      //    int coordinatRandom = (int) (Math.random() *arrayFreeElements.length);
      //        Bear bear = new Bear(new Coordinate(arrayFreeElements[coordinatRandom][0], arrayFreeElements[coordinatRandom][1]), 2, 100, 50);
      //        map.setItem(bear, bear.getCoordinate());
      //        arrayFreeElements = ArrayUtils.remove(arrayFreeElements,coordinatRandom);
      //}
      //for (int i = 1; i <= countBerries; i++) {
      //    int coordinatRandom = (int) (Math.random() *arrayFreeElements.length);
      //    Berries berries = new Berries(new Coordinate(arrayFreeElements[coordinatRandom][0], arrayFreeElements[coordinatRandom][1]));
      //    map.setItem(berries, berries.getCoordinate());
      //    arrayFreeElements = ArrayUtils.remove(arrayFreeElements,coordinatRandom);
      //}
      //for (int i = 1; i <= countHare; i++) {
      //    int coordinatRandom = (int) (Math.random() *arrayFreeElements.length);
      //    Hare hare = new Hare(new Coordinate(arrayFreeElements[coordinatRandom][0], arrayFreeElements[coordinatRandom][1]), 2, 100, 50);
      //    map.setItem(hare, hare.getCoordinate());
      //    arrayFreeElements = ArrayUtils.remove(arrayFreeElements,coordinatRandom);
      //}
      //for (int i = 1; i <= countHunter; i++) {
      //    int coordinatRandom = (int) (Math.random() *arrayFreeElements.length);
      //    Hunter hunter = new Hunter(new Coordinate(arrayFreeElements[coordinatRandom][0], arrayFreeElements[coordinatRandom][1]), 1);
      //    map.setItem(hunter, hunter.getCoordinate());
      //    arrayFreeElements = ArrayUtils.remove(arrayFreeElements,coordinatRandom);
      //}
      //for (int i = 1; i <= countMouse; i++) {
      //    int coordinatRandom = (int) (Math.random() *arrayFreeElements.length);
      //    Mouse mouse = new Mouse(new Coordinate(arrayFreeElements[coordinatRandom][0], arrayFreeElements[coordinatRandom][1]), 2, 100, 50);
      //    map.setItem(mouse, mouse.getCoordinate());
      //    arrayFreeElements = ArrayUtils.remove(arrayFreeElements,coordinatRandom);
      //  }
        return map;
    }
}
