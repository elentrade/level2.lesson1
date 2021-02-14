package com.company;

public class Wall {
    public int height;
    public Wall(int height){
        this.height = height;
    }
//    //проверка возможности перепрыгнуть стену - перенесла в cat, human, robot
//    public boolean CanGetWall(Object jumper){
//        if (jumper instanceof Cat){
//            if(Cat.jump_limit>=height) {
//                System.out.println("Cat "+Cat.name + " jump " + height);
//                return true;
//            }
//            else {
//                System.out.println("Cat "+Cat.name + " can`t jump " + height);
//                return false;
//            }
//        }
//        if (jumper instanceof Human){
//            if(Human.jump_limit>=height) {
//                System.out.println("Human "+Human.name + " jump " + height);
//                return true;
//            }
//            else {
//                System.out.println("Human "+Human.name + " can`t jump " + height);
//                return false;
//            }
//        }
//        if (jumper instanceof Robot){
//            if(Robot.jump_limit>=height) {
//                System.out.println("Robot "+Robot.name + " jump " + height);
//                return true;
//            }
//            else {
//                System.out.println("Robot "+Robot.name + " can`t jump " + height);
//                return false;
//            }
//        }
//    }
}
