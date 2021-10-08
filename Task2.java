package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void convertingArrayToArrayList(Object[] elem) {
        ArrayList <Object>  list = new ArrayList<>();
        Collections.addAll(list, elem);
        System.out.println("Массив преобразован в ArrayList list" + list);
    }
}
