package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Manichand
 * @author Siva Krishna
*/
@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	
	@Column(name="EmployeeName")
	private String ename;
	private String doj;
	private String email;
	private String gender;
	private String location;
	private String password;
	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Creates an employee with the specified name.
	 * @param rid The employee’s register ID.
	 * @param ename The employee’s name.
	 * @param doj The employee’s date of joining.
	 * @param email The employee’s email.
	 * @param gender The employee’s gender.
	 * @param location The employee’s company location.
	 * @param password The employee’s password.
	*/

	public Registration(int rid, String ename, String doj, String email, String gender, String location, String password) {
		super();
		this.rid = rid;
		this.ename = ename;
		this.doj = doj;
		this.email = email;
		this.gender = gender;
		this.location = location;
		this.password = password;
	}

	/** Gets the employee’s Register ID.
	 * @return A integer representing the employee’s rid
	*/
	public int getRid() {
		return rid;
	}

	/** Sets the employee’s Register ID.
	 * @param rid A integer representing the employee’s rid
	*/
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	/** Gets the employee’s name.
	 * @return A string representing the employee’s name
	*/
	public String getEname() {
		return ename;
	}

	/** Sets the employee’s name.
	 * @param ename string representing the employee’s name
	*/
	public void setEname(String ename) {
		this.ename = ename;
	}

	/** Gets the employee’s date of joining.
	 * @return A string representing the employee’s date of joining.
	*/
	public String getDoj() {
		return doj;
	}

	/** Sets the employee’s date of joining.
	 * @param doj A string representing the employee’s date of joining.
	*/
	public void setDoj(String doj) {
		this.doj = doj;
	}

	/** Gets the employee’s email.
	 * @return A string representing the employee’s email
	*/
	public String getEmail() {
		return email;
	}

	/** Sets the employee’s email.
	 * @param email A string representing the employee’s email
	*/
	public void setEmail(String email) {
		this.email = email;
	}

	/** Gets the employee’s gender.
	 * @return A string representing the employee’s gender
	*/
	public String getGender() {
		return gender;
	}

	/** Sets the employee’s gender.
	 * @param gender A string representing the employee’s gender
	*/
	public void setGender(String gender) {
		this.gender = gender;
	}

	/** Gets the employee’s office location.
	 * @return A string representing the employee’s office location
	*/
	public String getLocation() {
		return location;
	}

	/** Sets the employee’s office location.
	 * @param location A string representing the employee’s office location
	*/
	public void setLocation(String location) {
		this.location = location;
	}

	/** Gets the employee’s password.
	 * @return A string representing the employee’s password
	*/
	public String getPassword() {
		return password;
	}

	/** Sets the employee’s password.
	 * @param password A string representing the employee’s password
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmpRegister [rid=" + rid + ", ename=" + ename + ", doj=" + doj + ", email=" + email + ", gender="
				+ gender + ", location=" + location + ", password=" + password + "]";
	}

	
	
}
