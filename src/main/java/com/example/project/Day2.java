
package com.example.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[] naughty = new String[names.length];
        String[] nice = new String[names.length];
        int random;
        for (int i = 0; i < names.length; i++) {
            random = (int) (Math.random() * 2);
            if (random == 0) {
                naughty[i] = names[i];
            } else {
                nice[i] = names[i];
            }
        }
        String[][] output = {nice, naughty};
        return output; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}