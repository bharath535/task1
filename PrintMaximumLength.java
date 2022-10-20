package For2;

public class PrintMaximumLength {
	public static void main(String[]args) {
		String[] names= {"Bharath","Bhaskar","Boobesh","Balamurugan"};
		String word="";
		int max=0;
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>max) {
				max=names[i].length();
				word=names[i];
			}
		}
		System.out.println(word);
		String word1=names[0];
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>word1.length()) {
				word1=names[i];
			}
		}
		System.out.println(word1);
		String word2=names[0];
		for(int i=0;i<names.length;i++) {
			if(names[i].length()<word2.length()) {
				word2=names[i];
			}
		}
		System.out.println(word2);
	}

}
