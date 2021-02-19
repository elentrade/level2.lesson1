package com.company;

public class Human implements Competitor {
    static String name;
    private static int run_limit;
    private static int jump_limit;
    private boolean IsOnDist;
    private int score = 0; //очки за прохождение этапа полосы препятствий
    public Human(String name,int run_limit, int jump_limit, boolean IsOnDit){
        this.name = name;
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.IsOnDist = true;
    }
    @Override
    public void run(int dist){
        if (dist<=run_limit){
            System.out.println(name+" run " + dist);
            score++;
        }
        else {
            System.out.println(name+" can`t run " + dist);
            IsOnDist = false;
        }

    }
    @Override
    public void jump(int height){
        if (height<=jump_limit){
            System.out.println(name+" jump " + height);
            score++;
        }
        else {
            System.out.println(name+" can`t jump " + height);
            IsOnDist = false;
        }
    }
    public void getName(){
        System.out.println(name);
    }
    public int getScore(){
        return score;
    }
    @Override
    public boolean TakeObstacle(){
        return IsOnDist;
    }
}
