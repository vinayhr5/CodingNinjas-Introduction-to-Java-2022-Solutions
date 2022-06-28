/*
Write a program to print multiplication table of n
Input Format :

A single integer, n

Output Format :

First 10 multiples of n each printed in new line

Sample Input 1 :

2

Sample Output 1 :

2
4
6
8
10
12
14
16
18
20


*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    int count = 1;

    while (count <= 10)
      {
	int result = num * count;
	  System.out.println (result);
	  count += 1;
      }

	}
}
