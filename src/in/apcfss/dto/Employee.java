 package in.apcfss.dto;

import java.io.InputStream;

public class Employee {
	private int id;
	private String name;
	private String qualification;
	private String gender;
	private String doj;
	private String pancard;
	private String dob;
	private String salary;
	private String dayspresent;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDayspresent() {
		return dayspresent;
	}
	public void setDayspresent(String dayspresent) {
		this.dayspresent = dayspresent;
	}
	

	private int basicpay=0;
	private int da=0;
	private int hra=0;
	private int grosstotal=0;
	private int pf=0;
	private int pt=0;
	private int netsalary=0;
	public int getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(int basicpay) {
		this.basicpay = basicpay;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getGrosstotal() {
		return grosstotal;
	}
	public void setGrosstotal(int grosstotal) {
		this.grosstotal = grosstotal;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public int getPt() {
		return pt;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}
	public int getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(int netsalary) {
		this.netsalary = netsalary;
	}

}
