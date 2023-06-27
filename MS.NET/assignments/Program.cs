using System.Numerics;

namespace day1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee employee = new Employee();
            employee.Name = "Suraj";
            employee.EmpNo = 1;
            employee.Basic = 799999;
            employee.DeptNo =  1 ;

            decimal netSal = employee.GetNetSalary();

            Console.WriteLine(employee.Name + " " + employee.EmpNo 
                + " " + employee.Basic  + " " +  employee.DeptNo  );
            Console.WriteLine(netSal);
        }
    }

    public class Employee {
        private string name;
        public string Name {
            set {
                if (value.Trim().Length != 0)
                    name = value;
                else
                    Console.WriteLine("Name cannot be blank");
            }

            get {
                return name;
            }
        }

        private int empNo;
        public int EmpNo {
            set {
                if (value > 0)
                    empNo = value;
                else
                    Console.WriteLine("Employee no. must be greater than 0");         
            }

            get { 
                return empNo;
            }
        
        }

        private decimal basic;
        public decimal Basic { 
            set {
                // must be between 30k and 80k 
                if (value > 30000 && value <= 800000)
                    basic = value;
                else
                    Console.WriteLine("Basic salary should be between 30000 and 80000");
            } 
            
            get {  
                return basic; 
            }
        }
        
        private short deptNo;
        public short DeptNo {
            set {
                if (value > 0)
                    deptNo = value;
                else
                    Console.WriteLine("Dept no must be greater than 0 ");
            }
            get
            {
                return deptNo;  
            }
        
        }

        public decimal GetNetSalary() {
            decimal netSalary = Decimal.Multiply(1.2m,basic);
            return  1.2m * basic;
        }

    }
}