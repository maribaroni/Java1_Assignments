/*
 * Name:  Mariana Baroni
 * Assignment:  Assignment #4
 * Program: Computer Programmer
 * 
 * Sutracts three integer numbers from the keyboard using two methods. The 
 * first subtraction method subtracts the first two numbers and the second 
 * subtraction method subtracts all the three numbers. The result is showed
 * in a message that also indicates if the total is negative or positive.
 */

import java.util.Scanner;

public class Assignment4{
  public static void main(String[] args){
    
    Scanner keysIn = new Scanner(System.in);  
    
    System.out.println("Please, Give me three integer numbers, with a \"enter\" after each one:");
    int n1 = keysIn.nextInt();  
    int n2 = keysIn.nextInt();
    int n3 = keysIn.nextInt();
    
    Subtract obj = new Subtract(n1,n2,n3);
    
    System.out.printf("The difference between the first two numbers is %d and it is %s. \n", obj.subtraction(n1,n2),obj.signal(obj.subtraction(n1,n2)));
    System.out.printf("The difference between all the entered numbers is %d and it is %s. \n",obj.subtraction(n1,n2,n3),obj.signal(obj.subtraction(n1,n2,n3)));
       
    }
}


class Subtract{
  
  int number1,number2,number3;
  
  Subtract(){ 
  } 
  
  Subtract(int newNumber1, int newNumber2, int newNumber3){
    number1 = newNumber1;
    number2 = newNumber2;
    number3 = newNumber3;
  }
  
  int subtraction(int n1, int n2){ 
    return (n1 - n2);
  }
  
  int subtraction(int n1, int n2, int n3){ 
    return (n1 - n2 - n3);
  }
  
  String signal(int n1){
    if (n1 > 0){
      return ("positive");}
    else if (n1 < 0){
        return ("negative");}
    else{ 
      return ("zero");}
  }
}