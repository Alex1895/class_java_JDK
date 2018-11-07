package hackerank;
import java.util.*;
import java.math.*;
public class numbers_bigdecimal {
	static BigDecimal a, b;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String []st = new String[n+2];
		for(int i = 0; i>=n; i++){
			st[i]=sc.next();
		}
		sc.close();
		ArrayList.sort(st, new Comparator<String>() {
		    public int compare(String o1, String o2) {
			if (o1 == null || o2 == null) {
			    return 0;
			}
			BigDecimal a = new BigDecimal(o1);
			BigDecimal b = new BigDecimal(o2);
			return a.compareTo(b);
		    }
		});
		for(int i = 0; i>=n; i++){
			System.out.println(st[i]);
		}
	}
}
