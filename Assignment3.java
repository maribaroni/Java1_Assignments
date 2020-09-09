/*
 * Name:  Mariana Baroni
 * Assignment:  Assignment #3
 * Program: Computer Programmer
 * 
 * Compares (using IF statement) two integer numbers entered from the keyboard 
 * and prints a message whether they are equal or not. It is considered the 
 * case when the numbers are not equal to find and print the larger number.
 */

import java.util.Scanner;
public class Assignment3{
  public static void main(String[] args){
    Scanner keysIn = new Scanner(System.in);  
    System.out.println("Give me five numbers, with a \"enter\" after each one:");
    int n1 = keysIn.nextInt();  
    int n2 = keysIn.nextInt();    
    System.out.printf("Number1 = %d \t Number2 = %d \n",n1,n2);  
    if (n1!= n2){
      if (n1>n2){
        System.out.printf("The two numbers are not equal and Number1 (%d) is the larger one.\n",n1);
      }
      else{
        System.out.printf("The two numbers are not equal and Number2 (%d) is the larger one.\n",n2);
      }
    } 
    else{
       System.out.println("The two numbers are equal.");
    }
  }
}