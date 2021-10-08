package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Box <T extends Fruit> implements Comparable<Box<? extends Fruit>>{
    private ArrayList<T> fruits = new ArrayList<>();
    String appleFruit = "Apple";
    String orangeFruit = "Orange";

    public float getWeight() {
        float weight = 0.0f;
        float boxSize = fruits.size()-1;
        if (fruits.isEmpty()){
            weight = 0.0f;
        }
        if (!fruits.isEmpty()){
            if(analyzeClass(fruits.get(0)).equals(orangeFruit)){
                weight=(com.company.Orange.orangeWeight)*boxSize;
            }
             else if(analyzeClass(fruits.get(0)).equals(appleFruit)){
                weight=(com.company.Apple.appleWeight)*boxSize;
            }
        } System.out.println(weight);
        return weight;
    }

    public void add (T fruit) {
        if (fruits.isEmpty()) {
            fruits.add(fruit);}
        if (!fruits.isEmpty()) {
            if(fruit.getClass() == (fruits.get(0)).getClass()) {
                fruits.add(fruit);
            }
            else System.out.println("In this box, you can put only " + analyzeClass(fruits.get(0)));
        }
    }


    public  String analyzeClass(Object o) {
        Class<? extends Object> clazz = o.getClass();
        StringBuilder str = new StringBuilder(String.valueOf(clazz));
        str.delete(0, 18);
        String analyze = str.toString();
        return analyze;
    }

    public boolean compare (Box other) {
        if(getWeight() == other.getWeight()) {
            System.out.println("Вес коробок совпадает");
            return true;
        }
        else {
            System.out.println("Вес коробок не совпадает");
        return false;
        }
    }
    public void pourTo(Box <T> other){
        other.getFruits().addAll(fruits);
        fruits.clear();
    }

    private Collection<T> getFruits() {
        return fruits;

    }

    @Override
    public int compareTo(Box other) {
        return Float.compare(getWeight(), other.getWeight());
    }
}





