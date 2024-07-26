package assignment2;

//Import the Scanner
import java.util.Scanner;

public class StringToolsTester {


		public static void main(String[] args) {
			
			
			//Create the Scanner object to collect the user's input
			Scanner babyyoda=new Scanner(System.in);

			
			/*we prompt the user to enter a string to reverse it,
			 * the string entered is collected by the scanner and 
			 * stored in the variable str.
			 * 
			 * Then we do the method call, we call the static
			 * method reverse() and the method is argumented so 
			 * we determine that the argument is str.
			 * By making the method call equal a String variable 
			 * called reverse what we do is store what is returned
			 * from the method into the variable reversed, and then 
			 * print the result.
			 */
			
			System.out.print("Enter a String, to reverse it:");
			String  str=babyyoda.nextLine();
			
			String reversed = StringTools.reverse(str);
			System.out.println("Reversed string:"+reversed);
			
			
			
			
			/*we prompt the user to enter a binary number to convert it
			 *to decimal, the string entered is collected by the scanner and 
			 * stored in the variable str.
			 * 
			 * Then we do the method call, we call the static
			 * method binaryToDecimal() and the method is argumented so 
			 * we determine that the argument is str.
			 * By making the method call equal a String variable 
			 * called dec what we do is store what is returned
			 * from the method into the variable dec, and then 
			 * print the result.
			 */
			System.out.print("Enter a binary number, to convert from binary to decimal:");
			str=babyyoda.nextLine();
			
			int dec=StringTools.binaryToDecimal(str);
			System.out.println("decimal number:"+dec);
			
			
			
			
			/*we prompt the user to enter a name to initialize it,
			 *  the string entered is collected by the scanner and 
			 * stored in the variable str.
			 * 
			 * Then we do the method call, we call the static
			 * method initials() and the method is argumented so 
			 * we determine that the argument is str.
			 * By making the method call equal a String variable 
			 * called name what we do is store what is returned
			 * from the method into the variable name, and then 
			 * print the result.
			 */
			System.out.print("Enter a Name, to properly initialize it:");
			str=babyyoda.nextLine();
			
			String name=StringTools.initials(str);
			System.out.println("the initialized name:"+name);
			
			
			
			
			/*we prompt the user to enter a string to find the most 
			 * frequent character, the string entered is collected 
			 * by the scanner and stored in the variable str.
			 * 
			 * Then we do the method call, we call the static
			 * method mostFrequent() and the method is argumented so 
			 * we determine that the argument is str.
			 * By making the method call equal a char variable 
			 * called lett what we do is store what is returned
			 * from the method into the variable lett, and then 
			 * print the result.
			 */
			System.out.print("Enter a String, to find the most frequent character:");
			str=babyyoda.nextLine();
			
			char lett = StringTools.mostFrequent(str);
			System.out.println("most frequent char:"+lett);		
		
			
			
			
			/*we prompt the user to enter a string,
			 *  the string entered is collected by the scanner and 
			 * stored in the variable str1.
			 * we prompt the user to enter a pattern to look for,
			 * the string entered is collected by the scanner and 
			 * stored in the variable str2.
			 * we prompt the user to enter a string that is the replacement,
			 * the string entered is collected by the scanner and 
			 * stored in the variable str3.
			 * 
			 * Then we do the method call, we call the static
			 * method replaceSubString() and the method is argumented so 
			 * we determine that the argument is str1, str2 and str3.
			 * By making the method call equal a String variable 
			 * called text what we do is store what is returned
			 * from the method into the variable text, and then 
			 * print the result.
			 */
			System.out.print("Enter a String:");
			String  str1=babyyoda.nextLine();	
			
			
			System.out.print("Enter a pattern to look for:");
			String  str2=babyyoda.nextLine();
			
			
			System.out.print("Enter a pattern to replace:");
			String  str3=babyyoda.nextLine();
			
			String text = StringTools.replaceSubString(str1, str2, str3 );
			System.out.println("new string:"+text);	
			
			
			
			
			//we close the scanner
			babyyoda.close();

		}
	}


