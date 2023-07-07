using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Data.SqlClient;

namespace EmployeesManagement.Model
{
	public class Employee
	{
		public int EmpNo { get; set; }
		public string Name { get; set; }
		public decimal Basic { get; set; }
		public int DeptNo { get; set; }


	}
	public class EmployeeData {
		public static SqlConnection OpenConnection()
		{
			/*
			 * Open a connection to the database. 
			 * Get the connection string from database properties.
			 */

			SqlConnection cn = new SqlConnection();
			cn.ConnectionString = @" Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = ActsJune23; Integrated Security = True;  Encrypt = False";

			cn.Open();
			Console.WriteLine("Connection opened");

			return cn;
		}

		public static Employee GetEmployee(int empNo)
		{
			/*
			 * Get a single employee from the database using the employee no.
			 */
			SqlConnection cn = OpenConnection();

			SqlCommand cmd = new SqlCommand();
			cmd.Connection = cn;
			cmd.CommandType = CommandType.Text;

			// Add the query 
			cmd.CommandText = "select * from Employee where EmpNo=@EmpNo";
			cmd.Parameters.AddWithValue("EmpNo", empNo);

			Employee emp = new Employee();

			try
			{
				SqlDataReader dr = cmd.ExecuteReader();
				if (dr.Read())
				{
					emp.EmpNo = dr.GetInt32("EmpNo");
					emp.Name = dr.GetString("Name");
					emp.Basic = dr.GetDecimal("Basic");
					emp.DeptNo = dr.GetInt32("DeptNo");
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

		public static List<Employee> GetEmployeesList()
		{
			SqlCommand cmd = new SqlCommand();
			cmd.Connection = OpenConnection();
			cmd.CommandType = CommandType.Text;
			cmd.CommandText = "Select * from Employee ";

			List<Employee> employeesList = new List<Employee>();
			try
			{
				SqlDataReader dr = cmd.ExecuteReader(CommandBehavior.CloseConnection);
				while (dr.Read())
				{
					employeesList.Add(new Employee
					{
						EmpNo = dr.GetInt32("EmpNo"),
						Name = dr.GetString("Name"),
						Basic = dr.GetDecimal("Basic"),
						DeptNo = dr.GetInt32("DeptNo")
					}
					);
				}
				dr.Close();
			}
			catch (Exception e)
			{
				Console.WriteLine(e.Message);
			}

			return employeesList;
		}

		public static bool AddEmployee(Employee emp)
		{
			/*
			 * Add Employee to the database
			 * Return : true, if Atleast one row is affected
			 *          false, if no rows are affected
			 */
			SqlConnection cn = OpenConnection();
			SqlCommand cmd = new SqlCommand();
			cmd.Connection = cn;
			cmd.CommandType = CommandType.Text;
			cmd.CommandText = "Insert into Employee values(@EmpNo, @Name, @Basic, @DeptNo)";

			cmd.Parameters.AddWithValue("EmpNo", emp.EmpNo);
			cmd.Parameters.AddWithValue("Name", emp.Name);
			cmd.Parameters.AddWithValue("Basic", emp.Basic);
			cmd.Parameters.AddWithValue("DeptNo", emp.DeptNo);
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

		public static bool DeleteEmployee(int empNo)
		{
			/*
			 * Delete employee using employee no. 
			 * Return : true, if atleast one row is affected
			 *          false, if no rows are affected
			 */
			SqlConnection cn = OpenConnection();
			SqlCommand cmd = new SqlCommand();
			cmd.Connection = cn;
			cmd.CommandType = CommandType.Text;
			cmd.CommandText = "delete from Employee where EmpNo=@EmpNo";
			cmd.Parameters.AddWithValue("EmpNo", empNo);
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

		public static bool UpdateEmployee(Employee emp)
		{
			/*
			 * Update an employee 
			 * Return : true, if at least one row is updated
			 *          false, if 0 rows are affected.
			 */
			SqlConnection cn = OpenConnection();
			SqlCommand cmd = new SqlCommand();
			cmd.Connection = cn;
			cmd.CommandType = CommandType.Text;
			cmd.CommandText = "update Employee set Name=@Name, Basic=@Basic, DeptNo=@DeptNo where EmpNo=@EmpNo";
			// Set parameters
			cmd.Parameters.AddWithValue("EmpNo", emp.EmpNo);
			cmd.Parameters.AddWithValue("Name", emp.Name);
			cmd.Parameters.AddWithValue("Basic", emp.Basic);
			cmd.Parameters.AddWithValue("DeptNo", emp.DeptNo);
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

