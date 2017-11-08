package kr.or.dgit.mybatis_dev.service;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	
	public Student findStudentByNo(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDaoImpl dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public Student findStudentByNoAssociation(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student findStudentByNoAssociationWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao studentDao = new StudentDaoImpl(sqlSession);
			return studentDao.selectStudentByNoAssociationWithAPI(student);
		}
	}
}
