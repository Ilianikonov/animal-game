package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCoreTest {

    @Test
    void start() {


    }

    @Test
    void doMove() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item2 = new Bear(new Coordinate(3,2),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(0, fox.getCoordinate().getY());
    }
}