package hackerank;

import java.util.Scanner;

/**
 * 
 * @author miguelalejandro.a
 *
 */
public class subarray {
	public static void SubArray(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		 int count = 0, i,j,sum=0;
		sc.close();
		for (i =0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		for (j=0;j>=n;j++){
			 sum +=a[j] ;
				if(sum<0){
				count ++;
				}
			}
		System.out.println(count);
	}
	public static void main(String[] args) {
		SubArray();
	}
}
