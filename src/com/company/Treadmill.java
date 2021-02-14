package com.company;

import java.util.concurrent.Callable;

public class Treadmill {
    public int dist;
    public Treadmill (int dist){
        this.dist = dist;
    }
//    //проверка возможности прохождения дистанции - перенесла в cat, human, robot
//    public boolean CanGetTreadmill(Object runner){
//        //System.out.println("You need to run "+dist);
//        if (runner instanceof Cat){
//           if(Cat.run_limit>=dist) {
//               System.out.println("Cat "+Cat.name + " run " + dist);
//               return true;
//           }
//           else {
//               System.out.println("Cat "+Cat.name + " can`t run " + dist);
//               return false;
//           }
//        }
//        if (runner instanceof Human){
//            if(Human.run_limit>=dist) {
//                System.out.println("Human "+Human.name + " run " + dist);
//                return true;
//            }
//            else {
//                System.out.println("Human "+Human.name + " can`t run " + dist);
//                return false;
//            }
//        }
//        if (runner instanceof Robot){
//            if(Robot.run_limit>=dist) {
//                System.out.println("Robot "+Robot.name + " run " + dist);
//                return true;
//            }
//            else {
//                System.out.println("Robot "+Robot.name + " can`t run " + dist);
//                return false;
//            }
//        }
//    }
}
