package com.dgodse.model;

public class User {
 private String name;
 private int age;
 private double salary;

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}
}
