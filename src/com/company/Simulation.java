package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    private ArrayList <Item> items;

    public ArrayList<Item> LoadItems (String pathname) throws Exception{
        ArrayList<Item> items = new ArrayList<Item>();
        File file = new File(pathname);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] oneItem = line.split("=");
            items.add(new Item(oneItem[0], Integer.valueOf(oneItem[1])));
        }
        return items;
    }

    ArrayList<Rocket> loadRocket1(ArrayList<Item> list) {
        ArrayList<Rocket> fleet1 = new ArrayList<>();

        return fleet1;
    }

    ArrayList<Rocket> loadRocket2 (ArrayList<Item> list) {
        ArrayList<Rocket> fleet2 = new ArrayList<>();

        return fleet2;
    }

    int runSimulation(ArrayList<Rocket> list){
        int fail = 0;
        int success = 1;

        int budget = list.get(0).cost * (list.size() + fail);
        System.out.println(" " + fail + " " + success + " ");
        return budget;
    }
}
