package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        //составляем 2 команды, как массив из объектов классов кошка, человек и робот
        Action_jump_run [] t1 = {new Cat("Boris",500,2),
                new Human("Joe",2000,1),
                new Cat("Garfild",1000,3),
                new Robot("Terminator",15000,5)};
        Action_jump_run [] t2 = {new Cat("Stinky",400,1),
                new Human("Sara",4000,2),
                new Human("Larry",8000,3),
                new Robot("Robocop",10000,3)};
        Team team1 = new Team("Team # 1",  t1);
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
                        //как сделать, чтобы метод вызывался для члена команды, а не для объекта класса???
                      if(!((Cat) current_member).run((Treadmill)current_level)){
                          team1.team_score= team1.team_score+((Cat) current_member).getScore();
                          break;
                      };
                        team1.team_score= team1.team_score+((Cat) current_member).getScore();
                    }

                    if (current_member instanceof Human){
                       if(! ((Human) current_member).run((Treadmill) current_level)){
                           team1.team_score= team1.team_score+((Human) current_member).getScore();
                           break;
                       };
                        team1.team_score= team1.team_score+((Human) current_member).getScore();
                    }
                    if (current_member instanceof Robot){
                        if (!((Robot) current_member).run((Treadmill) current_level)){
                            team1.team_score= team1.team_score+((Robot) current_member).getScore();
                            break;
                        };
                        team1.team_score= team1.team_score+((Robot) current_member).getScore();
                    }

                }
                if (current_level instanceof Wall) {
                     if (current_member instanceof Cat){
                         if(!((Cat) current_member).jump((Wall) current_level)){
                             team1.team_score= team1.team_score+((Cat) current_member).getScore();
                             break;
                         };
                         team1.team_score= team1.team_score+((Cat) current_member).getScore();
                      }
                     if (current_member instanceof Human){
                         if(!((Human) current_member).jump((Wall) current_level)){
                             team1.team_score= team1.team_score+((Human) current_member).getScore();
                             break;
                         };
                         team1.team_score= team1.team_score+((Human) current_member).getScore();
                     }
                     if (current_member instanceof Robot){
                         if(!((Robot) current_member).jump((Wall) current_level)){
                             team1.team_score= team1.team_score+((Robot) current_member).getScore();
                             break;
                         };
                         team1.team_score= team1.team_score+((Robot) current_member).getScore();
                     }
                }

            }
        }
        team1.TeamResult();






    }
}
