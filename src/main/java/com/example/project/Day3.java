package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int a = 0; a < size; a++) {
          for (int b = 0; b < size; b++) {
            grid[a][b] = " ";
          }
        } 
        for (int i = 0; i < size; i++) {
          grid[i][i] = "*";
        }
        for (int j = 0; j < size; j++) {
          grid[j][size - 1 - j] = "*";
        }
        for (int k = 0; k < size; k++) {
          grid[(size/2)][k] = "*";
          grid[k][(size/2)] = "*";
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      int size = 7; // Small odd size
      String[][] snowflake = Day3.generateSnowflake(size);
      System.out.println(snowflake);
      for (int i = 0; i < size; i++){
        for (int j = 0; j < size; j++)
            System.out.print(snowflake[i][j]);
          System.out.println();
      }
    }
}
