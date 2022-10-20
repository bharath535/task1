package For2;

public class PrintFirstOff {
	public static void main(String[]args) {
		int[] nums= {10,11,12,13,14,15};
		for(int i=0;i<nums.length/2;i++) {
			System.out.println(nums[i]);
		}
		System.out.println(" ");
		for(int i=nums.length/2;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}