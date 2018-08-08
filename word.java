/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int word=sc.nextInt();
		int words=2;
		for(int i=0;i<word;i++)
		{
			if(word==0)
			words++;
		}
		System.out.println("number of words:"+words);
		}
}
