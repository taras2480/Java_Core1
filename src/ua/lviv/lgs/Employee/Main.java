package ua.lviv.lgs.Employee;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// task1
		File file = new File("serialization.txt");
		Employee emp = new Employee("Taras", 15, 5000.5);
		System.out.println(emp);
		emp.getMethods().serialize(file, emp);

		Employee emp2 = (Employee) emp.getMethods().deSerialize(file);
		System.out.println(emp2);
		System.out.println();

		// task2
		File file1 = new File("serialization1.txt");
		EmployeeTransientSalary emp1 = new EmployeeTransientSalary("Taras", 15, 5000.5);
		System.out.println(emp1);
		emp1.getMethods().serialize(file1, emp1);

		EmployeeTransientSalary emp3 = (EmployeeTransientSalary) emp1.getMethods().deSerialize(file1);
		System.out.println(emp3);
		System.out.println();

		// task3
		File file2 = new File("serialization2.txt");
		List<Employee> lemp = new ArrayList<>();

		lemp.add(new Employee("Oleg", 18, 4000.0));
		lemp.add(new Employee("Vasya", 17, 3000.0));
		lemp.add(new Employee("Igor", 20, 2000.0));
		lemp.add(new Employee("Sasha", 11, 1000.0));
		lemp.add(new Employee("Kira", 23, 8000.26));
		lemp.add(new Employee("Klaus", 13, 2000.0));

		System.out.println(lemp);

		Methods.serialize(file2, (Serializable) lemp);

		ArrayList<Employee> lemp2 = (ArrayList<Employee>) Methods.deSerialize(file2);
		System.out.println(lemp2);

	}

}
