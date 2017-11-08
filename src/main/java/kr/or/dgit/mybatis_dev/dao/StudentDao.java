package kr.or.dgit.mybatis_dev.dao;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	Student selectStudentByNoAssociation(Student student);
	Student selectStudentByNoAssociationWithAPI(Student student);
}
