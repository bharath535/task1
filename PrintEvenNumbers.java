package For2;

public class PrintEvenNumbers {
	public static void main(String[]args) {
		int[] nums=new int[6];
		nums[0]=11;
		nums[1]=23;
		nums[2]=30;
		nums[3]=43;
		nums[4]=55;
		nums[5]=62;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println("Even Numbers is "+nums[i]);
			}
		}
	}

}
