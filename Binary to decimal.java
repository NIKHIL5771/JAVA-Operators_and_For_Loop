/*
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N=s.nextInt();
         int placeValue=1;
            int decimal=0;
        while(N!=0)
        {  
            int rem=N%10;
            decimal=decimal+(rem*placeValue);
             N=N/10;
         placeValue=placeValue*2;
        }
        System.out.println(decimal);

	}
}
