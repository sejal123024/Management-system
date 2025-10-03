package com.excelr.Student.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student{

	@Id
	private int rno;
	private String sname;
	private double per;
	public Student() {}
	public Student(int rno, String sname, double per) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + ", getRno()=" + getRno() + ", getSname()="
				+ getSname() + ", getPer()=" + getPer() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
  
	
}
