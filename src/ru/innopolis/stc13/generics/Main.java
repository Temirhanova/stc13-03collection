package ru.innopolis.stc13.generics;

import ru.innopolis.stc13.generics.generic.GenericBox;
import ru.innopolis.stc13.generics.generic.ObjectBox;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add(12);
        System.out.println(arrayList.get(1));
        Integer i = (Integer) arrayList.get(1);

        //HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mark");
        hashMap.put(2, "Jane");
        System.out.println(hashMap.get(2));

        //


    }
}
