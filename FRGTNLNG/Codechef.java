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
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		while (t-- > 0) {
			String data[] = ob.readLine().split(" ");
			int TotalForgotenword = Integer.valueOf(data[0]);
			int TotalModrenWordPhrase = Integer.valueOf(data[1]);

			String ForgotenWords[] = ob.readLine().split(" ");

			ArrayList<String> Modernwords = new ArrayList<String>();

			for (int i = 0; i < TotalModrenWordPhrase; i++) {
				String data2[] = ob.readLine().split(" ");
				for (int j = 1; j < data2.length; j++) {
					Modernwords.add(data2[j]);
				}
			}
			for(int i=0;i<ForgotenWords.length;i++)
		    {
		        if(Modernwords.contains(ForgotenWords[i]))
		        {
		            System.out.print("YES ");
		        }
		        else
		        {
		            System.out.print("NO ");
		        }
		    }
		    System.out.println();
		}
	}
}
