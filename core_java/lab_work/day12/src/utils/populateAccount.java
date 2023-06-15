package utils;

import static employee.Dept.FINANCE;
import static employee.Dept.HR;
import static employee.Dept.OPERATIONS;
import static employee.Dept.RND;
import static employee.Desig.INTERN;
import static employee.Desig.JUNIOR;
import static employee.Desig.MANAGER;
import static employee.Desig.SENIOR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employee.Employee;

public class populateAccount {
	public static List<Employee> populateList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Suraj", RND, 90000.0, SENIOR));
		empList.add(new Employee(2, "Rohan", RND, 90000.0, SENIOR));
		empList.add(new Employee(3, "Sujit", FINANCE, 85000.0, SENIOR));
		empList.add(new Employee(4, "Sunita", OPERATIONS, 65000.0, JUNIOR));
		empList.add(new Employee(5, "Nikita", FINANCE, 55000.0, JUNIOR));
		empList.add(new Employee(6, "Muskan", OPERATIONS, 70000.0, SENIOR));
		empList.add(new Employee(7, "Sajid", OPERATIONS, 30000.0, INTERN));
		empList.add(new Employee(8, "Yogesh", HR, 60000.0, MANAGER));
		return empList;
	}

	public static Map<Integer, Employee> populateMap(List<Employee> list) {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		for (Employee emp : list) {
			map.put(emp.getId(), emp);
		}
		return map;
	}
}
