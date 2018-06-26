package org.kh.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kh.student.model.service.StudentServiceImpl;

@WebServlet(name = "MybatisTest1", urlPatterns = { "/mybatistest1" })
public class MybatisTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MybatisTest1Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int result = new StudentServiceImpl().insertStudent();
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
