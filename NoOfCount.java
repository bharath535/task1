package For2;

public class NoOfCount {
	public static void main(String[]args) {
		String[] words= {"Laptops","Mouse","Monitors","Cpu","Keyboards","printer","Webcams"};
		int count1=0;
		int count2=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].endsWith("s")) {
				count1=count1+1;
			}
			else {
				count2++;
			}
		}
		System.out.println("Plural Count = "+count1);
		System.out.println("Singular Count = "+count2);
	}
}