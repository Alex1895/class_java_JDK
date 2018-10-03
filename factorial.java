package training;

import java.util.*;
import java.math.*;
public class factorial{
    static BigInteger factorial(int n)
    {
        BigInteger r = BigInteger.valueOf(1);
        for(int i = 1 ; i <= n ; ++i)
        {
            r = r.multiply(BigInteger.valueOf(i));
        }
        return r;
    }
    public static void main (String ... args){
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int n = in.nextInt();
        BigInteger a = factorial(n);
        System.out.println(a);
    }
}
