package com.company;

public class Team {
    public String team_name;
    public Action_jump_run[]t; //массив участников
    public int team_score=0; //результат команды
    public Team (String team_name, Action_jump_run[] t){
        this.team_name = team_name;
        this.t = t;
    }
    public Action_jump_run[] getTeam(){  return  t; } //вернуть массив участников
    public Object getTeamMember(int i){ return  t[i];  } //вернуть члена команды
    public String getTeam_name(){
        return  team_name;
    } //вернуть название команды
    //public String getNameTeamMember(int i){ return  t[i].Name  } //как вернуть имя члена команды??????
    public void TeamResult(){

        System.out.println("Total team`s result is "+ team_score);
    }
    }









