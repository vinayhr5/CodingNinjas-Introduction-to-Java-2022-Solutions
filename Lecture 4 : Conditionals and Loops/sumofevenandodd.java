/*
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :

 Integer N

Output format :

Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)


Sample Output 1:

6 4

Sample Input 2:

552245

*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
         Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    int sumeven = 0;
    int sumodd = 0;

    while (num != 0)
      {
	int rem = num % 10;

	if (rem % 2 == 0)
	  {
	    sumeven += rem;
	  }
	else
	  {
	    sumodd += rem;
	  }
	  num = num/10;
      }
    System.out.println (sumeven + " " + sumodd);

	}
}
