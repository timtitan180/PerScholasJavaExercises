import java.util.*;

public class CoreJavaExerciseLoops {
	//Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
	public static void main(String[] args) {
	for(int i=0;i<11;i++) {
		System.out.print(i);
	}

	//Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
	int j = 0;
	while(j<100) {
		j+=10;
		System.out.print(j);
	}

	//Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
	int k;
	k = 0;
	do {
		k+=1;
		System.out.print(k);
	}
	
	while(k<11);
	
	
//	Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
	for(int i=1;i<101;i++) {
		if(i % 5 == 0) {
			System.out.print(i);
		}
		
		if(i == 25 || i == 75) {
			continue;
		}

}
//	Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
	for(int j=0;j<101;j++) {
		if(j % 5 == 0) {
			System.out.println(j);
		}
		j++;
		if(j > 50) {
		break;
		}
	}
	
	//Write a program that uses nested for-loops to output the following:
//	Week 1:

//		Day 1
//
//		Day 2
//
//		Day 3
//
//		Day 4
//
//		Day 5
//	Week 2 Day 1 Day 2 Day 3 Day 4 Day 5
	//
	
	int numberofWeeks = 2;
	int days = 7;
	
	for(int k1=1;k1<=2;k1++) {
		System.out.print("Week" +k1 +  ":");
		for(int j1=1;j1<=7;j1++) {
			System.out.println("Days:" + j1);
		}
	}
	
	//Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
	//11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
//	
		 for(int i=0;i<101;i++) {
             String convertToStringIteration = Integer.toString(i);
             ReverseNumber(convertToStringIteration);
             
         }
		 
	 static void ReverseNumber(String number) {
			 	String reversed = "" ;
			 	for(int i=number.length();i<=0;--i) {
			 	    reversed += number.charAt(i); 
			 	}
			 	    System.out.println(reversed);
			 	    

			     }
			
//	

//Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	 
		do {
	   		for(int i=0;i<50;i++) {
	   		int fibonnaciSequenceFormula = (i + i + 1);
	   		System.out.print(fibonnaciSequenceFormula);
	   		}
}
		while(i<50);


			
        
	   //Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
	   for(int i1=0;i1<2;i++) {
	   for(int j1=0;j1<2;j1++) {
   System.out.println("Inner loop: i: " + i1 + ", j: " + j1);
	   	}
	   }
	   
	  
}
