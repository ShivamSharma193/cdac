package tester;

import static utils.IOUtils.restoreEmployeeDetails;
import static utils.IOUtils.storeEmployeeDetails;
import static utils.populateAccount.populateList;
import static utils.populateAccount.populateMap;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import employee.Dept;
import employee.Desig;
import employee.Employee;

public class EmployeeMenu implements Serializable {
	public static void main(String[] argv) {

		List<Employee> empList = populateList();
		Map<Integer, Employee> map = populateMap(empList);

		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false ;
			while(!exit) {
				System.out.println("1. Restore employee details from file\n2. Services \n3. Exit");
				try {
					
					switch (sc.nextInt()) {
					case 1 :  // Restore Employee details from a file ----------------------
						System.out.print("Filename = ");
						restoreEmployeeDetails(sc.next());		
						break ;
					case 2 : // Service ----------------------------------------------------
						boolean exitService = false ;

						try {
						while(!exitService) {
							System.out.println("1. Add Employee Details\n2. Display All employee details"+
									"\n3. Retreive details by Employee id \n4. Delete Employee details "+
											"\n5. Display all Employees of a department \n6. Increase salary"
									+ "\n7. Exit Service Menu \n8. Exit App");
							switch (sc.nextInt()) {
							case 1:
								 /*
								 System.out.println("ID (int) = ") ;
								 Integer id = Integer.parseInt(sc.nextLine());
								 System.out.println(" Name(String)  = ") ;
								 String name = sc.nextLine() ;
								 System.out.println("Department(Finance, HR, OPERATIONS, RND) = ");
								 Dept dept = Dept.valueOf(sc.nextLine().toUpperCase()) ;
								 System.out.println("Salary(double) = " ) ;
								 Double salaray = Double.parseDouble(sc.nextLine()) ;
								 System.out.println(" Designation(SENIOR, JUNIOR, MANAGER, INTERN) = ");
								 Desig desig = Desig.valueOf(sc.nextLine().toUpperCase()) ;
								 */
								
								System.out.println("id, name, dept, salary, desig");
								Integer id = sc.nextInt() ;
								String name = sc.next();
								Dept dept = Dept.valueOf(sc.next().toUpperCase()) ;
								Double salary= sc.nextDouble() ;
								Desig desig = Desig.valueOf(sc.nextLine().toUpperCase().trim()) ;
								System.out.println("input is done");
//								sc.nextLine();
//								map.put(id, null);
								break ;
							case 2:
								
								break ;
							case 3 :
								
								break ;
							case 4 :
								
								break ;
							case 5 :
								
								break ;
							case 6 :
								
								break ;
							case 7 :
								exitService = true ;
								break ;
							case 8 :
								exitService = true ;
								exit = true ;
								break ;
							default :
								System.out.println("Please Enter valid option number");
							}
						}
//						sc.nextLine() ;
						} catch(Exception er) {
							er.printStackTrace();
							//break;
						}
						break ;
					case 3 : // Exit --------------------------------------------------------
						exit = true;
						System.out.println("Bye Bye!! \nSee you again!!");
						break ;
					default :
						System.out.println("Please Enter valid option number");
					}
				}catch(Exception e) {
					e.printStackTrace(); 
				//	sc.nextLine();
				}
				//storeEmployeeDetails(map, "emp.dat");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
