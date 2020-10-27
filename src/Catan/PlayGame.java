package Catan;

import javafx.scene.paint.Color;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Objects;

public class PlayGame {
    static ArrayList<Player> players = new ArrayList<>();
    static Player longestRoadPlayer = null;
    static int longestRoad = 4;

    public static void main(String[] args) {
        players.add(new Player("Player 1", Color.RED));
        players.add(new Player("Player 2", Color.BLUE));

        checkForVictor();

        if(longestRoadPlayer != checkLongestRoad()){
            longestRoadPlayer.setVictoryPoints(longestRoadPlayer.getVictoryPoints() - 2);
            longestRoadPlayer = checkLongestRoad();
            longestRoadPlayer.setVictoryPoints(longestRoadPlayer.getVictoryPoints() + 2);
        }

        checkForVictor();

    }

    private void moveRobber(Tile tile, Player stealFrom){
        if (stealFrom == null){
            System.out.println("you stole from no one");
        } else {

        }
    }

    private static double rollDice(){
        return Math.round((Math.random()*6) + 0.5);
    }


    private static Player checkLongestRoad(){
        Player retPlayer = longestRoadPlayer;
        for (Player player : players) {
            if (player.getLongestRoadLength() > longestRoad) {
                retPlayer = player;
                longestRoad = player.getLongestRoadLength();
            }
        }
        return retPlayer;
    }

    private static void checkForVictor(){
        System.out.println(Objects.requireNonNull(victor()).name + " is the winner!!");
    }

    private static Player victor(){
        for (Player player : players) {
            if(player.getVictoryPoints() >= 10){
                return player;
            }
        }
        return null;
    }
} 