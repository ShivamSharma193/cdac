using EmployeeMVC1._0.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace EmployeeMVC1._0.Controllers
{
    public class EmployeeController : Controller
    {
        // GET: EmployeeController
        public ActionResult Index()
        {
            List<Employee> empList = Employee.GetEmployeesList();
            return View(empList);
        }

        // GET: EmployeeController/Details/5
        public ActionResult Details(int id)
        {
            Employee emp = Employee.GetEmployee(id);
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
        // Mehtod signature changed accordingly
        public ActionResult Create(Employee emp)
        {
            try
            {
                Employee.AddEmployee(emp);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeeController/Edit/5
        // Update emp method called
        public ActionResult Edit(int id)
        {
            Employee emp = Employee.GetEmployee(id);
            Employee.UpdateEmployee(emp);
            return View(emp);
        }

        // POST: EmployeeController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        // Method signature changed accordingly
        public ActionResult Edit(Employee emp)
        {
            try
            {
                Employee.UpdateEmployee(emp);
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
            Employee.DeleteEmployee(id);
            return View();
        }

        // POST: EmployeeController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // Get
        public ActionResult LoginPage()
        {
            return View();
        }

        [HttpPost]
        public ActionResult LoginPage(Employee emp)
        {
            Employee employee = Employee.GetEmployee(emp.EmployeeId);
            
            // Temporary line
            employee.Password = "123";

            if (emp.Password == employee.Password)
                return RedirectToAction(nameof(Details), new { id = emp.EmployeeId });
            return View(emp);
        }


    }
}
