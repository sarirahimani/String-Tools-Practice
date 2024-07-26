package assignment2;

public class StringTools {
	
		/**
		 * StringTools is a class of static methods
		 * that accomplish the following:
		 * reverse a string
		 * convert a binary number to decimal
		 * initializes names
		 * counts the most frequent chars
		 * replace strings
		 * @author Sahara Karima Mosin Rahimani
		 */


		static int number;
		public static void setnum() {
			number=5;
		}
		public static int getnum() {
			return number;
		}
		/**
		 * The static method reverse has a 
		 * @param s, it is a string that the user
		 * wants to reverse
		 * @return rev, it is the reversed string 
		 * 
		 * First we define the string variable rev
		 * we define the int variable lenght and we 
		 * get the length of the string.
		 * 
		 * we then create a for loop that starts at
		 * length-1 and goes up to 0, (every time the
		 * loop runs i will decrease by one) and what we 
		 * do inside the loop is collect the characters of
		 * the string from the last letter to the first.
		 */
		public static String reverse(String s) {
			String rev =" ";
			int length=s.length();
			
			for(int i=length-1;i>=0;i--){
				
				rev = rev +s.charAt(i);
			}
			
			return rev;
		}
		
		/**
		 *The static method binaryToDecimal has a 
		 * @param s, it is a string that the user
		 * wants to change to a decimal number
		 * @return decimal, decimal number that is
		 * equivalent to the binary number
		 * 
		 * First we define the int variables decimal
		 * and i.
		 * 
		 * we then create a for loop that starts at
		 * 0 and goes up to length-1, (every time the
		 * loop runs i will increase by one) and what we 
		 * do inside the loop is:
		 * first we check the parameter, if the characters
		 * of the string is not equal to 1 or 0 decimal will 
		 * equal -1, if it is equal to 1 or 0 it does not execute
		 * the next statement. 
		 * 
		 * Then, (outside the for loop) we have an if statement 
		 * that checks if decimal is equal to 0 and if it is that 
		 * means that the number is binary so the statements inside 
		 * the if statement will execute. 
		 * inside the if statement we define the ints
		 * d, count and num that contains the string 
		 * that we convert into an int
		 * 
		 * then we have a while loop that will execute while 
		 * number is greater that 0, inside the while loop
		 * we start the calculation we use % to get the last digit
		 * of the number, and we store it in d, then we use decimal=
		 * decimal+(d*Math.pow(2,count)) (count is used as the power) 
		 * to perform the calculation that will transform that digit 
		 * into a decimal digit, and then we divide by 10 so that when 
		 * we repeat the process we get the next digit and we add the 
		 * result to decimal again, and it continues to do that with 
		 * all digits.
		 */
		public static int binaryToDecimal(String s){
			int decimal=0;
			int i=0;
			
			for(i=0; i<s.length();i++) {
				
				if(!(s.charAt(i) =='1'|| s.charAt(i) =='0')) {
					
					decimal=-1;
				}
				
			}
			
			if(decimal==0) {
				
				int num=Integer.parseInt(s);
				int d;
				int count=0;
				
				while (num > 0) {
					d= num % 10;
					decimal+=d*Math.pow(2,count);
					num = num / 10;
					count++;
				}
				
			}
			return decimal;
		}
		
