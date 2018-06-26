package org.kh.student.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.kh.student.model.vo.StudentVo;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public StudentVo selecStudent() {
		return null;
	}

	@Override
	public int insertStudent(SqlSession session) {
		int result = session.insert("student.test1");
		return result;
	}

	public int insertStudent(SqlSession session, String studentName) {
		int result = session.insert("student.test2", studentName);
		return result;
	}

	public int insertStudent(SqlSession session, StudentVo sv) {
		int result = session.insert("student.test3", sv);
		return result;
	}

}
