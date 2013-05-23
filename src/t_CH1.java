/*
 * Chapter 1:
 * 		Fundamentals of variables, math operators, user input
 * 
 * 		NOTES:
 * 			Signed = may have positive or negative (-) values
 * 			Two's compliment = method by which the binary system stores both
 * 				positive and negative numbers.  This is the standard for most
 * 				integer variables.  This is not important to know for programming,
 * 				but is interesting information to learn about.
 * 			IEEE = Institute of Electrical and Electronics Engineers; an
 * 				organization that develops global standards in a broad range of
 * 				industries.  Java uses these standards.
 */

//java.util.Scanner is needed for user input
import java.util.Scanner;

public class t_CH1
{
/*
 * 							***************************
 * 							***VARIABLE DECLARATIONS***
 * 							***************************
 * 		-NOTES-
 * 			For all integer types, you can use an underscore ('_') to separate
 * 		digits and make the number more readable, similar to how you would
 * 		write it with commas to separate by thousands, or spaces to separate
 * 		every four digits in a credit card number, or a dash to separate numbers
 * 		in a social security number.  An example is shown in the long variable
 * 		'longMin'.
*/
	
	/*
	 * 		-BYTE-
	 *  		(8-bit signed two's complement integer)
	 *  		Range: -128 to 127 (inclusive)
	 *  			Useful for saving memory in large arrays, where the memory savings
	 *  		actually matters.  They can also be used in place of integers where
	 *  		their limits help to clarify your code; the fact that a variable's
	 *  		range is limited can serve as a form of documentation.
	 */
	byte byteMin = -128, byteMax = 127, byteDefault = 0;
	
	/*
	 * 		-SHORT-
	 * 			(16-bit signed two's complement integer)
	 * 			Range: -32,768 to 32,767 (inclusive)
	 * 				Similar usefulness as byte, you can use a short to save memory in
	 * 			large arrays in situations where saving memory matters.
	 */
	short shortMin = -32768, shortMax = 32767, shortDefault = 0;
	
	/*
	 *  	-INTEGER-
	 *  		(32-bit signed two's complement integer)
	 *  		Range: -2,147,483,648 to 2,147,483,647 (inclusive)
	 *  			Typically the default choice for any integer-type variable,
	 *  		unless there is a reason (such as those mentioned above) to chose
	 *  		something else.  Most likely to be large enough for the numbers
	 *  		your program will use, but a larger option is available.
	 */
	int intMin = -2147483648, intMax = 2147483647, intDefault = 0;
	
	/*
	 * 		-LONG-
	 * 			(64-bit signed two's complement integer)
	 * 			Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (inclusive)
	 * 				Holds a significantly wider range of values than 'int' integer.  This
	 * 			means that it uses more memory, so only use it when you KNOW that you will
	 * 			be dealing with numbers on a grander scale than 'int' offers.
	 * 				-Syntax Note- Don't forget to add 'L' or 'l' to the end of the number,
	 * 			or else java will assume it is still a regular integer.
	 */
	long longMin = -9_223_372_036_854_775_808L, longMax = 9223372036854775807l, longDefault = 0L;
	
	/*
	 * 		-FLOAT-
	 * 			(32-bit IEEE 754 floating point)
	 * 			Range: n/a
	 * 				Smaller in size than 'double', the other floating point number
	 * 			variable.  This data type should NOT be used for precise values, like
	 * 			currency.  This will be covered more in depth in further chapters.
	 * 				-Syntax Note- Don't forget to add 'F' or 'f' to the end of the number,
	 * 			or else java will assume it is a double.
	 */
	float flPi = 3.14F, flRandom = 433.045778244545367675f, flDefault = 0.0f;
	
	/*
	 * 		-DOUBLE-
	 * 			(64-bit IEEE 754 floating point)
	 * 			Range: n/a
	 * 				Typically the default floating point data type.  As with 'float',
	 * 			this should NOT be used for precise values.
	 * 				-Syntax Note- You may, as an option, place a 'd' at the end of a
	 * 			number to ensure that it will be declared as a double.  It is not
	 * 			necessary, however.
	 */
	double dblPi = 3.14, dblRandom = 4.066784578709808765, dblDefault = 0.0d;
	
	/*
	 * 		-BOOLEAN-
	 * 				The boolean data type has only two possible values, TRUE and FALSE.
	 * 			Use this for simple tests that track true/false conditions.  This data
	 * 			type represents a single bit of information, but its "size" isn't
	 * 			precisely defined.
	 */
	boolean truth = true, lie = false, boolDefault = false;
	
	/*
	 * 		-CHAR-
	 * 			(Single 16-bit Uniode character)
	 * 			Min value = '\u0000' (blank space), max value = '\uffff' ('?')
	 * 				The 'char' data type represents only a single character, but
	 * 			it is common practice in some languages and situations to simply
	 * 			use a 'char' array to portray a string.  This topic will be covered
	 * 			in greater depth in a later chapter on strings.  Defaults to null.
	 */
	char letter = 'n', chMin = '\u0000', chMax = '\uffff';
	
