import java.util.*;
import java.io.*;

class therapist{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How are you feeling today? ");
		String feelings = input.nextLine();

		if(feelings.equals("great")){
			System.out.println("That's great");
		}
		else if(feelings.equals("good")){
			System.out.println("That's good");
		}
		else if(feelings.equals("okay")){
			System.out.println("that's okay");
		}
		else if(feelings.equals("terrible")){
			System.out.println("Haha");
		}
		else{
			System.out.println("Your answer is invalid, just like your feelings");
		}
	}
}
