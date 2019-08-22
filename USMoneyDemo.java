/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 3           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  9/21/18 11:59p.m.                                *
 *                                                                   *
 *  Purpose:        A java program for a class called USMoney that a *
 *                  person might use to represent dollars and cents  *
 ********************************************************************/

import java.util.Scanner;                                // import the Scanner class to read input data

public class USMoneyDemo
{
  public static void main(String[] args)
  {
    int dollars;                                         // used to hold dollars
    int cents;                                           // used to hold cents
                                                
    
    Scanner xAmount = new Scanner(System.in);            // scanner to gets keyboard input from user.
    
    System.out.print("Enter first dollar amount: ");     // print statment to prompt user input
    dollars = xAmount.nextInt();                         // Use method nextInt to read an input dollars
    
    System.out.print("Enter first cents amount: ");      // print statment to prompt user input
    cents = xAmount.nextInt();                           // Use method nextInt to read an input dollars

    USMoney x = new USMoney(dollars, cents);             // initialize scanner object for first amount

    Scanner yAmount = new Scanner(System.in);            // scanner to gets keyboard input from user.
    
    System.out.print("Enter second dollar amount: ");    // print statment to prompt user input
    dollars = yAmount.nextInt();                         // Use method nextInt to read an input dollars
    
    System.out.print("Enter second cents amount: ");     // print statment to prompt user input
    cents = yAmount.nextInt();                           // Use method nextInt to read an input cents
    
    USMoney y = new USMoney(dollars, cents);             // initialize scanner object for second amount
    
    USMoney total = x.plus(y);                           // save calculated amount to total
   
    System.out.printf("\nTotal amount: $%d.%02d\n ", total.getDollars(), total.getCents());    // print total amount
    
    xAmount.close();                                     // close the scanner
    yAmount.close();                                     // close the scanner
  } 
 }   
    
    
    