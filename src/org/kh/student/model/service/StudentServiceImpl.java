package org.kh.student.model.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kh.student.model.dao.StudentDAOImpl;
import org.kh.student.model.vo.StudentVo;

public class StudentServiceImpl implements StudentService {

	// 기존 getConnect과 같음
	public SqlSession getSqlSession() {
		// getSqlSeesion 메소드의 역할은
		// DB에 연결할 JDBC 연결 코드를 통하여 연결하는 세션 정보를
		// 리턴해 주는 역할

		// Mybatis는 드라이버 등록 코드 및 연결 주소 등록 코드를 xml 파일에 미리
		// 등록 하고 가져다 사용 함

		String resource = "/mybatis-config.xml";
		SqlSession session = null;

		// sqlSession을 만들위한 순서 (sqlSession = Connection 객체)
		try {
			// 1. 드라이버 및 JDBC 연결 정보를 가지고 있는 xml 파일을 읽어 들어야 함(InputStream 생성)
			InputStream is = Resources.getResourceAsStream(resource);

			// 2. sqlSession을 생성하려면 sqlSessionFactory 객체가 필요함
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

			// 3. sqlSessionFactory 객체를 생성하려면 sqlSessionFactoryBuilder 객체가 있어야 함
			SqlSessionFactory factory = builder.build(is);

			// 4. sqlSession 리턴 (sqlSessionFactory에 의해 Session이 만들어지고 리턴하는 것임)
			session = factory.openSession(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return session;
	}

	@Override
	public StudentVo selectStudent() {
		return null;
	}

	@Override
	public int insertStudent() {
		SqlSession session = getSqlSession();
		int result = new StudentDAOImpl().insertStudent(session);
		if (result > 0) {
			session.commit();
		} else
			session.rollback();
		return result;
	}

	public int insertStudent(String studentName) {
		SqlSession session = getSqlSession();
		int result = new StudentDAOImpl().insertStudent(session, studentName);
		if (result > 0) {
			session.commit();
		} else
			session.rollback();
		return result;
	}

	public int insertStudent(StudentVo sv) {
		SqlSession session = getSqlSession();
		int result = new StudentDAOImpl().insertStudent(session, sv);
		if (result > 0) {
			session.commit();
		} else
			session.rollback();
		return result;
	}

}
