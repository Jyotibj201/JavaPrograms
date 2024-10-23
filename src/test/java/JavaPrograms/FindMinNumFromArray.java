package JavaPrograms;

public class FindMinNumFromArray {

	public static void main(String[] args) {
		int array[]= {153, 61, 761, 871, 213};
		int min=array[0];
		
		for(int i=0; i<array.length-1; i++) {
			if(min> array[i]) {
				min=array[i];
			}

		}
		System.out.print(min);
	}

}