		/**
		 * The static method replaceSubString replaces part 
		 * of the string with another string the user chooses 
		 * the string that will contain the replaced string, 
		 * as well as the substring they want to replace,
		 * and what should replace it.
		 * 
		 * @param String1 is the string entered by the user
		 * initially
		 * @param String2 is the string with the word or
		 * pattern we want to replace
		 * 
		 * @param String3 is the string with which we replace
		 * all the substrings that are equal to String2.
		 * @return the string res that contains the string 
		 * with the replaced word. 
		 * 
		 * First we define the string variable res then 
		 * we set all the strings or parameters to lowercase 
		 * we define the int variable i and length, that contains
		 * the length of the string and we split String1, and store 
		 * it in an array.
		 * 
		 * we then create a for loop that starts at 0
		 * and goes up to length-1, (every time the
		 * loop runs i will increase by one) and what we 
		 * inside the loop is an if statement that asks 
		 * if a element of the array of string1 is equal 
		 * to String2 if it is that element is replaced by 
		 * String3 and we store all elements 
		 * back in res.
		 */
		public static String replaceSubString(String String1, String String2, String String3 ) {
			String res=" ";
			String1=String1.toLowerCase();
			String2=String2.toLowerCase();
			String3=String3.toLowerCase();
			int i=0;
			String[] arrstr= String1.split(" ");
			int length=arrstr.length;
			
			for(i=0;i<length;i++) {
				
				if(arrstr[i].equals(String2)){
					
					arrstr[i]=String3;	
				}
				res= res+ arrstr[i]+" ";
			}	
			return res;
		}
				
				
			
		

		/**
		 * The static method initials has a 
		 * @param s, it is a string that the user
		 * wants to initialize
		 * @return res, it is the initialized string 
		 * 
		 * First we define the string variable res
		 * we then split the string s and store in an array.
		 * 
		 * we then have an if statement that tests if the 
		 * size of the array of strings is not 3 if true 
		 * the value of res is null and then we have an 
		 * if statement that tests if the size of the 
		 * array of strings is 3 if true then we store the
		 * first character of the first element (position=0)
		 *in the string variable first  we do the same with the
		 * second element then we store it in sec then we
		 * transform to uppercase and store it in a string 
		 * variable res1 properly formated.
		 * 
		 * we store the third element of the array in res 2
		 * it is trores as 2 substrings to capitalize the
		 * the first letter and make the other substring 
		 * lowercase.
		 * 
		 * we add res1 and res2 and store it in res.
		 */
			public static String initials(String s ) {
				String res=" ";
				String[] arrstr=s.split(" ");
				
				if(arrstr.length!=3) {
					
					res= null;
				}
				
				if(arrstr.length==3){
					
					char first=arrstr[0].charAt(0);
					char sec=arrstr[1].charAt(0);
					String res1=Character.toUpperCase(first)+"."+" "+Character.toUpperCase(sec)+"."+" ";
					String str=arrstr[2];
					String res2 =str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
					res= res1+res2;
				}
				
				return res;
			}
		
				
		/** 
		 * The static method mostFrequent has a 
		 * @param s, it is a string that the user
		 * wants to to count the char that occurs 
		 * most frequently.
		 * @return ch, most frequent char 
		 * 
		 * First we define the int variables i, j, count, mcount
		 * and length of the string. we define the char array 
		 * carr and the char ch. We also transform the string s
		 * to all lower case and store it in the string variable
		 * st.
		 * 
		 * we then have a for loop and i goes from 0 to length-1
		 * and inside the for loop we have another for loop 
		 * and j goes from 0 to length-1 
		 * inside the both loops there is an if statement, that compares 
		 * 2 letters if they are the same we add 1 to count. 
		 * 
		 * then we have another if statement that states if 
		 * count is greater or equal to mcount then the value of 
		 * count will equal mcount and the char is transfered into 
		 * ch.
		 * 
		 * this process also allows us to print the last char checked if event of 
		 * a tie.
		 * 
		 * then inside the first loop we make count=0 to 
		 * start counting the occurences of the next letter.
		 * 
		 */
				public static char mostFrequent(String s) {
					
					int i=0;
					int j=0;
					char ch=' ';
					int mcount=0;
					int count=0;
					String st=s.toLowerCase();
					int length=st.length();
					char [] carr=st.toCharArray();
					
					for(i=0;i<length;i++) {
						for(j=0;j<length;j++) {
							if(carr[i]==carr[j]) {
								count++;
							}
							
							if(count>=mcount) {
								mcount=count;
								ch=carr[i];
							}
						}
						count=0;
					}
					
					return ch;	
	        
				}
				
							
}				
				
				

