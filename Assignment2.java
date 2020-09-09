/*
 * Name:  Mariana Baroni
 * Assignment:  Assignment #2
 * Program: Computer Programmer
 * 
 * Warns the user about the request of 5 numbers, calculates the sum and the average of numbers, the square root of 
 * sum and the square of each number and prints the results.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment2 {
  public static void main(String[] args) {
    Scanner keysIn = new Scanner(System.in);
    float sum = 0;
    JOptionPane.showMessageDialog(null,"May I ask you to enter five numbers?","Hi user!",JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(null,"\n Remember, they can be integers or floats. Your choice! \n Please, see the console.","Thanks!",JOptionPane.INFORMATION_MESSAGE);
    System.out.println("Give me five numbers, with a \"enter\" after each one:");
    float n1 = keysIn.nextFloat();  
    float n2 = keysIn.nextFloat();  
    float n3 = keysIn.nextFloat(); 
    float n4 = keysIn.nextFloat(); 
    float n5 = keysIn.nextFloat(); 
    System.out.printf("Num 1= %10.2f\nNum 2= %10.2f\nNum 3= %10.2f\nNum 4= %10.2f\nNum 5= %10.2f\n",n1,n2,n3,n4,n5);
    sum = (n1+n2+n3+n4+n5);
    System.out.printf("The Sum of all entered numbers = %10.2f\n",sum);
    System.out.printf("The average of numbers = %10.2f\n",sum/5);
    System.out.printf("The Square Root of Sum = %10.2f\n",Math.sqrt(sum));
    System.out.printf("Num1^2= %10.2f \t Num2^2= %10.2f \t Num3^2= %10.2f \t Num4^2= %10.2f \t Num5^2= %10.2f\n", Math.pow(n1,2), Math.pow(n2,2), Math.pow(n3,2), Math.pow(n4,2), Math.pow(n5,2));
  }
}