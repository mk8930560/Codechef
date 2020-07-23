/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int max = 1;
			int count = 0;
			for (int i = n - 1; i >= 1;) {
				if (count == 2)
					break;
				if (arr[i] == arr[i - 1]) {
					max *= arr[i];
					i = i - 2;
					count++;
				} else {
					i--;
				}
			}
			if (count == 2) {
				System.out.println(max);
			} else if (count == 1) {
				System.out.println("-1");
			}
		    
		}
	}
}
