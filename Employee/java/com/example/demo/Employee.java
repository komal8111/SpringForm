package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int emp_id;
		
		
		String emp_firstname,emp_lastname,emp_department,emp_email,emp_address,emp_gender;
		int emp_salary;
		
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public void setEmp_firstname(String emp_firstname) {
			this.emp_firstname = emp_firstname;
		}
		public void setEmp_lastname(String emp_lastname) {
			this.emp_lastname = emp_lastname;
		}
		public void setEmp_department(String emp_department) {
			this.emp_department = emp_department;
		}
		public void setEmp_email(String emp_email) {
			this.emp_email = emp_email;
		}
		public void setEmp_address(String emp_address) {
			this.emp_address = emp_address;
		}
		public void setEmp_gender(String emp_gender) {
			this.emp_gender = emp_gender;
		}
		public void setEmp_salary(int emp_salary) {
			this.emp_salary = emp_salary;
		}
		
		public int getEmp_id() {
			return emp_id;
		}
		public String getEmp_firstname() {
			return emp_firstname;
		}
		public String getEmp_lastname() {
			return emp_lastname;
		}
		public String getEmp_department() {
			return emp_department;
		}
		public String getEmp_email() {
			return emp_email;
		}
		public String getEmp_address() {
			return emp_address;
		}
		public String getEmp_gender() {
			return emp_gender;
		}
		public int getEmp_salary() {
			return emp_salary;
		}
		
		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", emp_firstname=" + emp_firstname + ", emp_lastname=" + emp_lastname
					+ ", emp_department=" + emp_department + ", emp_email=" + emp_email + ", emp_address=" + emp_address
					+ ", emp_gender=" + emp_gender + ", emp_salary=" + emp_salary +  "]";
		}
		
		
		
}
