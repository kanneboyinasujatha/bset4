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
		int n1=0,n2=1,n3,count=10;
		System.out.println(n1+""+n2);
		for(int i=2;i<count;i++)
		{
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
		  System.out.println(n3+"");
		}
	}
}
