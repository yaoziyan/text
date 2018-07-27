package com.sanyang.vo;

import java.util.List;

import com.sanyang.dao.StudentDao;

public interface StudentInfoMapper{

	//²éÑ¯È«²¿
	public List<Student> chaxun(Student student);

	//É¾³ı
	public void sc(Integer snumber);
}
