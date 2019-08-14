package com.dhiren.root.generics.league;

import com.dhiren.root.generics.team.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IPLT20League<T extends Team>{

    private String name;
    private List<T> league = new ArrayList<>();

    public IPLT20League(List<T> league) {
        this.league = league;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if(league.size() > 8) {
            System.err.println("League is already full");
            return false;
        } else if(league.contains(team)) {
            System.err.println(team.getTeamName() + " has already been joined the League");
            return false;
        } else {
            league.add(team);
            System.out.println(team.getTeamName() + " has successfully joined the team");
            return true;
        }
    }
    public void showLeagueTable() {
        league.sort(Comparator.comparing(Team::ranking));
        for(Team t : league) {
            System.out.println(t);
        }
    }
}
