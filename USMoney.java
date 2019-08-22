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

public class USMoney
{
  private int dollars;
  private int cents;
  
  // Constructor that initializes the two instance variables
  public USMoney(int newDollars, int newCents)
  {
    dollars = newDollars;
    cents = newCents;
    if (cents < 0)
    {
      int num = cents / 100;
      cents = cents % 100;
      dollars += num;
     }
    if (cents > 99)
    {
      int num = cents / 100;
      cents = cents % 100;
      dollars += num;
     }
  }  
  
  // dollars get method
  public int getDollars()
  {
    return dollars;
  }
  
  // cents get method
  public int getCents()
  {
    return cents;
  }
  
  // plus method
   public USMoney plus (USMoney money)
  {
    USMoney sum = new USMoney(dollars + money.getDollars(), cents + money.getCents());

    if (cents < 0)
    {
      cents +=100;
      dollars--;
    }
    if (cents > 99)
    {
      cents -=100;
      dollars++;
    }
    
     return sum;
  }
} 