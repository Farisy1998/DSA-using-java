package dynamicArray;

class Test {

	public static void main(String[] args) throws Exception {
		DynamicArray<Integer> numbers = new DynamicArray<>(1);

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println(numbers.toString());
		numbers.removeAt(1);
		numbers.removeAt(0);
		System.out.println(numbers.toString());
		System.out.println(numbers.length());
	}

}
