package Catan;

import javafx.scene.paint.Color;

public class Player {
    String name;
    Color color;
    int victoryPoints = 0;
    int longestRoadLength = 0;
    int knightsPlayed = 0;
    int currentSheep = 0;
    int currentRock = 0;
    int currentWood = 0;
    int currentBrick = 0;
    int currentWheat = 0;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void setSheepValue(int value) {
        currentSheep = value;
    }

    public void setRockValue(int value) {
        currentRock = value;
    }

    public void setWoodValue(int value) {
        currentWood = value;
    }

    public void setBrickValue(int value) {
        currentBrick = value;
    }

    public void setWheatValue(int value) {
        currentWheat = value;
    }

    public void setLongestRoadLength(int value) {
        longestRoadLength = value;
    }

    public void setVictoryPoints(int value) {
        victoryPoints = value;
    }

    public int getSheep() {
        return currentSheep;
    }

    public int getRock() {
        return currentRock;
    }

    public int getWood() {
        return currentWood;
    }

    public int getBrick() {
        return currentBrick;
    }

    public int getWheat() {
        return currentWheat;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public int getLongestRoadLength() {
        return longestRoadLength;
    }

    public int getKnightsPlayed() {
        return knightsPlayed;
    }
}