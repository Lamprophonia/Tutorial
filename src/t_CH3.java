/*
 * Chapter 3:
 * 		More statements, loops
 * 
 * 		NOTES:
 * 			For the sake of time, we will simply assign values to any variable and not
 * 		prompt the user for input unless it matters to the lesson.
 */

import java.util.Scanner;

public class t_CH3
{
	public void switchStatement()
	{
		//	Function variables
		int choice;
		Scanner in = new Scanner(System.in);
		
		/*
		 * 					**********************
		 * 					***SWITCH STATEMENT***
		 * 					**********************
		 * 		The switch statement functions very similarly to using multiple IF ELSE
		 * 	statements as seen at the end of Chapter 2, but is significantly cleaner, easier
		 * 	to understand and follow, and uses many less lines.  For this example, we will
		 * 	prompt the user to enter a number between 1 and 10, then print out the corresponding
		 * 	letter of the alphabet.  
		 */
		
		//	Prompt the user for input
		System.out.print("\nPlease enter a number between 1 and 10: ");
		choice = in.nextInt();
		
		//		Syntax for a switch statement.  Don't forget to have the BREAK statement at the
		//	end of every case, otherwise it will continue through the cases.  Since one value 
		//	can satisfy more than one condition, it is wise to use BREAK to exit out of the
		//	switch statement (unless, of course, you WANT the switch statement to find multiple
		//	cases for a single variable).  The brackets under the case statements are not
		//	actually necessary, but it is good practice to keep all 'blocks' of code in brackets.
		//	the brackets AROUND the cases ARE necessary.
		switch(choice)
		{
		case 1:
			{
				System.out.println("A");
				break;
			}
		case 2:
			{
				System.out.println("B");
				break;
			}
		case 3:
			{
				System.out.println("C");
				break;
			}
		case 4:
			{
				System.out.println("D");
				break;
			}
		case 5:
			{
				System.out.println("E");
				break;
			}
		case 6:
			{
				System.out.println("F");
				break;
			}
		case 7:
			{
				System.out.println("G");
				break;
			}
		case 8:
			{
				System.out.println("H");
				break;
			}
		case 9:
			{
				System.out.println("I");
				break;
			}
		case 10:
			{
				System.out.println("J");
				break;
			}
		//	DEFAULT should be added to the end of every switch statement.  It will
		//	run if none of the other cases are met.  Think of this as a catch-all.
		default:
			{
				System.out.println("Wrong number!");
				break;
			}
		}
	}
	
	public void whileLoop()
	{
		//	Function variables
		int x = 0, num = 10, i = 0;
		boolean check = false, test = true;
		
		/*
		 * 					*****************
		 * 					***WHILE LOOPS***
		 * 					*****************
		 * 			WHILE loops will run through themselves over and over again until
		 * 		the statement being tested becomes false.  As with any loop, you must
		 * 		be VERY careful; if the loop itself does not contain some way to change
		 * 		the condition being tested, then the loop will run infinitely.
		 * 		Infinite loops tend to crash programs, but are TECHNICALLY allowed, so
		 * 		the IDE will not point to any errors while compiling or running the
		 * 		program.
		 */
		
		//	Showcasing a simple example.
		System.out.println("\nRunning simple WHILE loop:");
		while(x < num)
		{
			//		Here is a good example of how useful incrementals are.  Without it,
			//	this loop would run until the program crashed.
			System.out.printf("x++ = %d\n", x++);
		}
		System.out.printf("WHILE loop done, x = %d\n", x);
		
		//	Showcasing a loop using a boolean variable as it's own argument.
		x = 0;
		System.out.println("\nRunning boolean WHILE loop:");
		while(test)
		{
			//		Here is an example of how a loop or statement can sit inside another.
			//	This is called 'nesting'.
			if(x >= num)
			{
				test = false;
			}else
			{
				x++;
				System.out.printf("Still in the loop, x = %d\n", x);
			}
		}
		System.out.printf("Loop finished, x = %d\n", x);
		
		//		Showcasing a more complex WHILE loop.  If you can trace what is happening here,
		//	then you have a good understanding of how loops work.
		x = 0;
		test = true;
		System.out.printf("\nOutside of the complex loop, x = %d and y = %d.\n", x, i);
		//		Here is a good example of a situation where it is important to pay attention
		//	to the difference between the EQUALS operator (==) and the assignment operator (=).
		while(check == false)
		{
			if(x >= num)
			{
				
			}
			else
			{
				
			}
		}
	}
	
	public void forLoop()
	{
		/*
		 * 					***************
		 * 					***FOR LOOPS***
		 * 					***************
		 */
		
		
	}
	
	public void doWhileLoop()
	{
		/*
		 * 
		 */
		
		
	}
}

/*

				 				   "Bear in There"
										
								There's a Polar Bear
								In our Frigidaire--
								He likes it 'cause it's cold in there.
								With his seat in the meat
								And his face in the fish
								And his big hairy paws
								In the buttery dish,
								He's nibbling the noodles,
								He's munching the rice,
								He's slurping the soda,
								He's licking the ice.
								And he lets out a roar
								If you open the door.
								And it gives me a scare
								To know he's in there--
								That Polary Bear
								In our Fridgitydaire. 
										
										-Shel Silverstein

 */