package AdvIteratorsAndComparatorsEx1ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.size() != 0) {
            this.index = 0;
        } else {
            this.index = -1;
        }
    }


    public boolean move() {
        if (this.index < data.size() - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public String print() {
        if (index == -1) {
            return "Invalid Operation!";
        } else {
            return this.data.get(this.index);
        }
    }
    public boolean hasNext() {
        if (this.index < data.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < data.size();
            }

            @Override
            public String next() {
                return data.get(this.index++);
            }
        };
    }
}

