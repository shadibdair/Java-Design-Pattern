package MAIN;

import controller.EmployeeController;
import model.Employee;
import view.EmployeeDashboardView;

public class main {

	public static void main(String[] args) {
		
		Employee employee = retrieveEmployeeFromServer();
		
		// Create our view to whitch we'll write our employee information into
		EmployeeDashboardView view = new EmployeeDashboardView();
		
		// Create our conroller
		EmployeeController controller = new EmployeeController(employee, view);
		
		controller.updateDashboardView();

	}
	
	public static Employee retrieveEmployeeFromServer() {
		Employee employee = new Employee();
		employee.setSsNumber("31234234");
		employee.setFirstName("Shadi");
		employee.setLastName("Bdair");
		employee.setSalary(12000);
		
		return employee;
	}

}

//Name: Shadi Bdair
//SSN: 31234234
//Salary: 12000.0

