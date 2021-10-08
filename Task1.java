package com.company;

import java.util.Arrays;

public class Task1 {
    public static void exchange ( Object[] elems, int number1, int number2){
        System.out.println("Первоначальный массив" + Arrays.toString(elems));
        try {
            Object exchange = elems [number1];
            elems [number1] = elems [number2];
            elems [number2] = exchange;
            System.out.println("Массив после замены" + Arrays.toString(elems));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив не содержит элемент(ы) " + number1 + "," +  number2);
            System.out.println("An array element is specified incorrectly. Outside of the array. Error in the line: " +  e.getMessage());
        }
    }
}
