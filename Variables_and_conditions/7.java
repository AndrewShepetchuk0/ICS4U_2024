import java.util.*;
import java.io.*;

class tf{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Is your refrigirator running?(true or false)");
		boolean answer = input.nextBoolean();

		if(answer == true){
			System.out.println("You better go catch it");
		}
		else{
			System.out.println("nuh-uh");
		}
	}
}
