package com.cognizant;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.model.Department;
import com.cognizant.model.Employee;
import com.cognizant.service.DepartmentService;
import com.cognizant.service.EmployeeService;
import com.cognizant.service.SkillService;

@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Autowired
	private static EmployeeService employeeService;

	@Autowired
	private static DepartmentService departmentService;

	@Autowired
	private static SkillService skillService;

	private static void testGetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");
	}

	private static void testAddEmployee() {
		LOGGER.info("Start");
		Employee employee = new Employee();
		System.out.println(departmentService);
		Department department = departmentService.get(2);
		System.out.println("Depart" + department);
		employee.setName("Emp 4");
		employee.setDateOfBirth(new Date(95, 10, 10));
		employee.setSalary(60800d);
		employee.setPermanent(true);
		employee.setDepartment(department);
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", department);
		LOGGER.info("End");
	}

	private static void testUpdateEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(2);
		Department department = departmentService.get(2);
		employee.setDepartment(department);
		employeeService.save(employee);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", department);
		LOGGER.info("END");

	}

	private static void testAddSkillToEmployee() {
		Employee employee = employeeService.get(5);
		employee.getSkillList().add(skillService.get(6));
		employeeService.save(employee);

	}

	private static void testGetDepartment() {
		Department department = departmentService.get(2);
		LOGGER.debug("Department:{}", department);
		LOGGER.debug("Employee:{}", department.getEmployeeList());
	}

	public static void testGetAllPermanentEmployees() {
		LOGGER.info("Start");
		List<Employee> employees = employeeService.getAllPermanentEmployees();
		LOGGER.debug("Permanent Employees:{}", employees);
		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
		LOGGER.info("End");
	}

	private static void testGetAverageSalary() {
		LOGGER.debug("Average Salary {}", employeeService.getAverageSalary());
	}

	private static void testGetAverageSalary(int id) {
		LOGGER.debug("Avrage Salary of Dept_id 2 is {}", employeeService.getAverageSalary(id));
	}

	private static void testGetAllEmployeeNative() {
		LOGGER.debug("NATIVE Employee Query {}", employeeService.getAllEmployeeNative());
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		// testAddEmployee();
		// testUpdateEmployee();
		// testGetDepartment();
		// testAddSkillToEmployee();
		//testGetAllPermanentEmployees();
		//testGetAverageSalary();
		//testGetAverageSalary(2);
		testGetAllEmployeeNative();
	}

}
