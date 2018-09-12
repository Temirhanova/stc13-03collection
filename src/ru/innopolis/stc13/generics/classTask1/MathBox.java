package ru.innopolis.stc13.generics.classTask1;

import ru.innopolis.stc13.generics.classTask2.ObjectBox;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class MathBox extends ObjectBox<Number> {

    public MathBox(Number[] array) {
        super(array);
    }

    public Number summator() {
        BigDecimal sum = new BigDecimal(0);
        for (Number i : set) {
            sum.add(BigDecimal.valueOf(i.doubleValue()));
        }
        return (Number) sum;
    }

    public LinkedHashSet<Number> splitter(Integer divider) {
        if (divider == 0) {
            new MathBoxExeption("Null Pointer Exeption");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet<>();
        for (Number i : set) {
            linkedHashSet.add(i.doubleValue() / (double) divider);
        }
        return linkedHashSet;
    }

    public void deleteInteger(Integer delete) {
        this.set.remove((Number) delete);
    }


}
