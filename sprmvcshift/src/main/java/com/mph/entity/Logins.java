package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Prasanna Devi
*/
@Entity
public class Logins {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;

	private String email;
	private String password;

	public Logins() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Creates an employee with the specified name.
	 * @param lid The employee’s login ID.
	 * @param email The employee’s email.
	 * @param password The employee’s password.
	*/
	public Logins(int lid, String email, String password) {
		super();
		this.lid = lid;
		this.email = email;
		this.password = password;
	}

	/** Gets the employee’s login ID.
	 * @return A integer representing the employee’s lid
	*/
	public int getLid() {
		return lid;
	}

	/** Sets the employee’s login ID.
	 * @param lid A integer representing the employee’s lid
	*/
	public void setLid(int lid) {
		this.lid = lid;
	}

	/** Gets the employee’s email.
	 * @return A string representing the employee’s email.
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

	/** Gets the employee’s password.
	 * @return A string representing the employee’s password.
	*/
	public String getPassword() {
		return password;
	}

	/** Sets the employee’s password.
	 * @param email A string representing the employee’s password.
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Logins [lid=" + lid + ", email=" + email + ", password=" + password + "]";
	}
}
