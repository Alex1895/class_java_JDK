/*package hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortHackerrankProblem {
	class Student{
		private int id;
		private String fname;
		private double cgpa;
		public Student(int id, String fname, double cgpa) {
			super();
			this.id = id;
			this.fname = fname;
			this.cgpa = cgpa;
		}
		public int getId() {
			return id;
		}
		public String getFname() {
			return fname;
		}
		public double getCgpa() {
			return cgpa;
		}
	}
	class SortStudents implements Comparator <Student>{
		public int compare(Student a, Student b){
			if(a.getCgpa()==b.getCgpa()){
				if(a.getFname().equals(b.getFname())){
					return ((a.getId() < b.getId())? 1: -1); 
				}else{
					return a.getFname().compareTo(b.getFname());
				}
			}else{
				return ((a.getCgpa() < b.getCgpa())? 1: -1);
			}
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			testCases--;
		}
		Collections.sort(studentList, new SortStudents());
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
*/