package training;
import java.util.*;
public class collections {
	public void algo1() { //metodo set
		Collection <String> st = new HashSet<String>();
		st.add("hola");
		System.out.println(st);
	}
	public void algo2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("español");
		list.add("mate");
		list.add("quimica");
		list.add("historia");
		list.add("ingles");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
			if(i ==list.size()) {
				System.out.println(i);
			}else {
				System.out.println("list is full");
			}
		}
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("alex");
		list2.add("alex");
		list2.add("alex");
		list2.add("alex");
		list2.add("alex");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
