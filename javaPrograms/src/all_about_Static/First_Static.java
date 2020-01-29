
/*
 * 'static' keyword can be used as:
 * 1. variable
 * 2. block
 * 3. class
 * 4. method
 * 
 * - they belong to class and not instance of class. Hence, no object is required to access 'static' members
 * - 
 * 
 */


package all_about_Static;

public class First_Static {

	//Case 1
	static int b;
	int d;
	
	//Case 2
	static int count;
	public int increment()
	{
		count++;
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Case 1
		int c=4;
		
		int a;
		a=10;
		System.out.println("CASE 1");
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		
		First_Static fs = new First_Static();		
		System.out.println(fs.d);
		
		// System.out.println(d);    - invalid statement
		
		//Case 2
		// Static is object independent
		System.out.println("CASE 2");
		First_Static obj1 = new First_Static();
		First_Static obj2 = new First_Static();
		System.out.println(obj1.increment());
		System.out.println(obj2.increment());
		
	
		//Case 3
		System.out.println("CASE 3");
		First_Static obj3 = new First_Static();
		First_Static obj4 = new First_Static();
		
		System.out.println(obj3.increment());
		System.out.println(obj4.count);
			
		
	}
}
