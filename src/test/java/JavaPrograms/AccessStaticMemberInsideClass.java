package JavaPrograms;

public class AccessStaticMemberInsideClass {
	/** @author Jyoti Jogur
	 * Accessing the class members: Accessing the static member in side a same class.
	 * 1. static method: details(); and static member: name;
	 */
	static String name="Jyoti S J";
	static void  details() {
		System.out.println("Jyoti details");
	}

	/**
	 * Non-static member: age;
	 */
	int age=28;

	public static void main(String[] args) {
		
		/** @author Jyoti Jogur
		 * By using a name we can access directly.
		 * Ex: methodName(); or dataMemberName;
		 * static member: details() and name
		 */
		details();
		System.out.println(name);
		
		/** @author Jyoti Jogur
		 * By Creating an Class object and using a object reference we can access directly.
		 * Non-static member: age;
		 */
		AccessStaticMemberInsideClass a=new AccessStaticMemberInsideClass();
		System.out.println(a.age);

	}

}
