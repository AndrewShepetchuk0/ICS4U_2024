import java.util.*;
import java.io.*;

class grade{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Input your grade: ");
    int grade = input.nextInt();

    if(grade < 50){
      System.out.println("You failed");
    }
    else if(grade >= 50 && grade < 55){
      System.out.println("You got a D");
    }
    else if(grade >= 55 && grade < 60){
      System.out.println("You got a C");
    }
    else if(grade >= 60 && grade < 65){
      System.out.println("You got a C+");
    }
    else if(grade >= 65 && grade < 70){
      System.out.println("You got a B-");
    }
    else if(grade >= 70 && grade < 75){
      System.out.println("You got a B");
    }
    else if(grade >= 75 && grade < 80){
      System.out.println("You got a B+");
    }
    else if(grade >= 80 && grade < 85){
      System.out.println("You got an A-");
    }
    else if(grade >= 85 && grade < 90){
      System.out.println("You got an A");
    }
    else if(grade >= 90){
      System.out.println("You got an A+");
    }
    else{
      System.out.println("Input invalid");
    }
  }
}
