/*
 * 	Fish class for chapter 4
 */

import java.util.Scanner;

public class t_CH4_fish
{
	/*
	 * 		Syntax for declaring PRIVATE variables... they can only
	 * 	be used within this class, and cannot be accessed by any other
	 * 	class.  If we do not specify the variable to be private, then
	 * 	another class could access it (by using the dot separator, e.g.
	 * 	fish1.name).  
	 */
	private Scanner in = new Scanner(System.in);
	private String name;
	
	/*
	 * 		Here we will showcase the usefulness of SET and GET methods.
	 * 	While not absolutely necessary, it's standard practice for dealing
	 * 	with class variables.  
	 */
	public void setName()
	{
		System.out.printf("Please enter the name for this fishy: ");
		name = in.next();
	}
	
	//		Here we see STRING, rather than void, because we intend to return
	//	a string to whatever calls this method.
	public String getName()
	{
		System.out.println("Calling getName()...");
		return name;
	}
	
	//		This method is still of the type VOID, because it does not return
	//	a string.  Accepting a variable as an argument is independent of whatever
	//	value a method returns, if any.  Note that to accept a variable, you must
	//	initialize a variable of the same type within the parenthesis of the method.
	//	You may use that variable as if it were declared within the body of the
	//	method itself.
	public void swim(String temp)
	{
		System.out.printf("Swim, mister %s, swim!\n", temp);
	}
}