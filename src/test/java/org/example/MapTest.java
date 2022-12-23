package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    @Test
    void getDirectionForMoveLeft() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(3,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item2 = new Bear(new Coordinate(2,1),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        assertEquals(Direction.LEFT,map.getDirectionForMove(fox.getCoordinate()));
    }
    @Test
    void getDirectionForMoveRight() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item2 = new Bear(new Coordinate(2,1),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        assertEquals(Direction.RIGHT,map.getDirectionForMove(fox.getCoordinate()));
    }
    @Test
    void getDirectionForMoveUp() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,3),2, 12, 100);
        Item item2 = new Bear(new Coordinate(3,2),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        assertEquals(Direction.UP,map.getDirectionForMove(fox.getCoordinate()));
    }
    @Test
    void getDirectionForMoveDown() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(3,2),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        assertEquals(Direction.DOWN,map.getDirectionForMove(fox.getCoordinate()));
    }
    @Test
    void getDirectionForMoveStop() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(2,2),2,19,19);
        Item item = new Bear(new Coordinate(1,2),2, 12, 100);
        Item item1 = new Bear(new Coordinate(2,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(3,2),2, 12, 100);
        Item item3 = new Bear(new Coordinate(2,3),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        map.setItem(item3,item3.getCoordinate());
        assertEquals(Direction.STOP,map.getDirectionForMove(fox.getCoordinate()));
    }
    @Test
    void getDirectionForMoveWithWall() {
        Map map = new Map(10,10);
        Fox fox = new Fox(new Coordinate(0,0),2,19,19);
        Item item = new Bear(new Coordinate(1,1),2, 12, 100);
        Item item1 = new Bear(new Coordinate(0,1),2, 12, 100);
        Item item2 = new Bear(new Coordinate(1,0),2, 12, 100);
        Item item3 = new Bear(new Coordinate(2,3),2, 12, 100);
        map.setItem(fox,fox.getCoordinate());
        map.setItem(item,item.getCoordinate());
        map.setItem(item1,item1.getCoordinate());
        map.setItem(item2,item2.getCoordinate());
        map.setItem(item3,item3.getCoordinate());
        assertEquals(Direction.STOP,map.getDirectionForMove(fox.getCoordinate()));
    }
    @Test
    void setItem() {
        Fox fox = new Fox(new Coordinate(2,3),2, 2,3);
        Map map = new Map(10,10);
        map.setItem(fox,fox.getCoordinate());
        Item item = map.getMap()[3][2];
        assertEquals(fox, item);
    }
}