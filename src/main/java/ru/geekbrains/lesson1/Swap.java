package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Swap {

    public static  <T> T[] swap(T[] arr, int first, int second){
        T f = arr[first];
        arr[first] = arr[second];
        arr[second] = f;
        return arr;
    }

    public static <T> List<T> arrToList(T[]arr){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
