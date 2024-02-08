import java.util.*;
import java.io.*;

class calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first intiger");
		int num1 = input.nextInt();
		System.out.println("Enter the second intiger");
		int num2 = input.nextInt();
		input.nextLine();
		System.out.println("Enter the operation");
		String op = input.nextLine();

		if(op.equals("+")){
			int res = num1 + num2;
			System.out.println("The result is " + res);
		}
		else if(op.equals("-")){
			int res = num1 - num2;
			System.out.println("The result is " + res);
		}
		else if(op.equals("*")){
			int res = num1 * num2;
			System.out.println("The result is " + res);
		}
		else if(op.equals("/")){
			int res = num1 / num2;
			System.out.println("The result is " + res);
		}
		else{
			System.out.println("Either the operation or numbers aren't valid");
		}
	}
}
