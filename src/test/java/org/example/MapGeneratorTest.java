package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapGeneratorTest {

    @Test
    void generateMap() {
        Map map = MapGenerator.generateMap(44,4,4,4,1,3,10,10);
        int count = 0;
        for (int y =0; y < 10; y++){
            for (int x = 0; x < 10; x++){
                if (map.getItem(new Coordinate(x,y)) != null){
                    count++;
                }
            }
        }
        assertEquals(60,count);
    }
}