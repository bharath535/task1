package For2;

public class FindPositiveNegativeCount {
	public static void main(String[]args) {
		int[] nums= {10,-20, 30,-40,-50};
		int num1=0;
		int num2=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				num1++;
			}
			else if(nums[i]<0) {
				num2++;
			}
		}
		System.out.println(num1);
		System.out.println(num2);
	}

}
