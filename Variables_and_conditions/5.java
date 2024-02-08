import java.util.*;
import java.io.*;

class area{
  static public void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Input the length: ");
    int l = input.nextInt();
    System.out.println("Input the width: ");
    int w = input.nextInt();

    if(l <= 0){
      System.out.println("The length is an invalid number");
    }
    else if(w <= 0){
      System.out.println("The width is an invalid number");
    }
    else{
      System.out.println("The area is " + w * l);
    }
  }
}
