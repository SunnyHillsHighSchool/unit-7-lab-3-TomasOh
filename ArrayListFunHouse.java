//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tomas Oh

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //Create an ArrayList of Integers called ListOfFactors
  ArrayList<Integer> ListOfFactors = new ArrayList<Integer>();
  //Create a for loop to iterate through all of the numbers from 2 to one value before the number passed as a parameter
  for(int x = 2; x < number; x++)
  {
    //Create an if-statement that will check if the remainder of number divided by x
    if(number%x == 0)
    {
      //Call for method add() to add the number that is currently passed in the array list
      ListOfFactors.add(x);
    }
    //Exit if-statement and for loop
  }
  //Return ListOfFactors and enclose method
  return ListOfFactors;  

 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   //Create a for loop which will iterate through all of the elements in the ArrayList, starting from the LAST INDEX (initialize with int x = nums.size() - 1)
   for(int x = nums.size() - 1; x >= 0; x--)
   {
     //Create an if-statement to check if the number at position x of the ArrayList has 0 factors (using the getListOfFactors method and size() method to see if it is equal to 0)
     if(getListOfFactors(nums.get(x)).isEmpty())
     {
       //Remove the value of the ArrayList at position x
       nums.remove(x);
     }
     //End if-statement and for loop
   }
   //Close the method
 }
}