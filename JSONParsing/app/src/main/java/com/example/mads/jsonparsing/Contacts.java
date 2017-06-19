package com.example.mads.jsonparsing;

/**
 * Created by Mads on 14-06-2017.
 */

public class Contacts {

    private String player_name, goals, assists;

    public Contacts(String player_name, String goals, String assists) {
        this.player_name = player_name;
        this.goals = goals;
        this.assists = assists;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }
}
