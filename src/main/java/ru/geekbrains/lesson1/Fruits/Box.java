package ru.geekbrains.lesson1.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitList;

    public Box() {
        fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        float weight = 0;
        for (T t : fruitList) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }

    public void pour(Box<T> box){
        if (this == box){
            return;
        }
        for (T t : this.fruitList){
            box.fruitList.add(t);
        }
        this.fruitList.clear();
    }

}
