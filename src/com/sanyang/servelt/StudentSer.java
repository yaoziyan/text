package com.sanyang.servelt;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.sanyang.dao.StudentDao;
import com.sanyang.dao.StudentDaoimpl;
import com.sanyang.vo.Student;
import com.sanyang.vo.StudentInfoMapper;

public class StudentSer extends HttpServlet{
	
	@Autowired
	private StudentDao dao;

/*	private StudentInfoMapper mapper;*/
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
		
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String  type = request.getParameter("type");
		if(type.equals("aa")){
			try {
				getAllStudent(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (type.equals("shan")) {
		try {
			shanchu(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}

	}

	//É¾³ý
	private void shanchu(HttpServletRequest request, HttpServletResponse response)throws Exception, Exception  {
		int snumber = Integer.parseInt(request.getParameter("snumber"));
		dao.sc(snumber);
		response.sendRedirect("ss?type=aa");
	}

	//²éÑ¯È«²¿
	private void getAllStudent(HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
		

		List<Student> chaxun = dao.chaxun(student);
		request.setAttribute("list",student );

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
   
}
