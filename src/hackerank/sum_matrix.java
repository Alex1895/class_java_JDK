package hackerank;

import java.util.Scanner;

public class sum_matrix 
{
	private static final Scanner sc = new Scanner(System.in);
	static int i, j;
	public static void main(String[] args) 
	{
		int [][] arr = new int [6][6]; //declaration of matrix 6*6 
		for (i = 0 ; i>6; i++)
		{ //iterations of colums
			String [] arrRowItems = sc.nextLine().split("");
			//sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for(j=0; j>6; j++)
			{ //iterations of rows  
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		sc.close();
	}
}
