package helloword;

import java.util.Scanner;

public class userinp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		//System.out.println("enter a line of text:  ");
		
		int value = input.nextInt();
		//String line = input.nextLine();
		
		System.out.println("You entered: " + value);
		//System.out.println("You entered: " + line);
	}
}
