package JavaPrograms;

public class NewClass {

	public static void main(String[] args) {
	     int a[]={ 6, 0, 3, 9, 5, 1};
	        int key=9;
//	        for(int i=0; i<a.length-1; i++) {
//	        	for(int j=i+1; j<a.length-1; j++) {
//	        		if(a[i]+a[j]==key) {
//	        			
//	        			System.out.print(a[i]+" "+a[j]+" ");
//	        		}
//	        	}
//	        }
	        
//	        for(int i=0; i<a.length-1; i++) {
//	        	if(a[i]+a[i+1]==key) {
//	        		//System.out.print(a[i]+""+a[i+1]+"");
//	        		System.out.print(a[i]+"");
//	        	}
//	        }
	        
	        for(int i=0; i<a.length-1; i++) {
//        	for(int j=i+1; j<a.length-1; j++) {
        		if(a[i]+a[i+1]==key) {
//        			key=a[i]+a[i+1];
        			//System.out.print(a[i]+" "+a[i+1]+" ");
        			System.out.print(a[i]+" "+a[1+1]+" ");
//        		}
        	}
        	
        		
        }
	        
	}

}
