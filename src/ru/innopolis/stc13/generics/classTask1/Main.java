package ru.innopolis.stc13.generics.classTask1;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Number[] array = {2,5,8,5,6,2,5};
        MathBox mathBox = new MathBox(array);
        LinkedHashSet linkedHashSet = mathBox.splitter(8);
        System.out.println(linkedHashSet);
        System.out.println(mathBox.equals(mathBox));
        System.out.println(mathBox.summator());
        System.out.println(mathBox.toString());
        mathBox.deleteInteger(3);
        System.out.println(mathBox.toString());
        mathBox.addObject(216);
        System.out.println(mathBox.toString());
        mathBox.deleteInteger(216);
        System.out.println(mathBox.toString());
    }
}
