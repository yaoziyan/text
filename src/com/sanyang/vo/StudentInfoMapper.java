package com.sanyang.vo;

import java.util.List;

import com.sanyang.dao.StudentDao;

public interface StudentInfoMapper{

	//��ѯȫ��
	public List<Student> chaxun(Student student);

	//ɾ��
	public void sc(Integer snumber);
}
