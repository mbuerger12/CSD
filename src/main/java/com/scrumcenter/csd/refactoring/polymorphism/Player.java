package com.scrumcenter.csd.refactoring.polymorphism;

public class Player {
    String playerType;

    public Player(String playerType) {
        this.playerType = playerType;
    }

    public String move() {
        return switch (playerType) {
            case "Warrior" -> "Warrior moves forward";
            case "Mage" -> "Mage teleports";
            case "Rogue" -> "Rogue sneaks";
            case "Druid" -> "Druid crawls on all fours";
            default -> throw new IllegalArgumentException("Invalid player type");
        };
    }
}