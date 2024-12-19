package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int count;
        private int restCount;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distanceTraveled = 0;
            count = 0;
            restCount = 0;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        public String getName() {
            return name;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (count == runDuration && restCount != restDuration) {
                restCount++;
            } else {
                if (restCount == restDuration) {
                    restCount = 0;
                    count = 0;
                }
                distanceTraveled += speed;
                count++;
            }
            
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < reindeers.length; j++) {
                reindeers[j].simulateSecond();
            }
        }
        int largest = 0;
        for (int a = 1; a < reindeers.length; a++)
        {
            if (reindeers[a].getDistanceTraveled() > reindeers[largest].getDistanceTraveled()) {
                largest = a;
            }
        }
        return reindeers[largest].getName();
    }

    
    public static void main(String[] args) { // for testing purposed
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 70, 6, 1)
        };
        String winner = Day4.simulateRace(14, reindeers);
        System.out.println(reindeers[0].getDistanceTraveled());
        System.out.println(reindeers[1].getDistanceTraveled());
        System.out.println(reindeers[2].getDistanceTraveled());
    }

 
}



