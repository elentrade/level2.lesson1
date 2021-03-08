package com.company;

import java.util.concurrent.Callable;

public class Treadmill implements Obstacle {
    public int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}
    //for(int n=0; n<4;n++) {
     //   Object current_member = c;

        //прохождение  этапа препятствий  членом команды из массива

              //  if (current_member instanceof Cat){
                    //метод выводит данные последнего созданного объекта класса, а не текущего
                    //как сделать, чтобы метод вызывался для члена команды, а не для объекта класса???
//                    if(!((Cat) current_member).run()){
//                        team.team_score= team.team_score+((Cat) current_member).getScore();
//                        break;
//                    };
//                    team.team_score= team.team_score+((Cat) current_member).getScore();
//                }
//
//                if (current_member instanceof Human){
//                    if(! ((Human) current_member).run()){
//                        team.team_score= team.team_score+((Human) current_member).getScore();
//                        break;
//                    };
//                    team.team_score= team.team_score+((Human) current_member).getScore();
//                }
//                if (current_member instanceof Robot){
//                    if (!((Robot) current_member).run()){
//                        team.team_score= team.team_score+((Robot) current_member).getScore();
//                        break;
//                    };
//                    team.team_score= team.team_score+((Robot) current_member).getScore();











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

