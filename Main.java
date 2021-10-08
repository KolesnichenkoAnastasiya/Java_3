package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7};
        String[] array2 = {"Первый", "Второй", "Третий", "Четвертый", "Пятый"};

        Task1.exchange(array1, 2, 9);/* проверка при ошибочном вводе значения,
         выходящего за пределы массива*/
        Task1.exchange(array2, 2, 3);

        Task2.convertingArrayToArrayList(array2);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.add(apple1);
        box1.add(apple2);
        box1.add(apple3);
        box1.add(orange1);
        box2.add(orange1);
        box2.add(orange2);
        box2.add(orange3);

        box1.getWeight();
        box2.getWeight();
        box3.getWeight();
        box1.compare(box2);

        box1.pourTo(box3);
        box1.getWeight();
        box3.getWeight();
   }
}






