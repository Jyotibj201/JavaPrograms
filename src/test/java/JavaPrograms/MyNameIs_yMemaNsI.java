package JavaPrograms;

public class MyNameIs_yMemaNsI {

	public static void main(String[] args) {
		String s="My name is jyoti I am joining Capgemini";

		String[] words = s.split(" ");
		
		for(String word:words) {
			String revWord=" ";
			
			for(int i=word.length()-1; i>=0; i--) {
				revWord = revWord+word.charAt(i);
			}
			
			System.out.print(revWord);
		}

	}

}
