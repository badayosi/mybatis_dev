package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.CourseDao;
import kr.or.dgit.mybatis_dev.dao.CourseDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class CourseService {
	private static final CourseService instance = new CourseService();
	
	private CourseService() {}

	public static CourseService getInstance() {
		return instance;
	}
	
	public List<Course> findCoursesByCondition(Map<String, Object> map){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao courseDao = new CourseDaoImpl(sqlSession);
			return courseDao.selectCoursesByCondition(map);
		}
	}
	
	public List<Course> findCaseCourses(Map<String, Object> map){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao courseDao = new CourseDaoImpl(sqlSession);
			return courseDao.selectCaseCourses(map);
		}
	}
	
	public List<Course> findWhereCourses(Map<String, Object> map){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao courseDao = new CourseDaoImpl(sqlSession);
			return courseDao.selectWhereCourses(map);
		}
	}
	
	public List<Course> findTrimCourses(Map<String, Object> map){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao courseDao = new CourseDaoImpl(sqlSession);
			return courseDao.selectTrimCourses(map);
		}
	}
	
	public List<Course> findCoursesForeachByTutors(Map<String, Object> map){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			CourseDao courseDao = new CourseDaoImpl(sqlSession);
			return courseDao.selectCoursesForeachByTutors(map);
		}
	}
}
