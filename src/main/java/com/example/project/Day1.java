package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        int random = (int) (Math.random() * 5);
        if (name == null || name == "") {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return elf_names[random] +  " " + name;
    }
}