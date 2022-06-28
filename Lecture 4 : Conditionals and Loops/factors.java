/*
Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :

A single integer, n

Output Format :

All the factors of n excluding 1 and the number itself


Sample Input 1 :

8

Sample Output 1 :

2 4

*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    
    int i =2;
    
    while(i<=num-1){
        if(num%i==0){
            System.out.print(i+" ");
        }
        i+=1;
    }
        
    }
}
