package kr.or.dgit.mybatis_dev.service;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {
	private static StudentService StudentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		StudentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		StudentService = null;
	}

	@Test
	public void test1FindStudentByNo() {
		Student student = new Student();
		student.setStudId(1);

		Student findStudent = StudentService.findStudentByNo(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
	}
	
	@Test
	public void test2SelectStudentByNoAssociation() {
		Student student = new Student();
		student.setStudId(1);
		
		Student extStd = StudentService.findStudentByNoAssociation(student);
		Student extStdApi = StudentService.findStudentByNoAssociationWithAPI(student);
		
		Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
	}

}
