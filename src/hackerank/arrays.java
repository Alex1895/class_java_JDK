package hackerank;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		sc.close();
		for (int i =0; i<a.length; i++){
			a[i] = sc.nextInt();
			System.out.println(a[i]);
		}
	}
}
