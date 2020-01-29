//Static block is different than static method

package all_about_Static;

public class Static_Block {

	static
	{
		System.out.println("hello!!! I am Static block");
	}
	public static void main(String[] args) {

		testMethod();
		
		//we can access static member with object - but it is not required
		Static_Block st = new Static_Block();
		st.testMethod();
	}

}
