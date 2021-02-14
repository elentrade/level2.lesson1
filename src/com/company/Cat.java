package com.company;

public class Cat implements Actions{
    static String name;
    private static int run_limit;
    private static int jump_limit;
    private int score = 0; //очки за прохождение этапа полосы препятствий
    public Cat(String name,int run_limit, int jump_limit){
     this.name = name;
     this.run_limit = run_limit;
     this.jump_limit = jump_limit;
    }


    public boolean run(Treadmill treadmill){
        if (treadmill.dist<=run_limit){
            System.out.println(name+" run " + treadmill.dist);
            score++;
            return true;
        }
        else {
            System.out.println(name+" can`t run " + treadmill.dist);
            return false;
        }

    }
    public boolean jump(Wall wall){
        if (wall.height<=jump_limit){
            System.out.println(name+" jump " + wall.height);
            score++;
            return true;
        }
        else {
            System.out.println(name+" can`t jump " + wall.height);
            return false;
        }
    }
    public void getName(){
        System.out.println(name);
    }
    public int getScore(){
        return score;
    }
}
