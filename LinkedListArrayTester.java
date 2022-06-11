package collections.arrays;

public class LinkedListArrayTester {
	/** Tester*/
	public static void main(String[] args) {
		LinkedListArray<Integer> nums = new LinkedListArray<Integer>(4);
		nums.offerFirst(1,3);
		nums.offerFirst(3,5);
		nums.offerFirst(1,3);
		nums.offerFirst(2,6);
		nums.offerFirst(1,3);
		nums.offerFirst(3,5);
		nums.offerFirst(1,3);
		nums.offerFirst(3,5);
		nums.offerFirst(1,3);
		nums.offerFirst(3,5);
		nums.offerFirst(1,3);
		nums.offerFirst(3,5);
		nums.offerFirst(1,3);
		nums.offerFirst(3,5);
		nums.add(1, 3, 6);
		System.out.println(nums);
	}
}
