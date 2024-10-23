package JavaPrograms;

public class AccessNonStaticMemberInsideClass {
	/** @author Jyoti Jogur
	 * Accessing the class members: Accessing the non static member in side a same class.
	 * variable or non static members: a, b,and sum();
	 */
	int a=10, b=20;
	void sum() {
		System.out.println("Sum of a and b is ="+(a+b));
	}
	
	public static void main(String[] args) {
		
		/** @author Jyoti Jogur
		* By Creating an Class object and using a object reference we can access directly.
		 * Non-static member: a, b and sum();
		 * Syntax: Class_Name identifier=new  Class_Name();
		 */
		AccessNonStaticMemberInsideClass nonStatic=new AccessNonStaticMemberInsideClass();
		nonStatic.sum();
	}

}
