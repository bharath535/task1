package For2;

public class DivisibleBy2 {
	public static void main(String[]args) {
		int[] num= {10,20,30,40,50,60};
		for(int i=0;i<num.length;i++) {
			if((num[i]%2==0)&&(num[i]%3==0)) {
				System.out.println(num[i]+"is Divide by2&3");
			}
			else {
				System.out.println(num[i]+"is not Divide by2&3"); 
			}
		}
	}

}
