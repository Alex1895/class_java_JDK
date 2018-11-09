package hackerank;

import java.util.LinkedList;
import java.util.Scanner;

public class List_Problems 
{
	public static void List()
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> SL = new LinkedList<Integer>();
		
		int n, q, value, i , index;
		n=sc.nextInt(); q=sc.nextInt();
		/*if (SL.isEmpty() == true || SL.size() >= 0)
		{
			System.out.println("the array is empty"+SL);
		}else
		{*/
			for (i=0;i<n;i++)
			{
				value = sc.nextInt();
				SL.add(value);
			}
			for(i =0; i<q; i++)
			{
				String action = sc.next();
				if(action.equals("Insert"))
				{
					index =sc.nextInt();
					value = sc.nextInt();
					SL.add(index,value);
				}else if(action.equals("Delete"))
				{
					index = sc.nextInt();
					SL.remove(index);
				}else
				{
					System.out.println("Write correctly  the word (Insert or Delete)");
					System.exit(0);
				}
				sc.close();
				for(Integer num : SL)
				{
					System.out.println(num + " ");
				}
			}
		//}
	}
	public static void main(String[] args) 
	{
		List();
	}
}
