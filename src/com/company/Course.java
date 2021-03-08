package com.company;

public class Course  {
    Treadmill treadmill1 = new Treadmill(200);
    Treadmill treadmill2 = new Treadmill(500);
    Treadmill treadmill3 = new Treadmill(2000);
    Treadmill treadmill4 = new Treadmill(10000);
    Treadmill treadmill5 = new Treadmill(20000);
    Wall wall1 = new Wall(1);
    Wall wall2 = new Wall(2);
    Wall wall3 = new Wall(3);
    Wall wall4 = new Wall(4);
    Wall wall5 = new Wall(10);
    private Object[] c = {treadmill1, treadmill2, wall1, treadmill3, wall2, treadmill4, wall3, treadmill5,  wall4,wall5};
    public Object[] getCourse(){
            return  c;
    }


   //здесь надо вставить метод прохождения полосы препятствий командой. в метод передается команда
    //здесь надо вставить метод подсчета очков команды и вывод результата

}
