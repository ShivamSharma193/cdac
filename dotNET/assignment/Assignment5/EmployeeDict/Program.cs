using System.Collections;

namespace EmployeeDict
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            SortedList<int,Employee> empDict = new SortedList<int,Employee>();
            Employee emp = new Employee("Rohan", 40000,1) ;
            empDict.Add(emp.EmpNo, emp);
            emp = new Employee("Sujit", 80000, 1);
            empDict.Add(emp.EmpNo, emp);
            emp = new Employee("Suraj", 70000, 1);
            empDict.Add(emp.EmpNo, emp);
            emp = new Employee("Pradip", 50000, 1);
            empDict.Add(emp.EmpNo, emp);
            emp = new Employee("Rohan", 40000, 1);

            bool exit = false;
            while (!exit) {
                Console.WriteLine("Enter name, salary, deptno ");
                Console.WriteLine( "Name");
                string name = Console.ReadLine();
                Console.WriteLine("Salary");
                int sal = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Dept ");
                short dept = Convert.ToInt16(Console.ReadLine());
                Console.WriteLine("Dept no");
                emp = new Employee(name, sal, dept);
                empDict.Add(emp.EmpNo, emp) ;
                Console.WriteLine("Do you want to exit(y/n)?");
                if(Console.ReadLine().Trim()=="y") 
                    exit = true;
                else 
                    exit = false;
            }

            Employee highestSalEmp = emp;

            foreach (KeyValuePair<int,Employee> employee in empDict) {
                if(employee.Value.GetNetSalary() > highestSalEmp.GetNetSalary()) { 
                    highestSalEmp = employee.Value;
                }
            }
            Console.WriteLine($"Employee with highest salary {highestSalEmp}");

            Console.WriteLine("Enter a Employee number");
            int empNo = Convert.ToInt32(Console.ReadLine());
            foreach (KeyValuePair<int, Employee> employee in empDict)
            {
                if (employee.Key == empNo)
                {
                    Console.WriteLine(employee.Key);
                    Console.WriteLine(employee.Value);
                }
            }
        }

        static void Main2() {

            Employee[] empArray = new Employee[] {
                new Employee("Sujit", 80000, 1),
                new Employee("Suraj", 70000, 1),
                new Employee("Pradip", 50000, 1),
                new Employee("Rohan", 40000, 1)
            };

            List<Employee> empList = empArray.ToList();

            foreach (Employee emp in empList)
            {
                Console.WriteLine(emp);
            }
        }
        static void Main3() {

            List<Employee> empList= new List<Employee>();
            empList.Add(new Employee("Sujit", 80000, 1));
            empList.Add(new Employee("Suraj", 70000, 1));
            empList.Add(new Employee("Pradip", 50000, 1));
            empList.Add(new Employee("Rohan", 40000, 1));

            Employee[] empArray = empList.ToArray();
            foreach(Employee emp in empArray)
            {
                Console.WriteLine(emp);
            }

        }
    }
}