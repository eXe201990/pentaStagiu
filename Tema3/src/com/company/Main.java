package com.company;

public class Main {

    public static void main(String[] args) {

        CharacterFactory characterFactory = new CharacterFactory();

        Player player1 = characterFactory.getPlayer("Human");
        Player player2 = characterFactory.getPlayer("Monster");
        Player player3 = characterFactory.getPlayer("Animal");
        ArtifactEnergy artifactEnergy = new ArtifactEnergy();
        ArtifactHealth artifactHealth = new ArtifactHealth();


        Map map = new Map();

        map.updateMap(player1.getPossitionX(), player1.getPossitionY(), "H");
        map.updateMap(player1.getPossitionX(), player1.getPossitionY(), "M");
        map.updateMap(player1.getPossitionX(), player1.getPossitionY(), "A");

        boolean free = true;
        while (free) {
            if (map.checkFreeSpace(artifactEnergy.getPossitionX(), artifactEnergy.getPossitionY())) {

                map.updateMap(artifactEnergy.getPossitionX(), artifactEnergy.getPossitionY(), "e");
                free = false;
            } else {
                artifactEnergy.setPosition();
            }

            free = true;
            while (free) {
                if (map.checkFreeSpace(artifactHealth.getPossitionX(), artifactHealth.getPossitionY())) {
                    map.updateMap(artifactHealth.getPossitionX(), artifactHealth.getPossitionY(), "h");
                    free = false;
                } else {
                    artifactHealth.setPossition();
                }
            }

            Gameplay gameplay = new Gameplay( artifactEnergy,artifactHealth, player1, player2, player3 ,map);
            gameplay.play();
        }
    }
}
