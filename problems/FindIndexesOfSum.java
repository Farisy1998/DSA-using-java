package problems;
import java.awt.Label;
import java.util.HashMap;
import java.util.Map;

public class FindIndexesOfSum {

	public static void main(String[] args) {
		// numbers = [7, 6, 3, 8, 2];
		// target = 14

		// int[] numbers = { 7, 6, 3, 8, 2 };
		// int target = 14;
		// int i = 0, j = 0;
		//
		// long startTime = System.currentTimeMillis();
		// while (i < numbers.length) { // O(n)
		// j = i + 1;
		// while (j < numbers.length) {	// O(
		// int result = numbers[i] + numbers[j];
		//
		// if (result == target) {
		// System.out.println("Indexes are: (" + i + ", " + j + ")");
		// break;
		// }
		// result = 0;
		// j++;
		// }
		// i++;
		// }
		// long endTime = System.currentTimeMillis();
		//
		// System.out.println("Time taken: " + (endTime - startTime));

		// -----------------------------------------------------------------------------------

		// More optimized way

		Map<Integer, Integer> map = new HashMap<>();
		int[] numbers = { 7, 6, 3, 8, 2 };
		int target = 14;
		int firstIndex = 0, secondIndex = 0;

		for (int i = 0; i < numbers.length - 1; i++) {
			int result = target - numbers[i];
			if (map.containsKey(result)) {
				firstIndex = map.get(result);
				secondIndex = i;
			}
			map.put(numbers[i], i);
		}

		System.out.println("Indexes are: (" + firstIndex + ", " + secondIndex + ")");
	}

}
