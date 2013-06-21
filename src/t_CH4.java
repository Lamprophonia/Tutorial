import java.util.Scanner;

/**
 * 					***CLASSES, METHODS, AND OBJECTS***
 * 		This will be a unique subject for us, because we've been using
 * 	classes this whole time without even knowing it!  A class can be thought
 * 	of as a new "page" of the program.  In this program, each chapter is it's
 * 	own class.  A method (sometimes called a function) is a part of a class.
 * 	To better understand the somewhat abstract idea of classes, methods, and
 * 	the relationship between them, it can be explained using real world examples.
 * 	Think of a specific animal, like a fish.  Now imagine that 'fish' is the CLASS.
 * 	Fish swim, they lay eggs, they hide from predators... each of these can be
 * 	thought of as METHODS of the fish class.  When the main program (in this
 * 	case we can say it's simply all animals) can create several different fish
 * 	(which would be by creating several unique objects, each thought of as a unique
 * 	fish), however they would all call the same class (fish), and share the same
 * 	methods (swim, lay eggs, hide, etc.)  It may also create several objects of
 * 	the 'hippo' class, which would have it's own unique set of methods, such as
 * 	run, roar, bite, graze, etc.  Hippos can swim as well, and there are ways for
 * 	classes to share methods, but we will save that for another chapter.
 *
 *		For more information on the subjects of this chapter, navigate your way
 *	through the t_Main class and find the comments marked for chapter 4.  This
 *	is a tricky subject to get a complete grasp on, but if you play around with
 *	these concepts a lot, then you will come to see and understand them and their
 *	value to programming.
 *	@author bmarini
 */
public class t_CH4
{
	Scanner in = new Scanner(System.in);
	
	/**
	 * Method to select the subject.
	 * 
	 * @return -1 to Main, which will return the user to the menu page.
	 */
	public short selector()
	{
		boolean cont = true;
		short select = -1;
		
		while(cont)
		{
			switch(select)
			{
				case -1:
				{
					System.out.println("\nWhich subject would you like to run?");
					System.out.println("1 - Create Some Fish!  FISHIES!!!");
					System.out.println("2 - More on Classes");
					System.out.println("0 - Chose Another Chapter");
					select = in.nextShort();
					break;
				}
				case 0:
				{
					cont = false;
					break;
				}
				case 1:
				{
					makeFishies();
					select = -1;
					break;
				}
				case 2:
				{
					classes();
					select = -1;
					break;
				}
				default:
				{
					System.out.println("\nIncorrect input!");
					select = -1;
					break;
				}
			}
		}
		
		return -1;
	}
	
	/**
	 * 
	 */
	private void makeFishies()
	{
		short i = -1;
		boolean run = true;
		String fishName;
		//		Creating 3 objects of the same class.  Each object
		//	will have the same variables, but the values for each
		//	will be unique to that fish.
		t_CH4_fish fish1 = new t_CH4_fish();
		t_CH4_fish fish2 = new t_CH4_fish();
		t_CH4_fish fish3 = new t_CH4_fish();
		
		//		Calling the setName() function for each fish.  This is a
		//	good example of how you should use the names of your methods,
		//	classes and variables to understand clearly what they are and do.
		//	In this case, setName() sets the string variable 'name' for each
		//	fish.  Makes sense, right?
		fish1.setName();
		fish2.setName();
		fish3.setName();
		
		//		Getting and displaying the name of each fish.  Here is an example
		//	of a method that returns a variable, in this case a string.  The power
		//	of creating and using methods like this becomes evident if you imagine
		//	having 100 fish to name instead of only 3.  You can simply call the same
		//	setName and getName functions, rather than prompt the user manually 100
		//	times.  This can be made even simpler with arrays, but that is a subject
		//	for future chapter.
		fishName = fish1.getName();
		System.out.printf("First fish is %s.  Hello, %s!\n", fishName, fishName);
		fishName = fish2.getName();
		System.out.printf("Second fish is %s.  Hello, %s!\n", fishName, fishName);
		fishName = fish3.getName();
		System.out.printf("Third fish is %s.  Hello, %s!\n", fishName, fishName);
		
		//		Here we will show an example of passing a variable into a method
		//	as an argument.
		while(run)
		{
			switch(i)
			{
				case -1:
				{
					System.out.println("Which fishie should we make swim, 1, 2, or 3?");
					i = in.nextShort();
					break;
				}
				case 1:
				{
					//	First we set fishName by using the getName() method...
					fishName = fish1.getName();
					//	...then we pass that value into the swim() method, to
					//	make that fishy swim!
					fish1.swim(fishName);
					run = false;
					break;
				}
				case 2:
				{
					fishName = fish2.getName();
					fish2.swim(fishName);
					run = false;
					break;
				}
				case 3:
				{
					fishName = fish3.getName();
					fish3.swim(fishName);
					run = false;
					break;
				}
				default:
				{
					i = -1;
					break;
				}
			}
		}
	}
	
	/**
	 *		For this class, we will use a more literal interpretation
	 *	of classes and methods, and show some examples of other
	 *	functionalities of them.
	 */
	private void classes()
	{
		//	Variables and declarations
		int b = 5, c = 7, d = 100, e = 576, sum;
		String fName = "NULL", lName = "NULL", fullName;
		t_CH4_Classes noArg = new t_CH4_Classes();
		
		//		Prompting the user to enter two separate names, one
		//	for the first name, the other for the last name.
		System.out.print("\nPlease enter a first name: ");
		fName = in.next();
		System.out.print("Please enter a last name: ");
		lName = in.next();
		
		
		//		Calling the method order that will concatinate the names and
		//	return a full name.
		noArg.setName(fName, lName);
		fullName = noArg.getName();
		System.out.printf("Back in Chapter 4, fullName is %s.\n", fullName);
		
		//	Running simple addition method...
		sum = noArg.add(b, c);
		System.out.printf("sum = %d \n", sum);
		//	...which will perform the same with any values passed...
		sum = 0;
		sum = noArg.add(d, e);
		System.out.printf("sum = %d \n", sum);
		//	...including the same variable twice.
		sum = 0;
		sum = noArg.add(e, e);
		System.out.printf("sum = %d \n", sum);
		
		//		Above we declared an object with no arguments.  Here
		//	is an example of declaring an object with one string argument...
		t_CH4_Classes oneArg = new t_CH4_Classes(fName);
		System.out.printf("Name from oneArg is %s\n", oneArg.getName());
		
		//	...or one int argument...
		t_CH4_Classes oneIntArg = new t_CH4_Classes(fName);
		System.out.printf("Name from oneIntArg is %s\n", oneIntArg.getName());
		
		//	...or two string arguments...
		t_CH4_Classes twoArg = new t_CH4_Classes("Quenby", "Walls");
		System.out.printf("Name from twoArg is %s\n", twoArg.getName());
		
		//	...or three arguments, two strings and one int!
		t_CH4_Classes threeArg = new t_CH4_Classes(fName);
		System.out.printf("Name from threeArg is %s\n", threeArg.getName());
	}
}

/*

									   "Dream Deferred"
										
									What happens to a dream deferred?

									Does it dry up
									Like a raisin in the sun?
									
									Or fester like a sore--
									And then run?
									
									Does it stink like rotten meat?
									Or crust and sugar over--
									like a syrupy sweet?
									
									Maybe it just sags
									like a heavy load.
									
									Or does it explode? 
										
												-Langston Hughes

 */