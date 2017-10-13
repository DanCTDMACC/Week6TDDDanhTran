package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.EmpBusinessLogic;
import model.Employee;

public class TestEmployeeLogic {
	
	EmpBusinessLogic empBL = new EmpBusinessLogic();
	Employee emp = new Employee("Danh");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateAppraisal() {
		emp.setMonthlySalary(8000);
		double appraisal = empBL.calculateAppraisal(emp);
		assertEquals(500, appraisal, 0.0);
	}

	@Test
	public void testCalculateYearlySalary() {
		emp.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(emp);
		assertEquals(96000, salary, 0.0);
	}

	@Test
	public void testEmployeeIsRetirementAge() {
		emp.setAge(70);
		assertTrue(empBL.isRetirementAge(emp));
	}
	
	@Test
	public void testEmployeeIsNotRetirementAge() {
		emp.setAge(25);
		assertFalse(empBL.isRetirementAge(emp));
	}
	
}
