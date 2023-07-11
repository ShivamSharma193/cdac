using System;
using System.Collections.Generic;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Components.Web.Virtualization;
using Microsoft.Data.SqlClient; // IMP
using System.ComponentModel.DataAnnotations;    // IMP
using static System.Net.Mime.MediaTypeNames;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace EmployeeMVC1._0.Models
{
    public class Employee
    {
        // Properties
        [Key]
        [Display(Name = "Employee Id")]
        public int EmployeeId { get; set; }

        [DataType(DataType.Text)]
        [Required(ErrorMessage = "Please Enter the Employee Name")]
        [StringLength(10, ErrorMessage = "The {0} value cannot exceed {1} characters. ")]
        public string EmployeeName { get; set; }

        //[Range(1000, 500000, ErrorMessage = "Please enter values between 1000-500000")]
        //[MaxLength(6), MinLength(4)]
        //[EmailAddress]
        //[RegularExpression(@"^[a-zA-Z''-'\s]{1,40}$")]
        public string EmployeeCity { get; set; }

        public DateTime EmployeeDOB { get; set; }

        public string EmployeeGender { get; set; }

        public decimal EmployeeSalary { get; set; }
        public string Password { get; set; }

        //[Required(ErrorMessage = "Please enter confirm password")]
        //[Compare("Password", ErrorMessage = "Password and confirm password should be the same")]
        //[DataType(DataType.Password)]
        //public string ConfirmPassword { get; set; }


        // Methods

        // OpenConnection
        public static SqlConnection OpenConnection()
        {
            SqlConnection cn = new SqlConnection();
            // Edit this
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = NetExam; Integrated Security = True; Connect Timeout = 30; Encrypt = False";
            cn.Open();
            Console.WriteLine("Connection opened");
            return cn;
        }

        // GetSingleEmployees
        public static Employee GetEmployee(int empId)
        {
            SqlConnection cn = OpenConnection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = CommandType.Text;

            //                                              ColumnName PlaceHolder
            cmd.CommandText = "select * from Employee where EmployeeId=@EmpId";
            //                          @EmpId  MethodArgument
            cmd.Parameters.AddWithValue("EmpId", empId);

            Employee emp = new Employee();

            try
            {
                SqlDataReader dr = cmd.ExecuteReader();
                if (dr.Read())
                {
                    //  Property                ColumnNames
                    emp.EmployeeId = dr.GetInt32("EmployeeId");
                    emp.EmployeeName = dr.GetString("EmployeeName");
                    emp.EmployeeCity = dr.GetString("EmployeeCity");
                    emp.EmployeeDOB = dr.GetDateTime("EmployeeDOB");
                    emp.EmployeeGender = dr.GetString("EmployeeGender");
                    emp.EmployeeSalary = dr.GetDecimal("EmployeeSalary");
                }
                dr.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                cn.Close();
                Console.WriteLine("Connection closed");
            }

            return emp;
        }

        // GetAllEmployees
        public static List<Employee> GetEmployeesList()
        {

            SqlConnection connection = OpenConnection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = connection;
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "Select * from Employee";

            List<Employee> employeesList = new List<Employee>();
            try
            {
                //SqlDataReader dr = cmd.ExecuteReader(CommandBehavior.CloseConnection);
                SqlDataReader dr = cmd.ExecuteReader();
                while (dr.Read())
                {
                    Employee e = new Employee();
                    //  Property                ColumnNames
                    e.EmployeeId = dr.GetInt32("EmployeeId");
                    e.EmployeeName = dr.GetString("EmployeeName");
                    e.EmployeeCity = dr.GetString("EmployeeCity");
                    e.EmployeeDOB = dr.GetDateTime("EmployeeDOB");
                    e.EmployeeGender = dr.GetString("EmployeeGender");
                    e.EmployeeSalary = dr.GetDecimal("EmployeeSalary");
                    employeesList.Add(e);
                }
                dr.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            return employeesList;
        }

        // AddEmployee
        public static bool AddEmployee(Employee emp)
        {
            SqlConnection cn = OpenConnection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = CommandType.Text;
            // Auto Increment field shouldnt be there
            cmd.CommandText = "Insert into Employee values(@Name, @City, @Dob, @Gender, @Salary)";

                                     // Placeholders  Property
            //cmd.Parameters.AddWithValue("EmpId", emp.EmployeeId);
            cmd.Parameters.AddWithValue("Name", emp.EmployeeName);
            cmd.Parameters.AddWithValue("City", emp.EmployeeCity);
            cmd.Parameters.AddWithValue("Dob", emp.EmployeeDOB);
            cmd.Parameters.AddWithValue("Gender", emp.EmployeeGender);
            cmd.Parameters.AddWithValue("Salary", emp.EmployeeSalary);

            try
            {
                if (cmd.ExecuteNonQuery() > 0)
                    return true;
                else
                    return false;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return false;
            }
            finally
            {
                cn.Close();
                Console.WriteLine("Connection closed");
            }
        }

        // DeleteEmployee
        public static bool DeleteEmployee(int empId)
        {
            SqlConnection cn = OpenConnection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = CommandType.Text;
            //                                          ColumnNmae   PlaceHolder
            cmd.CommandText = "delete from Employee where EmployeeId=@EmpId";
            //                          Placeholder MethodArgument
            cmd.Parameters.AddWithValue("EmpId", empId);
            try
            {
                if (cmd.ExecuteNonQuery() > 0)
                    return true;
                else
                    return false;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return false;
            }
            finally
            {
                cn.Close();
                Console.WriteLine("Connection closed");
            }


        }

        // UpdateEmployee
        public static bool UpdateEmployee(Employee emp)
        { 
            SqlConnection cn = OpenConnection();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = cn;
            cmd.CommandType = CommandType.Text;
            cmd.CommandText = "update Employee set EmployeeName=@Name, EmployeeCity=@City, EmployeeDOB=@Dob, EmployeeGender=@Gender, EmployeeSalary=@Salary where EmployeeId=@EmpId";

            // Placeholders  Property
            cmd.Parameters.AddWithValue("EmpId", emp.EmployeeId);
            cmd.Parameters.AddWithValue("Name", emp.EmployeeName);
            cmd.Parameters.AddWithValue("City", emp.EmployeeCity);
            cmd.Parameters.AddWithValue("Dob", emp.EmployeeDOB);
            cmd.Parameters.AddWithValue("Gender", emp.EmployeeGender);
            cmd.Parameters.AddWithValue("Salary", emp.EmployeeSalary);

            try
            {
                if (cmd.ExecuteNonQuery() > 0)
                    return true;
                else
                    return false;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                return false;
            }
            finally
            {
                cn.Close();
                Console.WriteLine("Connection closed");
            }
        }

        
    }
}
