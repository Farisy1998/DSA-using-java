package dynamicarray;

public class DynamicArray<T> {

	private T[] array;
	private int len = 0;
	private int capacity = 0;

	public DynamicArray() throws IllegalAccessException {
		this(4);
	}

	public DynamicArray(int capacity) throws IllegalAccessException {
		if (capacity <= 0)
			throw new IllegalArgumentException("Invalid capacity");
		
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
	}

	public void add(T obj) {
		if(len == capacity)
			capacity *= 2;

		T[] newArray = (T[]) new Object[capacity];

		for (int i = 0; i < len; i++)
			newArray[i] = array[i];

		array = newArray;

		array[len++] = obj;
	}

	public T remove(T obj) throws Exception {
		int rmIndex = indexOf(obj);
		if (rmIndex < 0)
			throw new Exception("Element doesn't exist");
		return removeAt(rmIndex);
	}

	public int indexOf(T obj) {
		for (int i = 0; i < len; i++) {
			if (array[i] == obj)
				return i;
		}
		return -1;
	}

	public T removeAt(int rmIndex) {
		if (rmIndex < 0 || rmIndex >= len)
			throw new IllegalArgumentException("Invalid index");
		for (int i = rmIndex; i < len - 1; i++)
			array[i] = array[i + 1];

		len--;
		return array[rmIndex];
	}

	public int size() {
		return len;
	}

	public T get(int index) {
		if (index >= len || index < 0)
			throw new ArrayIndexOutOfBoundsException();
		return array[index];
	}

	public void set(int index, T obj) {
		if (index >= len || index < 0)
			throw new ArrayIndexOutOfBoundsException();
		array[index] = obj;
	}

	public int length() {
		return len;
	}

	@Override
	public String toString() {
		if (len == 0)
			return "[]";
		StringBuilder builder = new StringBuilder(len).append("[");

		for (int i = 0; i < len - 1; i++)
			builder.append(array[i] + ", ");

		return builder.append(array[len - 1] + "]").toString();
	}
}
