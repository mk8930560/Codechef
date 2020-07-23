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
		    int length = sc.nextInt();
			int NOmbrP = sc.nextInt();
			int arr[] = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
			}
			int catwalk = 0;
			int hard = 0;
			for (int i = 0; i < length; i++) {
				if (arr[i] >= NOmbrP / 2) {
					catwalk++;
				} else if (arr[i] <= NOmbrP / 10) {
					hard++;
				}
			}
			if (catwalk == 1 && hard == 2) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		    
		}
	}
}
