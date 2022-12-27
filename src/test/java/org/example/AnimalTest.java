package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getFoodLevel() {
        Animal fox = new Fox(new Coordinate(2,1),2,100,100);
        fox.setFoodLevel(90);
        int actual = fox.getFoodLevel();
        assertEquals(90,actual);
    }
}