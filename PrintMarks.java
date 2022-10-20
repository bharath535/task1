package For2;

public class PrintMarks {
	public static void main(String[]args) {
		int[] marks= {65,73,26,35,65,46,82,31,56,76,26};
		int count1=0;
		int count2=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>1&&marks[i]<50) {
				count1++;
			}
			else if(marks[i]>51&&marks[i]<100) {
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}

}
