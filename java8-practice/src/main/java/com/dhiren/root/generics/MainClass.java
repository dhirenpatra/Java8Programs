package com.dhiren.root.generics;

import com.dhiren.root.generics.players.CricketPlayer;
import com.dhiren.root.generics.players.FootballPlayer;
import com.dhiren.root.generics.team.Team;

public class MainClass {

    static Team<CricketPlayer> cricketPlayerTeam = new Team<>("Royal Challengers Bangalore");
    static Team<CricketPlayer> cricketPlayerTeam1 = new Team<>("Team India");

    private static void addToTeamIndia() {

        CricketPlayer player1 = new CricketPlayer("Virat Kohli");
        CricketPlayer player2 = new CricketPlayer("Rohit Sharma");
        CricketPlayer player3 = new CricketPlayer("Shikar Dhawan");
        CricketPlayer player4 = new CricketPlayer("KL Rahul");
        CricketPlayer player5 = new CricketPlayer("Shreyas Iyer");
        CricketPlayer player6 = new CricketPlayer("Rishabh Pant");
        CricketPlayer player7 = new CricketPlayer("Hardik Pandya");
        CricketPlayer player8 = new CricketPlayer("Bhubaneswar Kumar");
        CricketPlayer player9 = new CricketPlayer("Jaspreet Bumrah");
        CricketPlayer player10 = new CricketPlayer("Yuzvendar Chahal");
        CricketPlayer player11 = new CricketPlayer("Ravindra Jadeja");
        CricketPlayer player12 = new CricketPlayer("Krunal Pandya");
        CricketPlayer player13 = new CricketPlayer("Navdeep Saini");
        CricketPlayer player14 = new CricketPlayer("Deepak Chahar");
        CricketPlayer player15 = new CricketPlayer("Manish Pandey");

        cricketPlayerTeam.joinTeam(player1);
        cricketPlayerTeam.joinTeam(player2);
        cricketPlayerTeam.joinTeam(player3);
        cricketPlayerTeam.joinTeam(player4);
        cricketPlayerTeam.joinTeam(player5);
        cricketPlayerTeam.joinTeam(player6);
        cricketPlayerTeam.joinTeam(player7);
        cricketPlayerTeam.joinTeam(player8);
        cricketPlayerTeam.joinTeam(player9);
        cricketPlayerTeam.joinTeam(player10);
        cricketPlayerTeam.joinTeam(player11);
        cricketPlayerTeam.joinTeam(player12);
        cricketPlayerTeam.joinTeam(player13);
        cricketPlayerTeam.joinTeam(player14);
        cricketPlayerTeam.joinTeam(player15);
    }

    private static void addToTeamRCB() {

        CricketPlayer player1 = new CricketPlayer("Virat Kohli");
        CricketPlayer player2 = new CricketPlayer("Rohit Sharma");
        CricketPlayer player3 = new CricketPlayer("Shikar Dhawan");
        CricketPlayer player4 = new CricketPlayer("KL Rahul");
        CricketPlayer player5 = new CricketPlayer("Shreyas Iyer");
        CricketPlayer player6 = new CricketPlayer("Rishabh Pant");
        CricketPlayer player7 = new CricketPlayer("Hardik Pandya");
        CricketPlayer player8 = new CricketPlayer("Bhubaneswar Kumar");
        CricketPlayer player9 = new CricketPlayer("Jaspreet Bumrah");
        CricketPlayer player10 = new CricketPlayer("Yuzvendar Chahal");
        CricketPlayer player11 = new CricketPlayer("Ravindra Jadeja");
        CricketPlayer player12 = new CricketPlayer("Krunal Pandya");
        CricketPlayer player13 = new CricketPlayer("Navdeep Saini");
        CricketPlayer player14 = new CricketPlayer("Deepak Chahar");
        CricketPlayer player15 = new CricketPlayer("Manish Pandey");

        cricketPlayerTeam1.joinTeam(player1);
        cricketPlayerTeam1.joinTeam(player2);
        cricketPlayerTeam1.joinTeam(player3);
        cricketPlayerTeam1.joinTeam(player4);
        cricketPlayerTeam1.joinTeam(player5);
        cricketPlayerTeam1.joinTeam(player6);
        cricketPlayerTeam1.joinTeam(player7);
        cricketPlayerTeam1.joinTeam(player8);
        cricketPlayerTeam1.joinTeam(player9);
        cricketPlayerTeam1.joinTeam(player10);
        cricketPlayerTeam1.joinTeam(player11);
        cricketPlayerTeam1.joinTeam(player12);
        cricketPlayerTeam1.joinTeam(player13);
        cricketPlayerTeam1.joinTeam(player14);
        cricketPlayerTeam1.joinTeam(player15);
    }

    public static void main(String[] args) {
        addToTeamIndia();
        addToTeamRCB();
        cricketPlayerTeam1.matchResult(cricketPlayerTeam,212,210);
        System.err.println(cricketPlayerTeam1.ranking());
        System.err.println(cricketPlayerTeam.ranking());
    }

}
