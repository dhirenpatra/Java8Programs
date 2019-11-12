package com.dhiren.root.generics.udemy.team;

import com.dhiren.root.generics.udemy.players.Player;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String teamName;
    private int played;
    private int lost;
    private int tied;
    private int won;

    private List<T> teamPlayers = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean joinTeam(T player) {
        if (teamPlayers.size() > 16) {
            System.out.println(getTeamName() + " squad is already full");
            return false;
        } else if (teamPlayers.contains(player)){
            System.out.println(player.getName() + " is already been added into the squad");
            return false;
        } else {
            teamPlayers.add(player);
            System.out.println(player.getName() + " is successfully added into the squad");
            return true;
        }
    }

    public int getNoOfPlayers() {
        return teamPlayers.size();
    }

    public void matchResult(Team<T> opponentTeam, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if (opponentTeam != null) {
            opponentTeam.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
