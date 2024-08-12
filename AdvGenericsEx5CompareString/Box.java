package AdvGenericsEx5CompareString;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            sb.append(String.format("%s: %s", value.getClass().getName(), value));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public int compare(T comparator) {
        int count = 0;
        for (T value : this.values) {
            if (value.compareTo(comparator) > 0) {
                count++;
            }
        }
        return count;
    }
}
