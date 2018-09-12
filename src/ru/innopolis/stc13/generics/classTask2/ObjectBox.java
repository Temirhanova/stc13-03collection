package ru.innopolis.stc13.generics.classTask2;

import ru.innopolis.stc13.generics.classTask1.MathBox;

import java.util.*;

public class ObjectBox<T> {

    protected Set<T> set;

    public ObjectBox(Number[] array) {
        set = new TreeSet(new ArrayList(Arrays.asList(array)));
        if (array.length == 0) {
            new ObjectBoxExeption("На вход подан пустой массив");
        }
        if (set.size() != array.length) {
            new ObjectBoxExeption("Есть повторяющиеся элементы");
        }
    }

    public void addObject(T o) {
        set.add(o);
    }

    public void deleteObject(T o) {
        while (set.iterator().hasNext()) {
            if (set.iterator().next() == o) {
                set.remove(o);
            }
        }
    }

    public String dump() {
        return "{" + set + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectBox<?> objectBox = (ObjectBox<?>) o;
        return Objects.equals(set, objectBox.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }

    @Override
    public String toString() {
        return "{" + set + "}";
    }

}
