package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao {
	private SqlSession SqlSession;
	private static final Log log = LogFactory.getLog(StudentDaoImpl.class);
	
	public StudentDaoImpl(SqlSession sqlSession) {
		SqlSession = sqlSession;
	}
		
	@Override
	public Student selectStudentByNo(Student student) {
		log.debug("selectStudentByNo()");
		return SqlSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}

}