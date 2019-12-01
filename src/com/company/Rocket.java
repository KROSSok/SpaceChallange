package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Rocket implements SpaceShip {
    int cost;
    int weight;
    int maxWeight;
    double chanceLaunchExp;
    double chanceLandExp;
    int currentWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return this.currentWeight + item.weight <= maxWeight;
    }

    public int carry(Item item) {
        this.currentWeight += item.weight;
        return this.currentWeight;
    }
}

class Rocket1 extends Rocket{
    public Rocket1() {
        cost = 100;
        weight = 10000;
        maxWeight = 18000;
        chanceLaunchExp = 5.00;
        chanceLandExp = 1.00;
        currentWeight = weight;
    }

    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        double launchExplosion;
        launchExplosion = chanceLaunchExp * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return launchExplosion <= random;
    }

    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        double landingCrash;
        landingCrash = chanceLandExp * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return landingCrash <= random;
    }
}

class Rocket2 extends Rocket{
    public Rocket2() {
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        chanceLaunchExp = 4.00;
        chanceLandExp = 8.00;
        currentWeight = weight;
    }

    public boolean launch() {
        int random = (int)(Math.random() * 100 + 1);
        double launchExplosion;
        launchExplosion = chanceLaunchExp * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return launchExplosion <= random;
    }

    public boolean land() {
        int random = (int)(Math.random() * 100 + 1);
        double landingCrash;
        landingCrash = chanceLandExp * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return landingCrash <= random;
    }
}


       /* Rocket cost = $100 Million
        Rocket weight = 10 Tonnes
        Max weight (with cargo) = 18 Tonnes
        Chance of launch explosion = 5% * (cargo carried / cargo limit)
        Chance of landing crash = 1% * (cargo carried / cargo limit)

        Rocket cost = $120 Million
        Rocket weight = 18 Tonnes
        Max weight (with cargo) = 29 Tonnes
        Chance of launch explosion = 4% * (cargo carried / cargo limit)
        Chance of landing crash = 8% * (cargo carried / cargo limit) */