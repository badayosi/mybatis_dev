package kr.or.dgit.mybatis_dev.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao {
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(StudentDaoImpl.class);
	
	public StudentDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Student selectStudentByNo(Student student) {
		log.debug("selectStudentByNo()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}

	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudentByAll()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAll();
	}

	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentDao.";
	
	@Override
	public Student selectStudentByNoWithAPI(Student student) {
		log.debug("selectStudentByNoWithAPI()");
		return sqlSession.selectOne(namespace+"selectStudentByNoWithAPI", student);
	}

	@Override
	public List<Student> selectStudentByAllWithAPI() {
		log.debug("selectStudentByAllWithAPI()");
		return sqlSession.selectList(namespace + "selectStudentByAllWithAPI");
	}

	@Override
	public int insertStudent(Student student) {
        log.debug("insertStudent()");
        return sqlSession.getMapper(StudentDao.class).insertStudent(student);
	}

	@Override
	public int insertStudentWithAPI(Student student) {
		log.debug("insertStudentWithAPI()");
        return sqlSession.insert(namespace+"insertStudentWithAPI", student);

	}

	@Override
	public int insertStudentAutoInc(Student student) {
		log.debug("insertStudentAutoInc()");
        return sqlSession.insert(namespace+"insertStudentAutoInc", student);
	}

	@Override
	public int updateStudent(Student student) {
        log.debug("updateStudent()");
        return sqlSession.getMapper(StudentDao.class).updateStudent(student);
	}

	@Override
	public int updateStudentWithAPI(Student student) {
        log.debug("updateStudentWithAPI()");
        return sqlSession.update(namespace + "updateStudentWithAPI", student);
	}

	@Override
	public int deleteStudent(int id) {
		log.debug("deleteStudent()");
        return sqlSession.getMapper(StudentDao.class).deleteStudent(id);
	}

	@Override
	public int deleteStudentWithAPI(int id) {
		log.debug("deleteStudentWithAPI()");
        return sqlSession.delete(namespace + "deleteStudentWithAPI", id);

	}

	@Override
	public List<Student> selectStudentByAllForResutlMap() {
		log.debug("selectStudentByAllForResutlMap()");
        return sqlSession.getMapper(StudentDao.class).selectStudentByAllForResutlMap();
	}

	@Override
	public List<Student> selectStudentByAllForResutlMapWithAPI() {
		log.debug("selectStudentByAllForResutlMapWithAPI()");
        return sqlSession.selectList(namespace +"selectStudentByAllForResutlMap");
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
        return sqlSession.getMapper(StudentDao.class).selectStudentByAllForHashMap();
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMapWithAPI() {
		log.debug("selectStudentByAllForHashMapWithAPI()");
        return sqlSession.selectList(namespace+"selectStudentByAllForHashMapWithAPI");
	}

	@Override
	public Student selectStudentByNoForResultMapExtends(Student student) {
		log.debug("selectStudentByNoForResultMapExtends()");
        return sqlSession.selectOne(namespace+"selectStudentByNoForResultMapExtends", student);
	}

	@Override
	public Student selectStudentByNoForResultMapExtendsWithAPI(Student student) {
		log.debug("selectStudentByNoForResultMapExtendsWithAPI()");
        return sqlSession.selectOne(namespace+"selectStudentByNoForResultMapExtendsWithAPI", student);
	}

	@Override
	public Student selectStudentByNoAssociation(Student student) {
		log.debug("selectStudentByNoAssociation()");
        return sqlSession.getMapper(StudentDao.class).selectStudentByNoAssociation(student);
	}

	@Override
	public Student selectStudentByNoAssociationWithAPI(Student student) {
		log.debug("selectStudentByNoAssociationWithAPI()");
        return sqlSession.selectOne(namespace+"selectStudentByNoAssociationWithAPI", student);
	}

    @Override
    public int insertEnumStudent(Student student) {
        log.debug("insertEnumStudent()");
        return sqlSession.getMapper(StudentDao.class).insertEnumStudent(student);
    }

    @Override
    public int insertEnumStudentWithAPI(Student student) {
        log.debug("insertStudentWithAPI()");
        return sqlSession.insert(namespace+"insertEnumStudentWithAPI", student);
    }

	@Override
	public Student selectAllStudentByParam(String name, String email) {
        log.debug("selectAllStudentByParam()");
        return sqlSession.getMapper(StudentDao.class).selectAllStudentByParam(name, email);
	}

    @Override
    public Student selectAllStudentByStudent(Student student) {
        log.debug("selectAllStudentByStudent()");
        return sqlSession.selectOne(namespace+"selectAllStudentByStudent", student);
    }

    @Override
    public Student selectAllStudentByMap(Map<String, String> map) {
        log.debug("selectAllStudentByMap()");
        return sqlSession.selectOne(namespace+"selectAllStudentByMap", map);
    }

    @Override
    public Map<Integer, String> selectStudentForMap() {
        log.debug("selectStudentForMap()");
        Map<Integer, String> map = new HashMap<>();
        ResultHandler<Student> resultHandler = new ResultHandler<Student>() {
            @Override
            public void handleResult(ResultContext<? extends Student> resultContext) {
                Student student = resultContext.getResultObject();
                map.put(student.getStudId(), student.getName());                
            }
        };
        sqlSession.select(namespace+"selectStudentForMap", resultHandler);
        return map;
    }




}








