package org.example;

public  class Main {
    public static void main(String[] args) throws InterruptedException {

       // Fox foks = new Fox();
       // foks.setX(7);
       // foks.setY(9);
       // foks.setSpid(2);
       // Fox foks1 = new Fox();
       // Hunter hanter = new Hunter(1, 2);
       // double veroatnostDvigPravo = 0.75;
       // double veroatnostDvigVerh = 0.25;
       // double veroatnostDvigNiz = 0.5;
       // double veroatnostDvig = 0.3;
       // Map carta = new Map();
       // carta.placeOn(foks.getName(), foks.getX(), foks.getY());
       // carta.placeOn(hanter.getName(), hanter.getX(), hanter.getY());
       // while (carta.analizZooNaCarte()) {
       //     System.out.println("*" + hanter.getX() + " " + hanter.getY() + "*");
       //     System.out.println("/" + foks.getX() + foks.getY() + "/");
       //     carta.monitoringCart();
       //     if (foks.getName() == 1) {
       //         if (veroatnostDvig > Math.random()) {
       //             carta.raspolCartDelet(foks.getX(), foks.getY());
       //             double veroatnostNapravlen = Math.random();
       //             if (veroatnostDvigVerh > veroatnostNapravlen && (foks.getX() + foks.getSpid() + 1) < carta.getxMax()) {
       //                 foks.setX(foks.getX() + foks.getSpid());
       //                 carta.placeOn(foks.getName(), foks.getX(), foks.getY());
       //             } else if (veroatnostDvigNiz > veroatnostNapravlen && foks.getX() > foks.getSpid() ) {
       //                 foks.setX(foks.getX() - foks.getSpid());
       //                 carta.placeOn(foks.getName(), foks.getX(), foks.getY());
       //             } else if (veroatnostDvigPravo > veroatnostNapravlen && (foks.getY() + foks.getSpid() + 1) < carta.getyMax()) {
       //                 foks.setY(foks.getY() + foks1.getSpid());
       //                 carta.placeOn(foks.getName(), foks.getX(), foks1.getY());
       //             } else if (foks.getY() > foks.getSpid()){
       //                 foks.setY(foks.getY() - foks.getSpid());
       //                 carta.placeOn(foks.getName(), foks.getX(), foks.getY());
       //             }
       //         }
       //     }
       //     if (hanter.getName() == 9) {
       //         int minlength = 10000;
       //         int minlengthX = 0;
       //         int minlengthY = 0;
       //         for (int i = 0; i < carta.getxMax(); i++) {
       //             for (int j = 0; j < carta.getyMax(); j++) {
       //                 if (carta.getCart(i, j) == 1) {
       //                     if (i >= hanter.getX() && j >= hanter.getY()) {
       //                         if (((i - hanter.getX()) + (j - hanter.getY()) < minlength)) {
       //                             minlength = (i - hanter.getX()) + (j - hanter.getY());
       //                             minlengthX = i;
       //                             minlengthY = j;
       //                         }
       //                     } else if (i >= hanter.getX() && j <= hanter.getY()) {
       //                         if ((((i - hanter.getX()) + (hanter.getY()) - j) < minlength)) {
       //                             minlength = (i - hanter.getX()) + (hanter.getY() - j);
       //                             minlengthX = i;
       //                             minlengthY = j;
       //                         }
       //                     } else if (i <= hanter.getX() && j >= hanter.getY()) {
       //                         if (((hanter.getX() - i) + (j - hanter.getY()) < minlength)) {
       //                             minlength = (hanter.getX() - i) + (j - hanter.getY());
       //                             minlengthX = i;
       //                             minlengthY = j;
       //                         }
       //                     } else if (i <= hanter.getX() && j <= hanter.getY()) {
       //                         if (((hanter.getX() - i) + (hanter.getY() - j)) < minlength) {
       //                             minlength = (hanter.getX() - i) + (hanter.getY() - j);
       //                             minlengthX = i;
       //                             minlengthY = j;
       //                         }
       //                     }
       //                     if (minlengthX > hanter.getX() && minlengthY > hanter.getY() && hanter.getX() >=0 && hanter.getY() >= 0) {
       //                         if (minlengthX - hanter.getX() > minlengthY - hanter.getY()) {
       //                             hanter.setX(hanter.getX() + hanter.getSpid());
       //                         } else if (minlengthX - hanter.getX() < minlengthY - hanter.getY()) {
       //                             hanter.setY(hanter.getY() + hanter.getSpid());
       //                         }
       //                     } else if (minlengthX > hanter.getX() && minlengthY < hanter.getY()) {
       //                         if (minlengthX - hanter.getX() > hanter.getY() - minlengthY) {
       //                             hanter.setX(hanter.getX() + hanter.getSpid());
       //                         } else if (minlengthX - hanter.getX() < hanter.getY() - minlengthY) {
       //                             hanter.setY(hanter.getY() - hanter.getSpid());
       //                         }
       //                     } else if (minlengthX > hanter.getX() && minlengthY == hanter.getY()) {
       //                         hanter.setX(hanter.getX() + hanter.getSpid());
       //                     } else if (minlengthX < hanter.getX() && minlengthY > hanter.getY()) {
       //                         if (hanter.getX() - minlengthX > minlengthY - hanter.getY()) {
       //                             hanter.setX(hanter.getX() - hanter.getSpid());
       //                         } else if (minlengthX - hanter.getX() < minlengthY - hanter.getY()) {
       //                             hanter.setY(hanter.getY() + hanter.getSpid());
       //                         }
       //                     } else if (minlengthX < hanter.getX() && minlengthY < hanter.getY()) {
       //                         if (hanter.getX() - minlengthX > hanter.getY() - minlengthY) {
       //                             hanter.setX(hanter.getX() - hanter.getSpid());
       //                         } else if (hanter.getX() - minlengthX < hanter.getY() - minlengthY) {
       //                             hanter.setY(hanter.getY() - hanter.getSpid());
       //                         }
       //                     } else if (minlengthX < hanter.getX() && minlengthY == hanter.getY()) {
       //                         hanter.setX(hanter.getX() - hanter.getSpid());
       //                     } else if (minlengthX == hanter.getX() && minlengthY > hanter.getY()) {
       //                                 hanter.setY(hanter.getY() + hanter.getSpid());
       //                     } else if (minlengthX == hanter.getX() && minlengthY < hanter.getY()) {
       //                         hanter.setY(hanter.getY() - hanter.getSpid());
       //                     } else {
       //                         carta.raspolCartDelet(minlengthX, minlengthY);
       //                     }
       //                     if (hanter.getX() == minlengthX && ((minlengthY - 1) == hanter.getY() || (minlengthY + 1) == hanter.getY())) {
       //                         carta.raspolCartDelet(minlengthX, minlengthY);
       //                     } else if ((hanter.getX() - 1) == minlengthX && ((minlengthY - 1) == hanter.getY() || (minlengthY + 1) == hanter.getY() || minlengthY == hanter.getY())) {
       //                         carta.raspolCartDelet(minlengthX, minlengthY);
       //                     } else if ((hanter.getX() + 1) == minlengthX && ((minlengthY - 1) == hanter.getY() || (minlengthY + 1) == hanter.getY() || minlengthY == hanter.getY())) {
       //                         carta.raspolCartDelet(minlengthX, minlengthY);
       //                     }
       //                 }
       //             }
       //         }
       //     }
       //     Thread.sleep(1000);
        Map map = MapGenerator.generateMap(10,4,4,4,4,4,10,10);
        while (map.countAnimal() > 0) {
            for (int y = 0; y < map.getyMax(); y++) {
                for (int x = 0; x < map.getxMax(); x++) {
                    if (map.getItem(x, y) instanceof Animal) {
                        Direction direction = map.getDirectionForMove(new Coordinate(x, y));
                        int spid = ((MovableItem) map.getItem(x, y)).getSpeed();
                        if (direction == Direction.LEFT) {
                            int counter = 0;
                            for (int newX = x-1; newX >= x - spid; newX--) {
                                if (newX >= 0 && map.getItem(newX, y) == null) {
                                    counter++;
                                }
                            }
                            map.setItem(map.getItem(x, y), new Coordinate(x - counter, y));
                            map.removeItem(new Coordinate(x, y));
                        } else if (direction == Direction.RIGHT ) {
                            int counter = 0;
                            for (int newX = x+1; newX <= x + spid; newX++) {
                                if (newX < map.getxMax() && map.getItem(newX, y) == null) {
                                    counter++;
                                }
                            }
                            map.setItem(map.getItem(x, y), new Coordinate(x + counter, y));
                            map.removeItem(new Coordinate(x, y));
                        } else if (direction == Direction.UP) {
                            int counter = 0;
                            for (int newY = y+1; newY <= y + spid; newY++) {
                                if (newY < map.getyMax() && map.getItem(x, newY) == null) {
                                    counter++;
                                }
                            }
                            map.setItem(map.getItem(x, y), new Coordinate(x, y + counter));
                            map.removeItem(new Coordinate(x, y));
                        } else if (direction == Direction.DOWN){
                            int counter = 0;
                            for (int newY = y - 1; newY >= y - spid; newY--) {
                                if (newY >= 0 && map.getItem(x, newY) == null) {
                                    counter++;
                                }
                            }
                            map.setItem(map.getItem(x, y), new Coordinate(x, y - counter));
                            map.removeItem(new Coordinate(x, y));
                        }
                    }
                }
            }
            System.out.println(map.toString());
        }
    }
}