	public void output()
	{
		/*
		 * 					***************************
		 * 					***BASIC OUTPUT PRINTING***
		 * 					***************************
		 * 		-NOTES-
		 * 			For the purposes of this chapter, assume that all of
		 * 		the different ways to print to the console must go through
		 * 		the 'System.out' method.
		 * 
		 * 			-Non-Format Specifiers-
		 * 		\n			= New line
		 * 		\			= Treats next item as a character (called a literal)
		 * 		+			= Concatinate
		 * 		
		 * 			-Format Specifiers-
		 * 			More useful than string concatination.  Any marked with a capitalized
		 * 		letter in parenthesis have a capitalization option; using the capitalized
		 * 		letter instead of the lower case letter will automaticall invoke a method
		 * 		that will make the argument uppercase if applicable [out.toUpperCase()].
		 * 
		 * 		%d			= Integer
		 * 		%b(B)		= Boolean; result will be true in all cases except if
		 * 					  the argument is 'null'
		 * 		%s(S)		= String
		 * 		%c(C)		= Char
		 * 		%o			= Octal integer
		 * 		%x(X)		= Hex integer
		 * 		%e(E)		= Floating point decimal number in scientific notation
		 * 		%f			= Floating point decimal number
		 * 		%g(G)		= Floating point using scientific notation OR decimal point,
		 * 					  depending on the precision and value after rounding
		 * 		%			= Literal
		 */
	
		/*
		 * 		-print("xyz")
		 * 			This will print out anything typed between the quotation marks.
		 * 		It will not allow formatting.
		 */
		System.out.print("Testing print:\nQuotation mark = \"\n\n");
		System.out.print("Concatinating with '+':\nintMin = " + intMin + "\n\n");
		
		/*
		 * 		-println("xyz")
		 * 			Same as above, except when it finishes, it will automatically place
		 * 		a new line on the console, as if the end of the string had '\n' in it.
		 */
		System.out.println("Testing println:\nQuotation mark = \"\n");
		
		/*
		 * 		-printf("xyz", a, b, c)
		 * 			As print(), except it allows for string formatting.
		 * 			
		 */
		System.out.printf("Testing printf:\nTesting %%d: intMax = %d\n", intMax);
		System.out.printf("Testing %%b: truth = %b\n", truth);
		System.out.printf("Testing %%B: truth = %B\n", truth);
		System.out.printf("Testing %%c: letter = %c\n", letter);
		System.out.printf("Testing %%C: letter = %C\n", letter);
		System.out.printf("Testing %%o: intMax = %o\n", intMax);
		System.out.printf("Testing %%x: intMax = %x\n", intMax);
		System.out.printf("Testing %%X: intMax = %X\n", intMax);
		System.out.printf("Testing %%e: flRandom = %e\n", flRandom);
		System.out.printf("Testing %%E: flRandom = %E\n", flRandom);
		System.out.printf("Testing %%f: dblRandom = %f\n", dblRandom);
		//Note that some values are rounded
	}
	
	//Declare a new scanner with "System.in" as the arguement.
	Scanner in = new Scanner(System.in);
	
	public void inputTest()
	{
		int input;
		String strInput;
		
		/*
		 * 					****************
		 *					***USER INPUT***
		 *					****************
		 *		-NOTES-
		 *			It's good practice to always prompt the user for the input,
		 *		so that they are never confused and know what is expected of them.
		 *		java.util.Scanner must be imported (as done at the top), and a
		 *		new Scanner object must be declared (as seen just prior to the
		 *		'inputTest()' function.
		 */
		
		/*
		 * 		-next()
		 * 			This will take the next whole item typed and translate it into
		 * 		a string variable.  This will only accept a single item, or 'token';
		 * 		a single word, character, or number.
		 */
		System.out.println("\nTesting next()");
		System.out.print("Type a single word or number: ");
		strInput = in.next();
		System.out.printf("strInput = %s\n", strInput);
		
		/*
		 * 		-nextInt()
		 * 			This will operate much the same as next(), only more specific;
		 * 		it will only function when the user types in any number that can be
		 * 		translated into the 'int' variable.  You can interchange 'Int' (and
		 * 		subsequent return type) with: String, Boolean, Byte, Double, Float,
		 * 		Long, and Short.
		 */
		System.out.printf("\nPlease type a number: ");
		input = in.nextInt();
		System.out.printf("You have typed %s.\n", input);
	}
}

/*
 
							   "My Heart Leaps up When I Behold"
								 		
								My heart leaps up when I behold
									A rainbow in the sky:
								So was it when my life began;
								So is it now I am a man;
								So be it when I shall grow old,
									Or let me die!
								The Child is father of the Man;
									I could wish my days to be
								Bound each to each by natural piety.
								
												-William Wordsworth

 */