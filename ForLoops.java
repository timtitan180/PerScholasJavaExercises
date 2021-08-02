import java.util.Scanner;

public class ForLoops {
	
	public static void main(String[] args) {
		//Check if a number is a palindrome 
		//first reverse loop through the number 
		//check if each reversed iteration mathes the iteration
		
		String palindromeString = "palindrome";
		for(int i=0;i<palindromeString.length() + 1;--i) {
			char y = palindromeString.charAt(i);
		}
		iterateNormally(palindromeString);
		
		
			
	
	}
	
	
	
		public static String iterateNormally(String palindrome) {
			//iterate throught the string to get each of the cahracters i nthe strong
			for(int i=0;i<palindrome.length();i++) {
				char x = palindrome.charAt(i);
			}
			return x;
		}
}

