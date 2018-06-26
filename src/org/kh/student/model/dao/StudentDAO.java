package org.kh.student.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.kh.student.model.vo.StudentVo;

public interface StudentDAO {
	public StudentVo selecStudent();

	public int insertStudent(SqlSession session);
}
