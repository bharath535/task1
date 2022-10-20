package For2;

public class FindmaxFactorial {
	public static void main(String[]args) {
		int[] nums= {1,20,3,4,5};
		int num1=nums[0];
		for(int i=0;i<nums.length;i++ ) {
			if(nums[i]>num1) {
				num1=nums[i];
			}
		}
		System.out.println(num1);
		int num2=num1;
		for(int i=num1;i>0;i-- ) {
			num2=num2*i;
		}
		System.out.println(num2);
	}

}
