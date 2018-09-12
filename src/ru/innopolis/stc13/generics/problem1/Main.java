package ru.innopolis.stc13.generics.problem1;

import ru.innopolis.stc13.generics.generic.ObjectBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(12);
        l.add(13);
        dump(l);
    }

    static void dump(Collection<?> c) {
        for (Iterator<?> i = c.iterator(); i.hasNext();) {
            Object o = i.next();
            System.out.println(o);
        }
    }
}
