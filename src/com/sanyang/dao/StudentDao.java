package com.sanyang.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sanyang.vo.Student;
@Repository
public interface StudentDao {
	//��ѯȫ��
	public List<Student> chaxun(Student student);

	//ɾ��
	public void sc(Integer snumber);

}
