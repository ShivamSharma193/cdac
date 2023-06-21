
public class RemoveDupsFromSortedArray {
	public static int removeDups(int[] nums) {
		int[] uniqueArray = new int[nums.length];
		int[] dupsArray = new int[nums.length];

		int uniqueArrIndex = 0;
		int dupArrIndex = 0;

		int currentIndex = 0;

		while (currentIndex < nums.length) {
			uniqueArray[uniqueArrIndex++] = nums[currentIndex];
			int forwardIndex = currentIndex;

			while (++forwardIndex < nums.length && nums[forwardIndex] == nums[currentIndex]) {
				dupsArray[dupArrIndex++] = nums[forwardIndex];
			}
			currentIndex = forwardIndex;
		}
		uniqueArrIndex--;
		dupArrIndex--;
		for (int i = 0; i < uniqueArrIndex; i++) {
			nums[i] = uniqueArray[i];
		}
		for (int i = uniqueArrIndex; i < (uniqueArrIndex + dupArrIndex); i++) {
			nums[i] = dupsArray[i];
		}
		return uniqueArrIndex;
	}

	public static int removeDuplicates(int[] arr) {
		int backIndex = 0;
		for (int forwardIndex = 1; forwardIndex < arr.length; forwardIndex++) {
			if (arr[backIndex] != arr[forwardIndex]) {
				backIndex++;
				arr[backIndex] = arr[forwardIndex];
			}
		}
		return backIndex + 1;

	}

	public static void main(String[] argv) {
		int[] nums = { 1, 1, 2 }; // Input array
		int[] expectedNums = { 1, 2 }; // The expected answer with correct length

		int k = removeDuplicates(nums); // Calls your implementation

		if (k != expectedNums.length) {
			System.out.println("Length Incorrect");
		}

		for (int i = 0; i < k; i++) {
			if (nums[i] != expectedNums[i]) {
				System.out.println("Incorrect code");
			}
		}

	}

}
