package com.company;

public class Wall implements Obstacle {
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

//        for(int n=0; n<4;n++) {
//            Object current_member = team.getTeamMember(n);
//            //прохождение  этапа препятствий  членом команды из массива
//
//            if (current_member instanceof Cat){
//                //метод выводит данные последнего созданного объекта класса, а не текущего
//                //как сделать, чтобы метод вызывался для члена команды, а не для объекта класса???
//                if(!((Cat) current_member).jump()){
//                    team.team_score= team.team_score+((Cat) current_member).getScore();
//                    break;
//                };
//                team.team_score= team.team_score+((Cat) current_member).getScore();
//            }
//
//            if (current_member instanceof Human){
//                if(! ((Human) current_member).jump()){
//                    team.team_score= team.team_score+((Human) current_member).getScore();
//                    break;
//                };
//                team.team_score= team.team_score+((Human) current_member).getScore();
//            }
//            if (current_member instanceof Robot){
//                if (!((Robot) current_member).run()){
//                    team.team_score= team.team_score+((Robot) current_member).getScore();
//                    break;
//                };
//                team.team_score= team.team_score+((Robot) current_member).getScore();










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

