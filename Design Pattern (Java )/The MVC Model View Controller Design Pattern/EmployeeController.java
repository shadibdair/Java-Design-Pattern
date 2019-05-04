package controller;

import model.Employee;
import view.EmployeeDashboardView;

public class EmployeeController {

	private Employee employeeModel;
	private EmployeeDashboardView view;
	
	
	public EmployeeController(Employee employeeModel, EmployeeDashboardView view) {
		super();
		this.employeeModel = employeeModel;
		this.view = view;
	}
	
	public void setEmployee(String name,String lastNmae) {
		employeeModel.setFirstName(name);
		employeeModel.setLastName(lastNmae);
	}
	
	public String getEmployeeName() {
		return employeeModel.getFirstName() + " " + employeeModel.getLastName();
	}
	
	public void setSSN(String ssn) {
		employeeModel.setSsNumber(ssn);
	}
	
	public String getSSN() {
		return employeeModel.getSsNumber();
	}
	
	// Update our view 
	public void updateDashboardView() {
		view.printEmployeeInformation(employeeModel);
	}
}
