import java.io.*;
import java.util.*;

class equalities{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //user input
    System.out.println("Input the first number: ");
    int num1 = input.nextInt();
    System.out.println("Input the second number: ");
    int num2 = input.nextInt();

    //Determines which number is bigger or if the numbers are equal
    if(num1 > num2){
      System.out.println("The first number is bigger");
    }
    else if(num1 < num2){
      System.out.println("The second number is bigger");
    }
    else{
      System.out.println("The numbers are equal");
    }
  }
}
