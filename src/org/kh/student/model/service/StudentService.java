package org.kh.student.model.service;

import org.kh.student.model.vo.StudentVo;

public interface StudentService {
	public StudentVo selectStudent();

	public int insertStudent();

}
