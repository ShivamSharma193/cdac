package tester;

import static utils.IOUtils.*;
import static utils.populateAccount.populateList;
import static utils.populateAccount.populateMap;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import employee.Dept;
import employee.Desig;
import employee.Employee;
public class EmpWithBinFileTester implements Serializable{
	public static void main(String[] argv) {
		
		try(Scanner sc = new Scanner(System.in)){
//		Map<Integer, Employee> map = new HashMap<>() ;
//		map.put(1, new Employee(1, "Rohan", Dept.RND, 90000.0, Desig.SENIOR)) ;
		List<Employee> empList = populateList();
		Map<Integer, Employee> map = populateMap(empList);
		storeEmployeeDetails(map, "emp.dat");
		System.out.println(restoreEmployeeDetails("emp.dat") );	
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
