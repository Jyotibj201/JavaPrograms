package JavaPrograms;

public class AccessNonStaticMemberInDiffClass {
	int d=20;
	int mul;
	int  mul(int value1, int value2) {
		mul=value1*value2;
		return mul;
	}
	
	public static void main(String[] args) {

		/** @author Jyoti Jogur
		 * Accessing the class members: Accessing the non-static member in side a different class.
		 * non static method: sum(); and non-static member: a and b; from different class
		 */
		AccessNonStaticMemberInsideClass nonStatic=new AccessNonStaticMemberInsideClass();
		int c=10;
		System.out.println(c+nonStatic.a);//20, (sum=c+a), (20=10+10)
		nonStatic.sum();//Ans:30 (Sum=a+b), (30=10+20)

		/**
		 * non static method: mul(); and non-static member: a and b; from inside class
		 */
		AccessNonStaticMemberInDiffClass nonstaticmem=new AccessNonStaticMemberInDiffClass();
		System.out.println(nonstaticmem.mul(c, nonstaticmem.d)); //Ans:200, (mul=c*d),  (200=10*20)
	}

}
