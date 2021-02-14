package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Boris",500,2);
        Cat cat2 = new Cat("Garfild",1000,3);
        Cat cat3 = new Cat("Stinky",400,1);
        Human human1 = new Human("Joe",2000,1);
        Human human2 = new Human("Sara",4000,2);
        Human human3 = new Human("Larry",8000,3);
        Robot robot1 = new Robot("Robocop",10000,3);
        Robot robot2 = new Robot("Terminator",15000,5);
        //создаем команды
        Object [] t1 =  { human1, cat2, robot2, cat1};
        Team team1 = new Team("Team # 1",  t1);
        Object [] t2 =  {cat3, human2, human3, robot1};
        Team team2 = new Team("Team # 2",  t2);
//получаем массив из препятствий
         Course course = new Course();
         Object [] current_course = course.getCourse();

         //прохождение полосы препятствий последовательно членами первой команды
        for(int n=0; n<4;n++) {
            Object current_member = team1.getTeamMember(n);

            //прохождение последовательно этапа препятствий из массива членом команды
            for (int i = 0; i < current_course.length; i++) {
                Object current_level = current_course[i];
                if (current_level instanceof Treadmill) {
                    if (current_member instanceof Cat){
                        //метод выводит данные последнего созданного объекта класса, а не текущего
                        current_member = (Cat)current_member;
                        ((Cat) current_member).run((Treadmill)current_level);
                    }
                    if (current_member instanceof Human){
                        current_member = (Human)current_member;
                        ((Human) current_member).run((Treadmill) current_level);
                    }
                    if (current_member instanceof Robot){
                        current_member = (Robot)current_member;
                        ((Robot) current_member).run((Treadmill) current_level);
                    }

                }
                if (current_level instanceof Wall) {
                     if (current_member instanceof Cat){
                         current_member = (Cat)current_member;
                         ((Cat) current_member).jump((Wall) current_level);
                      }
                     if (current_member instanceof Human){
                         current_member = (Human)current_member;
                         ((Human) current_member).jump((Wall) current_level);
                     }
                     if (current_member instanceof Robot){
                         current_member = (Robot)current_member;
                         ((Robot) current_member).jump((Wall) current_level);
                     }
                }

            }
        }






    }
}
