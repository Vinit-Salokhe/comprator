package com.collection.comparable;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new TreeSet();

		Employe e1 = new Employe(111, "Prem", "Kolhapur");
		Employe e2 = new Employe(112, "Pravin", "Stara");
		Employe e3 = new Employe(113, "Akash", "Karad");
		Employe e4 = new Employe(114, "Suraj", "Sangli");
		Employe e5 = new Employe(115, "Sandip", "Mumbai");

		set.add(e3);
		set.add(e1);
		set.add(e5);
		set.add(e2);
		set.add(e4);

		for (Object o : set) {
			System.out.println(o);
		}
	}

}
