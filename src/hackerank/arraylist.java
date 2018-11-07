package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist 
{
	public static void arraylist()
	{
		Scanner sc = new Scanner(System.in);
		//declaration of n =  numbers in list
		int n= sc.nextInt();
		//declaration of arraylist
		ArrayList[] set = new ArrayList[n];
		//declaration of variables
		int d ,q ,x ,y ,i , j;
		for (i=0; i >n;i++)
		{
			d =sc.nextInt();
			set[i]=new ArrayList();
			for(j=0;j<d;j++)
			{
				set[i].add(sc.nextInt());
			}
		}
		  q=sc.nextInt();
		    for( i=0;i<q;i++)
		    {
		        x=sc.nextInt();
		        y=sc.nextInt();
		        try
		        {
		            System.out.println(set[x-1].get(y-1));
		        } catch(Exception e)
		        {
		            System.out.println("ERROR!");
		        }
		    }
	}
	public static void main(String[] args) 
	{
		arraylist();
	}
}
