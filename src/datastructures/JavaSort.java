package datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<>();
		while(testCases>0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			Collections.sort(studentList, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {		
					if (o1.getCgpa()==o2.getCgpa()) {
						int nameCompare = o1.getFname().compareTo(o2.getFname());
						if (nameCompare == 0) 
							return o1.getId() - o2.getId();
						else 
							return nameCompare;
					} else
						return (int) (o2.getCgpa() * 1000 - o1.getCgpa() * 1000);
				}
			});
					
			testCases--;
		}
		
		for(Student st: studentList) {
			System.out.println(st.getFname());
		}

	}
		
}

class Student {
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