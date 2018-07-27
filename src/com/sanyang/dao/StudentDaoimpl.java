package com.sanyang.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sanyang.vo.Student;

public class StudentDaoimpl implements StudentDao  {

	@Override
	public List<Student> chaxun(Student students) {
		try {
			Reader r  =Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory  sFactory = new   SqlSessionFactoryBuilder().build(r);
			SqlSession session = sFactory.openSession();
			List<Student> list = session.selectList("com.sanyang.vo.StudentInfoMapper.chaxun");
			System.out.println(list);
			return list;
		} catch (Exception e) {
	    	e.printStackTrace();
		}
		return null;
		
	}



	@Override
	public void sc(Integer snumber) {
		Reader r;
		try {
			r = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory  sFactory = new   SqlSessionFactoryBuilder().build(r);
			SqlSession session = sFactory.openSession();
			session.delete("com.sanyang.vo.StudentInfoMapper.sc",snumber);
			session.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	}
