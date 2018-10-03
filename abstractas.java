package training;
import java.util.*;
 
	abstract public class abstractas(){
		abstract void abstractmetodo(); 
		public void implementedMethod() { System.out.print("implementedMethod()"); }
	    final public void finalMethod() { System.out.print("finalMethod()"); }
	public class test1 extends abstractas{
	    public void abstractMethod() { System.out.print("abstractMethod()"); }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	}