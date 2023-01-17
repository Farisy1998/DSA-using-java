package bubbleSort;

public class Array{
    private int[] numbers;
    private int len = 0;
    private int capacity = 0;

    Array(int capacity) {
        this.capacity = capacity;
        numbers = new int[capacity];
    }

    public void add(int number) {
        if (isFull())
            throw new Error("Array is full");

        numbers[len++] = number;
    }

    public void remove() {
        if (isEmpty())
            throw new Error("Array is empty");

        numbers[--len] = 0;
    }

    public void sort() {
        // bubble sort algorithm
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public int length(){
        return len;
    }
    
    public boolean isFull() {
        return len == capacity ? true : false;
    }

    public boolean isEmpty() {
        return len == 0 ? true : false;
    }

    @Override
    public String toString() {
        if (isEmpty())
            throw new Error("Array is empty");
        
        StringBuilder builder = new StringBuilder().append("[");
        for (int i = 0; i < len - 1; i++) {
            builder.append(numbers[i] + ", ");
        }
        return builder.append(numbers[len - 1] + "]").toString();
    }
}