
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author avnis
 */
public class Team {

    private String teamName;
    private int teamSize;
    private ArrayList<Player> player;

    public Team(String name) {
        this.teamName = name;
        this.teamSize = 16;
        this.player = new ArrayList<Player>();
    }

    public String getName() {
        return teamName;
    }

    public void addPlayer(Player player) {
        if (this.player.size() < this.teamSize) {
            this.player.add(player);
        }
    }

    public int size() {
        return this.player.size();
    }
    public int goals() {
        int totalGoals=0;
        for (Player player1 : player) {
            totalGoals += player1.goals();
        }
        return totalGoals;
    }

    public void setMaxSize(int maxSize) {
        this.teamSize = maxSize;
    }

    public void printPlayers() {
        String playerName = "";
        int goals;
        for (Player player1 : player) {
            playerName = player1.getName();
            goals = player1.goals();
            System.out.println(playerName + ", goals " + goals);
        }

    }

}
