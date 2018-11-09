package hackerank;

import java.util.Scanner;
interface AdvancedArithmetic{
 class InterfaceProblem {
	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
	}
	static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
	}
}
class MyCalculator implements AdvancedArithmetic{

	public int divisor_sum(int a)
    {

    int s=1;
    int f=0,v=0;
    while(s<=a)
        {
        if(a%s==0)
            {
            f=s;
            v+=f;
        }
        s++;

    }
    return v;
	}
}
}