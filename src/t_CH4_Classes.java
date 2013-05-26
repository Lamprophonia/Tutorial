/*
 * 	More class examples and constructors for chapter 4
 */

public class t_CH4_Classes
{
	private String fName, lName;
	int test;
	
	//		Here we see an example of passing multiple
	//	variables as arguments.  Keep in mind that the
	//	order going in matters, so keeping your variable
	//	names easy to understand is crucial.
	public void setName(String first, String second)
	{
		System.out.printf("In setName, current name is %s %s.\n", fName, lName);
		fName = first;
		lName = second;
		System.out.printf("Still in setName, name is now %s %s.\n", fName, lName);
	}
	
	public String getName()
	{
		System.out.printf("In getName(), returning %s %s.\n", fName, lName);
		//		Showcasing an example of returning multiple, concatinated
		//	values.  In this case, two string variables and a space literal
		//	to separate them.  It will put each of these together into a
		//	single string variable at the other end, in the t_CH4.classes()
		//	method.
		return fName + " " + lName;
	}
	
	//	Just a simple example of both accepting and returning values.
	public int add(int x, int y)
	{
		int sum;
		System.out.printf("x = %d, y = %d\n", x, y);
		sum = x + y;
		return sum;
	}
	
	/*
	 * 				******************
	 * 				***CONSTRUCTORS***
	 * 				******************
	 * 		Constructors are very useful, and should be a staple of
	 * 	any programmer's repertoire.  This is essentially a method that
	 * 	will be run automatically everytime an object for this class is
	 * 	created.  Thankfully, you can create more than one constructor,
	 * 	so that each can be called depending on the values passed into
	 * 	it when the object is created.  For example;
	 */
	
	//		This constructor will be called when an object is created with
	//	no arguments passed into it.
	public t_CH4_Classes()
	{
		System.out.println("In constructor, no arguments...\n");
		fName = "NULL";
		lName = "NULL";
		test = 0;
	}
	
	//		This constructor is an example of a single argument.  Note that
	//	the variable name can change and it won't make a difference, because
	//	of the variable scope.
	public t_CH4_Classes(String text)
	{
		System.out.println("In constructor, one string argument...\n");
		fName = text;
		lName = "NULL";
		test = 0;
	}
	
	//	Here is a constructor that takes a single int...
	public t_CH4_Classes(int num)
	{
		System.out.println("In constructor, one INT argument...\n");
		fName = "NULL";
		lName = "NULL";
		test = num;
	}
	
	//	...and two strings...
	public t_CH4_Classes(String f, String l)
	{
		System.out.println("In constructor, two string arguments...\n");
		fName = f;
		lName = l;
		test = 0;
	}
	
	
	//	...and three arguments; two strings and a single int.
	public t_CH4_Classes(String f, String l, int num)
	{
		System.out.println("In constructor, all three arguments...\n");
		fName = f;
		lName = l;
		test = num;
	}
	/*
	 * 		As you can see, it's possible to create a constructor for
	 * 	every possible contingency in regards to class variables.  Think
	 * 	of it as a way of making a catch-all, so that in a case where the
	 * 	nature and number of the arguments being passed into an object are
	 * 	themselves variable, you can ensure that the object will be successfully
	 * 	created regardless.  Bear in mind, it is more standard practice to
	 * 	place constructors at the beginning of a class, as they are guaranteed
	 * 	to be the first things called.
	 */
}