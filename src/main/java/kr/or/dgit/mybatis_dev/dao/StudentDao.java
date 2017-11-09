package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
	Student selectStudentByNoWithAPI(Student student);
	List<Student> selectStudentByAllWithAPI();

	int insertStudent(Student student);
	int insertStudentWithAPI(Student student);
	int insertStudentAutoInc(Student student);

	int updateStudent(Student student);
	int updateStudentWithAPI(Student student);
	int deleteStudent(int id);
	int deleteStudentWithAPI(int id);

	// ResultMap
	List<Student> selectStudentByAllForResutlMap();
	List<Student> selectStudentByAllForResutlMapWithAPI();

	// hasMap
	List<Map<String, Object>> selectStudentByAllForHashMap();
	List<Map<String, Object>> selectStudentByAllForHashMapWithAPI();

	// resultMap Extends
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentByNoForResultMapExtendsWithAPI(Student student);

	// 내포된 결과매핑(ResultMap)을 사용한 일대일 매핑
	Student selectStudentByNoAssociation(Student student);
	Student selectStudentByNoAssociationWithAPI(Student student);

	// enum 타입 다루기 
    int insertEnumStudent(Student student);
    int insertEnumStudentWithAPI(Student student);

    // 여러 개의 입력 파라미터 전달
    Student selectAllStudentByParam(String name, String email);
    Student selectAllStudentByStudent(Student student);
    Student selectAllStudentByMap(Map<String, String> map);
    
	// ResultSet 처리방식의 재정의
    Map<Integer, String> selectStudentForMap();
    
    int updateSetStudent(Student student);

}
