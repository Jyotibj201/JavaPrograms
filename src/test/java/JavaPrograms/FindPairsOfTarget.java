package JavaPrograms;

public class FindPairsOfTarget {

	public static void main(String[] args) {
		int a[]={ 6, 0, 3, 9, 5, 1};
        int key=9;
        for(int i=0; i<a.length-1; i++) {
        	for(int j=i+1; j<a.length-1; j++) {
        		if(a[i]+a[j]==key) {
        			
        			System.out.print(a[i]+" "+a[j]+" ");
        		}
        	}
        }

	}

}
