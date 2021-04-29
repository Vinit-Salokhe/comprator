package com.collection.comparable;

public class Employe implements Comparable<Employe> {
	int id;
	String name;
	String Address;

	public Employe(int id, String name, String address) {
		this.id = id;
		this.name = name;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String toString() {
		return "Employe [Emp id=" + getId() + ", Name=" + getName() + ", Address=" + getAddress() + "]";
	}

	public int compareTo(Employe o) {
		return this.getName().compareTo(o.getName());
	}
}
