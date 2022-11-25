package org.example;

public class Item {
   private Coordinate coordinate;

   public Coordinate getCoordinate() {
      return coordinate;
   }

   public void setCoordinate(Coordinate coordinate) {
      this.coordinate = coordinate;
   }

   public Item(Coordinate coordinate) {
      this.coordinate = coordinate;
   }

   @Override
   public String toString() {
      return "Item{" +
              "coordinate=" + coordinate +
              '}';
   }
}
