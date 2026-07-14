// Subtopic: Generics - Pair, Stack, FindMax, Repository, and Wildcards
import java.util.ArrayList;
import java.util.List;

class Pair<T, U> {
    private T first;
    private U second;
    public Pair(T first, U second) { this.first = first; this.second = second; }
    public T getFirst() { return first; }
    public U getSecond() { return second; }
}

class Stack<T> {
    private List<T> elements = new ArrayList<>();
    public void push(T item) { elements.add(item); }
    public T pop() { return elements.isEmpty() ? null : elements.remove(elements.size() - 1); }
}

class Repository<T> {
    private List<T> items = new ArrayList<>();
    public void add(T item) { items.add(item); }
    public List<T> getAll() { return items; }
}

public class GenericFundamentals {
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) return null;
        T max = arr[0];
        for (T item : arr) {
            if (item.compareTo(max) > 0) max = item;
        }
        return max;
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}