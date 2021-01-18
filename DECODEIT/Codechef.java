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
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        int length=Integer.parseInt(ob.readLine());
	        String Alphabet[]={"a","b","c","d","e","f","g","h",
	                            "i","j","k","l","m","n","o","p"};
	        String codeForAlphabet[]={"0000","0001","0010","0011","0100",
	                                   "0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	        String BinaryValue=ob.readLine();
	        String Binary[]=new String[length/4];
	        String Answer="";
	        int j=0;
	        for(int i=0;i<BinaryValue.length();i=i+4)
	        {
	            Binary[j]=BinaryValue.substring(i,i+4);
	            j++;
	        }
	        for(int i=0;i<length/4;i++)
	        {
	            for(int k=0;k<codeForAlphabet.length;k++)
	            {
	                if(Binary[i].equals(codeForAlphabet[k]))
	                    Answer+=Alphabet[k];
	            }
	        }
	        System.out.println(Answer);
	    }
	}
}
