package com.company;

public class Team {
    public String team_name;
    public Object []t;
    public int team_score=0;
    public Team (String team_name, Object[] t){
    this.team_name = team_name;
    this.t = t;
    }
    public Object[] getTeam(){
        return  t;
    }
    public Object getTeamMember(int i){
        return  t[i];
    }
    public String getTeam_name(){
        return  team_name;
    }



}
