package ru.geekbrains.lesson1;


import ru.geekbrains.lesson1.Fruits.Apple;
import ru.geekbrains.lesson1.Fruits.Box;
import ru.geekbrains.lesson1.Fruits.Orange;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[]arr = {1,2,3,4};
        System.out.println(Arrays.toString(Swap.swap(arr, 1, 2)));


        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
      //  appleBox.addFruit(new Apple());

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));

        orangeBox.pour(orangeBox1);

        System.out.println(orangeBox1);
    }
}
