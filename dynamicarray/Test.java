package dynamicarray;

class Test {

	public static void main(String[] args) throws Exception {
		DynamicArray<Integer> numbers = new DynamicArray<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println(numbers.toString());
		numbers.removeAt(1);
		System.out.println(numbers.toString());
	}

}
