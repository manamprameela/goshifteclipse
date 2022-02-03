package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Sundaram
 * @author Prameela
*/
@Entity
public class Goshift {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;

	@Column(name = "EmpolyeeName")
	private String ename;
	@Column(name = "DepartmentName")
	private String dname;
	@Column(name = "ShiftName")
	private String sname;
	@Column(name = "ShiftDate")
	private String sdate;
	@Column(name = "ShiftTime")
	private String stime;

	public Goshift() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Creates an employee with the specified name.
	 * @param sid The employee’s shift ID.
	 * @param ename The employee’s name.
	 * @param dname The employee’s Department Name.
	 * @param sname The employee’s shift name.
	 * @param sdate The employee’s shift date.
	 * @param stime The employee’s shift time.
	*/
	public Goshift(int sid, String ename, String dname, String sname, String sdate, String stime) {
		super();
		this.sid = sid;
		this.ename = ename;
		this.dname = dname;
		this.sname = sname;
		this.sdate = sdate;
		this.stime = stime;
	}

	/** Gets the employee’s shift ID.
	 * @return A integer representing the employee’s sid
	*/
	public int getSid() {
		return sid;
	}

	/** Sets the employee’s shift ID.
	 * @param rid A integer representing the employee’s sid
	*/
	public void setSid(int sid) {
		this.sid = sid;
	}

	/** Gets the employee’s name.
	 * @return A string representing the employee’s name
	*/
	public String getEname() {
		return ename;
	}
	
	/** Sets the employee’s name.
	 * @param rid A integer representing the employee’s name.
	*/
	public void setEname(String ename) {
		this.ename = ename;
	}

	/** Gets the employee’s department name.
	 * @return A string representing the employee’s department name.
	*/
	public String getDname() {
		return dname;
	}

	/** Sets the employee’s department name.
	 * @param rid A integer representing the employee’s department name.
	*/
	public void setDname(String dname) {
		this.dname = dname;
	}

	/** Gets the employee’s shift name.
	 * @return A string representing the employee’s Shift Name.
	*/
	public String getSname() {
		return sname;
	}

	/** Sets the employee’s shift name.
	 * @param rid A integer representing the employee’s shift name.
	*/
	public void setSname(String sname) {
		this.sname = sname;
	}

	/** Gets the employee’s shift date.
	 * @return A string representing the employee’s shift date.
	*/
	public String getSdate() {
		return sdate;
	}

	/** Sets the employee’s shift date.
	 * @param rid A integer representing the employee’s shift date.
	*/
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	/** Gets the employee’s shift time.
	 * @return A string representing the employee’s shift time.
	*/
	public String getStime() {
		return stime;
	}

	/** Sets the employee’s shift time.
	 * @param rid A integer representing the employee’s shift time.
	*/
	public void setStime(String stime) {
		this.stime = stime;
	}

	@Override
	public String toString() {
		return "Goshift [sid=" + sid + ", ename=" + ename + ", dname=" + dname + ", sname=" + sname + ", sdate=" + sdate
				+ ", stime=" + stime + "]";
	}

}