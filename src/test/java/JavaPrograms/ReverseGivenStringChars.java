package JavaPrograms;

public class ReverseGivenStringChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input may name is &&	output ym eman si
		
		String s="my name is";
		//String[] str=s.split(" ");
		char[] str = s.toCharArray();
		
		for(int i=0; i<str.length; i++) {
		Character.reverseBytes(str[i]);
	System.out.print(str[i]+"");
		}
		

	}

}
