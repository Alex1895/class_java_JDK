package hackerank;

import java.util.Scanner;


public class RegexProblem {
	/**
	 * problem regex: Check the Ip Address if some one is in range A,B,C 
	 * the length of the array is 3 for example 000.000.000
	 * valid Cases:
	 * 000.12.12.034, 121.234.12.12, 23.45.12.56
	 * invalid Cases:
	 * 000.12.234.23.23, 666.666.23.23, .213.123.23.32, 23.45.22.32. I.Am.not.an.ip
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String IpAddress = in.next();
			System.out.println(IpAddress.matches(new MyRegex().pattern));
		}
	}
}

