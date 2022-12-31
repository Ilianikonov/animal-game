package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameCoreTest {

    @Test
    void doMoveUp() {
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
    @Test
    void doMoveDown(){
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(3,2),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(4, fox.getCoordinate().getY());
    }
    @Test
    void doMoveLeft(){
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(3,2),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(0, fox.getCoordinate().getX());
    }
    @Test
    void doMoveRight(){
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(1,2),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(4, fox.getCoordinate().getX());
    }
    @Test
    void doMoveStop(){
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item3 = new Bear(new Coordinate(3,2), 2, 12,44);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        map.setItem(item3,item3.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(2, fox.getCoordinate().getX());
        assertEquals(2, fox.getCoordinate().getY());
    }
    @Test
    void doMoveWithWall(){
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(0,0),2,19,19);
        Item item = new Bear(new Coordinate(0,1),2, 12, 100);
        Item item1 = new Bear(new Coordinate(1,0),2, 12, 100);
        Item item2 = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item3 = new Bear(new Coordinate(3,2), 2, 12,44);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        map.setItem(item3,item3.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(0, fox.getCoordinate().getX());
        assertEquals(0, fox.getCoordinate().getY());
    }
    @Test
    void doMoveWithWallMax(){
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(9,9),2,19,19);
        Item item = new Bear(new Coordinate(9,8),2, 12, 100);
        Item item1 = new Bear(new Coordinate(8,9),2, 12, 100);
        Item item2 = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item3 = new Bear(new Coordinate(3,2), 2, 12,44);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        map.setItem(item3,item3.getCoordinate());
        GameCore gameCore = new GameCore();
        gameCore.doMove(fox,map);
        assertEquals(9, fox.getCoordinate().getX());
        assertEquals(9, fox.getCoordinate().getY());
    }

    @Test
    void hunterActions() {
        Map map = new Map(10,10);
        Hunter hunter = new Hunter(new Coordinate(4,4),2);
        Fox fox = new Fox(new Coordinate(3,4),2,100,19);
        Fox fox1 = new Fox(new Coordinate(3,3),2,100,19);
        Fox fox2 = new Fox(new Coordinate(4,2),2,100,19);
        Fox fox3 = new Fox(new Coordinate(4,3),2,100,19);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(fox1,fox1.getCoordinate());
        map.setItem(fox2,fox2.getCoordinate());
        map.setItem(fox3,fox3.getCoordinate());
        map.setItem(hunter,hunter.getCoordinate());
    }
}