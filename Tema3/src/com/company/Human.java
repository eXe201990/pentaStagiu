package com.company;

public  class Human extends Character implements Player {

    Human(){}

    Human(String name ,int energy, int health, int possitionX, int possitionY, Artifact artifact){
        super(name, energy, health , possitionX , possitionY);
        switch (artifact){
            case ENERGY:
                setEnergy(getEnergy() + artifact.getPoints());
                break;
            case HEALTH:
                setHealth(getHealth() + artifact.getPoints());
                break;
            default:return;
        }
    }


    @Override
    public int getPossitionY() {
        return 0;
    }

    @Override
    public void setPossitionY(int possitionY) {

    }

    public int attack(int enemyHealth) {
        while (getEnergy() >= 5) {
            setEnergy(getEnergy() - 5);
            enemyHealth -= 10;
            if (enemyHealth <= 0) {
                return 1;
            }
        }

        return 0;
    }

    public String toString(){
        return "Human name " + getName() + " Health " + getHealth() + " energy " + getEnergy();

    }
}

