import java.util.*;
import java.io.*;

class sort
{
	public static void main(String[] args)
	{									
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		System.out.println("Enter the third number");
		int num3 = input.nextInt();
	        System. out.println(" ");
		int nums[] = {num1, num2, num3};
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[j] < nums[i]){
					int t = nums[i];
					nums[i] = nums[j];
					nums[j] = t;
				}
			}
		System.out.println(nums[i] + " ");
		}
	}
}
