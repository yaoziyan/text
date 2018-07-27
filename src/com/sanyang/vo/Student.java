package com.sanyang.vo;

public class Student {

	private Integer	 snumber; //number,
	private String	  classes; //varchar2(10),
	private String	  ename;  //varchar2(10) ,
	private String	  sex;  // varchar2(10),
	private Integer	  age;  // number  
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Integer getSnumber() {
		return snumber;
	}


	public void setSnumber(Integer snumber) {
		this.snumber = snumber;
	}


	public String getClasses() {
		return classes;
	}


	public void setClasses(String classes) {
		this.classes = classes;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Student(Integer snumber, String classes, String ename, String sex, Integer age) {
		super();
		this.snumber = snumber;
		this.classes = classes;
		this.ename = ename;
		this.sex = sex;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [snumber=" + snumber + ", classes=" + classes + ", ename=" + ename + ", sex=" + sex + ", age="
				+ age + "]";
	}
	
	
}
