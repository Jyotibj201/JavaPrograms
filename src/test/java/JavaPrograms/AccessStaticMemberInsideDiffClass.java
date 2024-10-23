package JavaPrograms;
import static JavaPrograms.AccessStaticMemberInsideClass.*;
public class AccessStaticMemberInsideDiffClass {

	public static void main(String[] args) {
		/** @author Jyoti Jogur
		 * Accessing the class members: Accessing the static member in side a different class.
		 * static method: details(); and static member: name;
		 * Ex: ClassName.memberName; or ClassName.methodName();
		 */
	AccessStaticMemberInsideClass.details();
	System.out.println(AccessStaticMemberInsideClass.name);
	
	/** @author Jyoti Jogur
	* By Creating an Class object and using a object reference we can access directly.
	 * Non-static member: age;
	 */
	AccessStaticMemberInsideClass  abc=new AccessStaticMemberInsideClass();
	System.out.println(abc.age);

		
//		/**
//		 * Importing the class it self as static refer below code to avoid object creation
//		 * import static JavaPrograms.AccessStaticMemberInsideClass.*;
//		 */
//		details();
//		System.out.println(name);
		
		
	}

}
