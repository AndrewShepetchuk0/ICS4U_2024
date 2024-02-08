import java.util.*;
import java.io.*;

class SurfsUp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How tall are the waves? (in ft)");
		double w_height = input.nextDouble();
	
		if(w_height >= 6){
			System.out.println("Great day for surfing");
		}
		else if(w_height < 6 && w_height > 3){
			System.out.println("Go body boarding");
		}
		else if(w_height >= 3){
			System.out.println("Go for a swim");
		}
		else{
			System.out.println("Whoa! WHat kind of surf is that?");
		}
	}
}
