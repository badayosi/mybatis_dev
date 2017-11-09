package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {

	public Student findStudentByNo(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
	}
	
	public Student findStudentByNoWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoWithAPI(student);
		}
	}
	
	public List<Student> findStudentByAllWithAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllWithAPI();
		}
	}
	
    public int insertStudent(Student student) {
        int res = -1;
        try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
            StudentDao studentDao = new StudentDaoImpl(sqlSession);
            res = studentDao.insertStudent(student);
            sqlSession.commit();
        } 
        return res;
    }

    public int insertStudentWithAPI(Student student) {
        int res = -1;
        try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
            StudentDao studentDao = new StudentDaoImpl(sqlSession);
            res = studentDao.insertStudentWithAPI(student);
            sqlSession.commit();
        } 
        return res;
    }

    public int insertStudentAutoInc(Student student) {
        int res = -1;
        try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
            StudentDao studentDao = new StudentDaoImpl(sqlSession);
            res = studentDao.insertStudentAutoInc(student);
            sqlSession.commit();
        } 
        return res;
    }

    public int updateStudent(Student student){
    	 int res = -1;
    	 try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
             StudentDao studentDao = new StudentDaoImpl(sqlSession);
             res = studentDao.updateStudent(student);
             sqlSession.commit();
         } 
    	 return res;
    }

    public int updateStudentWithAPI(Student student){
   	 int res = -1;
   	 try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
            StudentDao studentDao = new StudentDaoImpl(sqlSession);
            res = studentDao.updateStudentWithAPI(student);
            sqlSession.commit();
        } 
   	 return res;
   }
    
    public int deleteStudent(int id){
   	 int res = -1;
   	 try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
            StudentDao studentDao = new StudentDaoImpl(sqlSession);
            res = studentDao.deleteStudent(id);
            sqlSession.commit();
        } 
   	 return res;
   }

   public int deleteStudentWithAPI(int id){
  	 int res = -1;
  	 try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           res = studentDao.deleteStudentWithAPI(id);
           sqlSession.commit();
       } 
  	 return res;
  }
   
   public List<Student> findStudentByAllForResultMap(){
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByAllForResutlMap();
       }
   }
   
   public List<Student> findStudentByAllForResultMapWithAPI() {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByAllForResutlMapWithAPI();
       }
   }

   public List<Map<String, Object>> findStudentByAllForHashMap(){
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByAllForHashMap();
       }
   }
   
   public List<Map<String, Object>> findStudentByAllForHashMapWithAPI() {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByAllForHashMapWithAPI();
       }
   }
   
   public Student findStudentByNoForResultMapExtends(Student student) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByNoForResultMapExtends(student);
       }
   }
   
   public Student findStudentByNoForResultMapExtendsWithAPI(Student student) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByNoForResultMapExtendsWithAPI(student);
       }
   }

   public Student findStudentByNoAssociation(Student student) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByNoAssociation(student);
       }
   }

   public Student findStudentByNoAssociationWithAPI(Student student) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentByNoAssociationWithAPI(student);
       }
   }

   public int insertEnumStudent(Student student) {
       int res = -1;
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           res = studentDao.insertEnumStudent(student);
           sqlSession.commit();
       } 
       return res;
   }

   public int insertEnumStudentWithAPI(Student student) {
       int res = -1;
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           res = studentDao.insertEnumStudentWithAPI(student);
           sqlSession.commit();
       } 
       return res;
   }

   public Student findAllStudentByParam(String name, String email) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectAllStudentByParam(name, email);
       }
   }

   public Student findAllStudentByStudent(Student student) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectAllStudentByStudent(student);
       }
   }

   public Student findAllStudentByMap(Map<String, String> map) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectAllStudentByMap(map);
       }
   }
   
   public Map<Integer, String> findStudentForMap() {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           return studentDao.selectStudentForMap();
       }
   }

   public int updateSetStudent(Student student) {
       try (SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
           StudentDao studentDao = new StudentDaoImpl(sqlSession);
           int res = studentDao.updateSetStudent(student);
           sqlSession.commit();
           return res;
       }
   }
}
