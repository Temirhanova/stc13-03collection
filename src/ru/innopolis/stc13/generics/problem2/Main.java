package ru.innopolis.stc13.generics.problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Line> l = new ArrayList<>();
        l.add(new Line());
        l.add(new Polygon());
        draw(l);
        List<Polygon> l2 = new ArrayList<>();
        l2.add(new Polygon());
        draw(l2);
    }

    static void draw(List<? extends Line> c) {
        for (Line i : c) {
            i.draw();
        }
    }
}
