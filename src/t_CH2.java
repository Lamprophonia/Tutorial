/*
 * Chapter 2:
 * 		Basic math operators, incrementals, logical operators, IF statement, ELSE statement,
 * 		ELSE IF statement
 */

import java.util.Scanner;

public class t_CH2
{
	Scanner in = new Scanner(System.in);
	
	//	Method to select the subject.
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
					System.out.println("1 - Basic Math and Incrementals");
					System.out.println("2 - If Statements and Operators");
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
					math();
					select = -1;
					break;
				}
				case 2:
				{
					ifStatement();
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
	
	private void math()
	{
		//Function (sometimes called method, they're the same thing) variables
		int intOne, intTwo, intAdd, num = 0;
		
		/*
		 * 					****************
		 * 					***BASIC MATH***
		 * 					****************
		 * 			All of the following operations can be performed with
		 * 		addition (+), subtraction(-), multiplication (*), division
		 *		(/), or modulus(%, this will give the remainder of the
		 *		division)
		 */
		
		System.out.print("Please enter a value for the first number: ");
		intOne = in.nextInt();
		System.out.print("Please enter a value for the second number: ");
		intTwo = in.nextInt();
		
		//	Basic addition operation
		intAdd = intOne + intTwo;
		System.out.printf("\nintAdd = intOne + intTwo = %d\n", intAdd);
		//	These versions are the same thing, and use one less variable
		intOne = intOne + intTwo;
		System.out.printf("\nintOne = intOne + intTwo = %d\n", intOne);
		//	Note that the new value of intOne includes the previous addition of intTwo
		intOne += intTwo;
		System.out.printf("\nintOne += intTwo = %d\n", intOne);
		
		//	Here is an example of how to use modulus
		System.out.printf("\n%d divided by %d is:\n", intOne, intTwo);
		//	Here is also an example of using math operators directly in a method.  While
		//	it isn't necessary to place each math operation in parenthesis, it is good
		//	coding practice.  It makes the code easier to read and understand, and while
		//	java will follow the PEMDAS math rule of order, it is still always better
		//	practice to clarify with parenthesis.
		System.out.printf("%d, remainder %d\n", (intOne / intTwo), (intOne % intTwo));
		
		/*
		 * 		Incrementals are a fast and efficient way to simply add or subtract one from
		 * 	a value.  This is a VERY common operation in programming, thus having such a simple
		 * 	means of performing it is very helpful.  Note that it matters whether you place
		 * 	the incremental before or after the variable, which we will show.
		 */
		
		//		Showcasing the post increment (X++).  Note that it increments AFTER the expression,
		//	which means that it will print out the value of 'num' BEFORE it adds one to it.
		System.out.printf("\nnum++ = %d\n", num++);
		//	A simple printf statement shows this.
		System.out.printf("num = %d\n", num);
		//	Showcasing the pre increment (++X).  This will increment BEFORE the expression
		//	resolves, so it will print the value of 'num' AFTER it has been incremented.
		System.out.printf("++num = %d", ++num);
		//		All of the above incrementals will increase the value by one, but you can perform
		//	a decremental the exact same way; simply replace the '++' with '--' (e.g., num--
		//	which will subtract one after the expression,  or --num which will subtract one
		//	before the expression.
	}
	
	private void ifStatement()
	{
		//Function variables
		int numOne, numTwo, value = 10;
		
		/*
		 * 			*****************************************
		 * 			***IF STATEMENTS AND LOGICAL OPERATORS***
		 * 			*****************************************
		 * 			To showcase the if-statement and logical operators,
		 * 		we will first prompt the user to enter a number that will
		 * 		be tested against the number 10.
		 */
		System.out.print("Please enter a number to be compared to 10: ");
		numOne = in.nextInt();
		
		/*
		 * 			First we will showcase each of the relational operators.
		 * 		These compare two values and return a boolean value (true or
		 * 		false) based on the operator.  The 'if' statement can be thought
		 * 		of as saying "if (the statement in the parenthesis is true), then
		 * 		perform the code within the brackets {}.  Note that if the statement
		 * 		is not true, then the code within the brackets will be ignored.
		 */
		
		/*
		 * 		Showcasing the IS EQUAL TO operator (==).  Please take careful
		 * 	note that this is NOT the same as the assignment operator (=).  This
		 * 	is one of the most common mistakes to make in programming, and will
		 * 	drive you mad trying to figure out what you did wrong.  If you forget
		 * 	to add a second equals sign in an if statement, the code will recognize
		 * 	this as a legitimate operation; instead of comparing the first value
		 * 	to the second, however, it will assign the second value INTO the first.
		 * 	Seriously.  Note this well.  It will make you want to punch babies.
		 */
		if(numOne == value)
		{
			System.out.printf("%d is equal to (==) 10.\n", numOne);
		}
		
		//	Showcasing the greater than (>) operator.
		if(numOne > value)
		{
			System.out.printf("%d is greater than (>) 10.\n", numOne);
		}
		
		//	Showcasing the less than (<) operator.
		if(numOne < value)
		{
			System.out.printf("%d is less than (<) 10.\n", numOne);
		}
		
		//	Showcasing the greater than or equal to (>=) operator.
		if(numOne >= value)
		{
			System.out.printf("%d is greater than or equal to (>=) 10.\n", numOne);
		}
		
		//	Showcasing the less than or equal to (<=) operator.
		if(numOne <= value)
		{
			System.out.printf("%d is less than or equal to (<=) 10.\n", numOne);
		}
		
		//	Showcasing the NOT equal to (!=) operator.
		if(numOne != value)
		{
			System.out.printf("%d is not equal to 10\n", numOne);
		}
		
		/*
		 * 			Prompting the user for another number to compare to 10, to showcase the
		 * 		conditional operators.  Conditional operators compare two or more relational
		 * 		operators, and return a boolean value dependent on the results of the
		 * 		relational operators.  We will also showcase the use of the ELSE statement.
		 * 		Simply put, the ELSE statement will give the program something else to run
		 * 		if the argument in the IF statement is false, rather than simply skip over
		 * 		the code.
		 */
		System.out.print("\nPlease enter the second number to be compared to 10: ");
		numTwo = in.nextInt();
		
		//		Showcasing the logical AND (&&) operator.  This will return true only if both
		//	relational operators are true.
		if((numOne > value) && (numTwo > value))
		{
			System.out.printf("Both numbers %d and %d are greater than 10\n", numOne, numTwo);
		}else
		{
			System.out.printf("Neiter %d nor %d are greater than 10.\n", numOne, numTwo);
		}
		
		//		Showcasing the logical OR (||) operator.  This will return true if either
		//	relational operators are true, or both.  It is worth noting that once a relational
		//	operator returns as true, it will NOT continue to read any other operators and
		//	simply return a true value.  This is called short circuiting.
		if((numOne < value) || (numTwo < value))
		{
			System.out.printf("Either %d, %d, or both are less than 10\n", numOne, numTwo);
		}else
		{
			System.out.printf("Neither %d not %d are less than 10.\n", numOne, numTwo);
		}
		
		//		Showcasing the Exclusive OR, written as XOR (^).  It will return true if either
		//	relational condition is true, but FALSE if both are true.  Otherwise, it is the
		//	same as logical OR.
		if((numOne == value) ^ (numTwo == value))
		{
			System.out.printf("Either %d or %d are equal to 10, but not both.\n", numOne, numTwo);
		}else
		{
			System.out.printf("Both %d and %d or neither are equal to 10.\n", numOne, numTwo);
		}
		
		//		Here is an example of how multiple operators can be used in one statement.  It
		//	will only return true if both numOne and numTwo are greater than 10, or if they are
		//	both less than 10.  It will NOT return true if one is greater and the other is less,
		//	or if either are equal to 10.
		if(((numOne > value) && (numTwo > value)) || ((numOne < value) && (numTwo < value)))
		{
			System.out.printf("Both %d and %d are  greater than or less than 10\n", numOne, numTwo);
		}else
		{
			System.out.println("Complex condition is false");
		}
		
		//		Finally, showcasing the ELSE IF statement.  This is just a way to run subsequent
		//	if statements; if the first IF statement returns false, then the next ELSE IF
		//	will run.  If that returns false, then the next ELSE IF statement will run,
		//	continuing down the chain until there are no more ELSE IF statements or a test
		//	returns true.  There is a more efficient and intuitive way to perform essentially
		//	the same tests, which will be covered in Chapter 3, but this will function perfectly
		//	fine, and may be optimal for a small number of tests.
		if(value == 0)
		{
			System.out.println("numOne is 0");
		}else if(numOne == 1)
		{
			System.out.println("numOne is 1");
		}else if(numOne == 2)
		{
			System.out.println("numOne is 2");
		}else if(numOne == 3)
		{
			System.out.println("numOne is 3");
		}else
		{
			System.out.printf("numOne is not 1, 2, or 3... it is %d\n", numOne);
		}
	}
}

/*

							 		"The Road Not Taken"
							
							Two roads diverged in a yellow wood,
							And sorry I could not travel both
							And be one traveler, long I stood
							And looked down one as far as I could
							To where it bent in the undergrowth;
							
							Then took the other, as just as fair,
							And having perhaps the better claim
							Because it was grassy and wanted wear,
							Though as for that the passing there
							Had worn them really about the same,
							
							And both that morning equally lay
							In leaves no step had trodden black.
							Oh, I kept the first for another day!
							Yet knowing how way leads on to way
							I doubted if I should ever come back.
							
							I shall be telling this with a sigh
							Somewhere ages and ages hence:
							Two roads diverged in a wood, and I,
							I took the one less traveled by,
							And that has made all the difference.
							
												-Robert Frost

 */