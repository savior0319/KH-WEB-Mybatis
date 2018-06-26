package org.kh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.student.model.service.StudentServiceImpl;

@WebServlet(name = "MybatisTest2", urlPatterns = { "/mybatistest2" })
public class MybatisTest2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MybatisTest2Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String studentName = request.getParameter("studentName");

		int result = new StudentServiceImpl().insertStudent(studentName);
		if (result > 0) {
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().println("정상처리");
		} else
			response.getWriter().println("실패 하.. 인생");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
