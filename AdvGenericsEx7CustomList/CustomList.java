package AdvGenericsEx7CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList <T extends Comparable<T>> {

    private List<T> values;

    public CustomList() {

        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    public T remove(int index) {
       return this.values.remove(index);
    }

    public boolean contains(T element) {
        if (this.values.contains(element)) {
            return true;
        }
        return false;
    }

    public void swap(int firstIndex, int secondIndex) {
        Collections.swap(this.values, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T value : this.values) {
            if (value.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMin() {
        T min = this.values.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(IllegalArgumentException::new);
        return min;
    }

    public T getMax() {
        T max = this.values.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(IllegalArgumentException::new);
        return max;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            sb.append(value);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public int size() {
        return this.values.size();
    }

    public T get(int index) {
        return this.values.get(index);
    }
}
