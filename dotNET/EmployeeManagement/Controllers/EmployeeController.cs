using EmployeesManagement.Model;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace EmployeesManagement.Controllers
{
	public class EmployeeController : Controller
	{
		// GET: EmployeeController
		public ActionResult Index()
		{
			List <Employee> empList = EmployeeData.GetEmployeesList();
            return View(empList);
		}

		// GET: EmployeeController/Details/5
		public ActionResult Details(int id)
		{
			Employee emp = EmployeeData.GetEmployee(id);
			return View(emp);
		}

		// GET: EmployeeController/Create
		public ActionResult Create()
		{

			return View();
		}

		// POST: EmployeeController/Create
		[HttpPost]
		[ValidateAntiForgeryToken]
		public ActionResult Create(Employee emp)
		{
			try
			{
				EmployeeData.AddEmployee(emp);
				return RedirectToAction(nameof(Index));
			}
			catch
			{
				return View();
			}
		}

		// GET: EmployeeController/Edit/5
		public ActionResult Edit(int id)
		{	
			Employee emp = EmployeeData.GetEmployee(id);	
			return View(emp);
		}

		// POST: EmployeeController/Edit/5
		[HttpPost]
		[ValidateAntiForgeryToken]
		public ActionResult Edit(Employee emp)
		{
			try
			{	
				EmployeeData.UpdateEmployee(emp);
				return RedirectToAction(nameof(Index));
			}
			catch
			{
				return View();
			}
		}

		// GET: EmployeeController/Delete/5
		public ActionResult Delete(int id)
		{
			Employee emp = EmployeeData.GetEmployee(id);
			return View(emp);
		}

		// POST: EmployeeController/Delete/5
		[HttpPost]
		[ValidateAntiForgeryToken]
		public ActionResult Delete(int id, IFormCollection collection)
		{
			try
			{
				EmployeeData.DeleteEmployee(id);
				return RedirectToAction(nameof(Index));
			}
			catch
			{
				return View();
			}
		}
	}
}
