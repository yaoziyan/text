package com.sanyang.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sanyang.vo.Student;
@Repository
public interface StudentDao {
	//²éÑ¯È«²¿
	public List<Student> chaxun(Student student);

	//É¾³ý
	public void sc(Integer snumber);

}
