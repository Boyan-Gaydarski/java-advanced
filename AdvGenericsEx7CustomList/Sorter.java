package AdvGenericsEx7CustomList;


public class Sorter<T> {

    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        for (int i = 0; i < customList.size(); i++) {
            T element = (T) customList.get(i);
            for (int j = i + 1; j < customList.size(); j++) {
                T nextElement = (T) customList.get(j);
                if (element.compareTo(nextElement) > 0) {
                    customList.swap(i, j);
                }
            }
        }
    }
}
