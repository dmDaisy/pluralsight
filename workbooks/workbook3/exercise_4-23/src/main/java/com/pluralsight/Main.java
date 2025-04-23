package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Product> inventory = new ArrayList<>();

    public static void main(String[] args) {
        loadInventory();

        for(Product product : inventory){
            System.out.println(product);
        }
    }

    public static void loadInventory(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String input;
            while((input = bufferedReader.readLine()) != null){
                String[] fields = input.split("\\|");
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                Float price = Float.parseFloat(fields[2]);

                Product product = new Product(id, name, price);
                inventory.add(product);
            }

        } catch(Exception e){
            throw new RuntimeException(e);
        }


    }
}