package array.comparableInterface;

import java.util.Arrays;

class Employee implements Comparable<Employee> {

	 String name;
	 int age;
	 int sal;

	public Employee(String name, int age, int sal) {

		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public String toString() {
		return String.format("(%s, %d, %d)",name,age,sal);
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if (age == emp.age) {
			System.out.println((sal - emp.sal));
			return (sal - emp.sal); // which one is less that will come first here like 
			// like 9000-10000 = -1000 return 9000
		}
		return (age - emp.age);

	}
}

public class Program1 {
	public static void main(String[] args) {
		Employee[] emp=new Employee[2];
		
		emp[0]=new Employee("Ali",22,9000);
		emp[1]=new Employee("Saleem",22,10000);
		
		Arrays.sort(emp);
		
		System.out.println(Arrays.toString(emp));

	}
}
