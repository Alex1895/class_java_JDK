package hackerank;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 * @author miguelalejandro.a
 * problema:
 * hacer un programa que compare dos listas (a,b) y (c,d) y donde se repita un elemento de la lista mostrar un numero  
 * 
 */
public class HashSetProblemHackerrank {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        HashSet<String> pairs = new HashSet<String>(t);
        for (int i = 0; i < t; i++) {
        	pairs.add(pair_left[i]+"_"+pair_right[i]);
        	System.out.println(pairs.size());
            //pair_left[i] = s.next();
            //pair_right[i] = s.next();
	}
	}
}
