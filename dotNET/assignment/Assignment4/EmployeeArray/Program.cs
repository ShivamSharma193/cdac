
using System.Collections.Concurrent;

namespace EmployeeArray
{
    internal class Program
    {
        
        static void Main()
        {
            List<Employee> empArray = new List<Employee>();
            empArray.Add(new Employee("Sujit", 80000, 1));
            empArray.Add(new Employee("Suraj", 70000, 1));
            empArray.Add(new Employee("Pradip", 50000, 1));
            empArray.Add(new Employee("Rohan",40000,1));

            Employee highestSalEmp = empArray[0];
            //foreach (Employee emp in empArray)
            //{
            //    if (emp.GetNetSalary() > highestSalEmp.GetNetSalary())
            //        highestSalEmp = emp;
            //}

            empArray.ForEach(
                emp => { if (emp.GetNetSalary() > highestSalEmp.GetNetSalary()) 
                        highestSalEmp = emp; 
                });
            Console.WriteLine($"Highest salaried employee is {highestSalEmp}");

            Console.WriteLine("Enter employee number");
            int empNo = Convert.ToInt32(Console.ReadLine());
            empArray.ForEach(emp => { if (emp.EmpNo == empNo) Console.WriteLine(emp); });
        }
    }


   
}