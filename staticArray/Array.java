package staticArray;

public class Array<T> {
    private T[] items;
    private int len = 0;
    private int capacity = 0;

    Array(int capacity) {
        this.capacity = capacity;
        items = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if (isFull())
            throw new Error("Array is full");

        items[len++] = item;
    }

    public void remove() {
        if (isEmpty())
            throw new Error("Array is empty");

        items[--len] = null;
    }
    
    public void insertAt(int index, T item) {
        if (isFull())
            throw new Error("Array is full");

        items[index] = item;
    }
    
    public void removeAt(int index) {
        for (int i = index; i < len; i++) {
            items[i] = items[i + 1];
        }

        len--;
    }
    
    public boolean isEmpty() {
        return len == 0 ? true : false;
    }

    public boolean isFull() {
        return len == capacity ? true : false;
    }

    @Override
    public String toString(){
        if (isEmpty())
            return "[]";

        StringBuilder builder = new StringBuilder().append("[");
        for (int i = 0; i < len - 1; i++) {
            builder.append(items[i] + ", ");
        }
        return builder.append(items[len - 1] + "]").toString();
    }
}
