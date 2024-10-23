package JavaPrograms;

public class FindVowelsCountGivenString {

	public static void main(String[] args) {
//		String vowels="vowels";
//		char[] varray= vowels.toCharArray();
//		int vcount=0;
//		for(int i=0; i<vowels.length(); i++) {
//			if(vowels.charAt(i)=='a' || vowels.charAt(i)=='e' || vowels.charAt(i)=='i' || vowels.charAt(i)=='u' ||vowels.charAt(i)=='o' ) {
//				vcount++;
//			}
//			System.out.print(vowels.charAt(i)+""+vcount+" ");
//		}

		String s = "prepinsta";
		
		char[] c = s.toCharArray();
		int vowel=0;
		
		for (int i = 0; i < s.length(); i++) { 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
                vowel++;
            System.out.print("Vowels: " + s.charAt(i)+""+vowel);
		}
  
//	System.out.println("Vowels: " + vowel);
	}

}
