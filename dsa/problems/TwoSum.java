import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if ((i != j) && (nums[i] + nums[j]) == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};

	}

	public int[] twoSumOpti(int[] nums, int target) {
		Map<Integer, Integer> numToIndex = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (numToIndex.containsKey(target - nums[i])) {
				return new int[] { numToIndex.get(target - nums[i]), i };
			}
			numToIndex.put(nums[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] argv) {
		int[] arr = twoSum(new int[] { 3, 2, 4 }, 6);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
