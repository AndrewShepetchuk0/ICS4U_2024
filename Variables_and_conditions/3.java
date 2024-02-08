import java.util.*;
import java.io.*;

class converter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Input temperature: ");
    double temp = input.nextDouble();
    input.nextLine();
    System.out.println("Input units (either 'C' or 'F'): ");
    String unit = input.nextLine();

    if(unit.equals("F")){
      double conv_temp = (temp-32)*5/9;
      System.out.println("The temperature in celcius is " + conv_temp + " degrees");
    }
    else if(unit.equals("C")){
      double conv_temp = ((9/5)*temp) +32;
      System.out.println("The temperature in fahrenheit is " + conv_temp + " degrees");
    }
    else{
      System.out.println("THe unit you entered is not valid");
    }
  }
}
