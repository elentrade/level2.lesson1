package com.company;

public class Main {

    public static void main(String[] args) {

        Competitor[] t1 = {new Cat("Boris",500,2,true),
                new Human("Joe",2000,1,true),
                new Cat("Garfild",1000,3,true),
                new Robot ("Terminator",15000,5, true )};
        Obstacle[] o1 =   { new Treadmill(200), new Wall(1), new Treadmill(500),
                new Wall(2), new Treadmill(2000), new Wall(4), new Treadmill(10000),
                new Wall(3),  new Treadmill(20000), new Wall(10)};

        for (Competitor comp:t1) {
            for (Obstacle obs:o1) {
                obs.doIt(comp);

                if (!comp.TakeObstacle()){
                    break;
                }
            }
        }

        }




}
