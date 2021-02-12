// To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World.
//on a single line, and finally print the value of your variable on a second line.

import java.util.*;
public class Solution {
	public static void main(String[] args) {
     
		Scanner scan = new Scanner(System.in); 
		
				String inputString = scan.nextLine(); 

		System.out.println("Hello, World.");
        System.out.println(inputString);
         scan.close(); 
      
	   }
}
