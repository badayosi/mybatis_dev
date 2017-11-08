package kr.or.dgit.mybatis_dev.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.service.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {
	private static StudentService studentService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}
	/*
	@Test
	public void test1FindStudentByNo() {
		Student student = new Student();
		student.setStudId(1);

		Student findStudent = studentService.findStudentByNo(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
	}

	@Test
	public void test2FindStudentByAll() {
		List<Student> lists = studentService.findStudentByAll();
		Assert.assertNotNull(lists);
	}

	@Test
	public void test3FindStudentByNoWithAPI() {
		Student student = new Student();
		student.setStudId(1);

		Student findStudent = studentService.findStudentByNoWithAPI(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
	}

	@Test
	public void test4FindStudentByAllWithAPI() {
		List<Student> lists = studentService.findStudentByAllWithAPI();
		Assert.assertNotNull(lists);
	}


	  @Test public void test5InsertStudent() { Calendar newDate =
	  GregorianCalendar.getInstance(); newDate.set(1990, 2, 28);
	  
	  Student student = new Student(10, "홍길동3", "lee@test.co.kr", new
	  PhoneNumber("010-1234-1234"), newDate.getTime()); int res =
	  studentService.insertStudent(student); Assert.assertEquals(1, res); }
	 

	@Test
	public void test6InsertStudentWithAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 3, 28);

		Student student = new Student(4, "홍길동4", "lee@test.co.kr", new PhoneNumber("010-1234-1234"), newDate.getTime());
		int res = studentService.insertStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test7InsertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);

		Student student = new Student();
		student.setName("홍길동4");
		student.setEmail("lee4@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));

		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test8UpdateStudent() {
		Student student = new Student();
		student.setStudId(1);
		student.setName("Timothy");
		student.setEmail("test@test.co.kr");
		student.setPhone(new PhoneNumber("987-654-3211"));
		student.setDob(new Date());

		int result = studentService.updateStudent(student);
		Assert.assertSame(1, result);

		student.setEmail("timothy@gmail.com");
		student.setPhone(new PhoneNumber("123-123-1234"));
		student.setDob(new GregorianCalendar(1988, 04, 25).getTime());
		result = studentService.updateStudentWithAPI(student);
		Assert.assertSame(1, result);
	}

	@Test
	public void testDeleteStudent() {
		insertStd();

		int deleteStudent = studentService.deleteStudent(20);
		Assert.assertSame(1, deleteStudent);

		insertStd();
		deleteStudent = studentService.deleteStudentWithAPI(20);
		Assert.assertSame(1, deleteStudent);
	}

	private void insertStd() {
		Student student = new Student();
		student.setStudId(20);
		student.setName("Timothy");
		student.setEmail("test@test.co.kr");
		student.setPhone(new PhoneNumber("987-654-3211"));
		student.setDob(new Date());
		studentService.insertStudent(student);
	}
	
    @Test
    public void test9SelectStudentByAllForResutlMap(){
       List<Student> lists = studentService.findStudentByAllForResultMap();
       List<Student> listsAPI = studentService.findStudentByAllForResultMapWithAPI();
       Assert.assertEquals(listsAPI.size(), lists.size());
    }

    @Test
    public void Test10SelectStudentByAllForHashMap(){
       List<Map<String,Object>> lists = studentService.findStudentByAllForHashMap();
       List<Map<String,Object>> listsAPI = studentService.findStudentByAllForHashMapWithAPI();
       Assert.assertEquals(listsAPI.size(), lists.size());
    }

    @Test
    public void test11SelectStudentByNoForResultMapExtends(){
        Student student = new Student();
        student.setStudId(1);
        
        Student extStd = studentService.findStudentByNoForResultMapExtends(student);
        Student extStdApi = studentService.findStudentByNoForResultMapExtendsWithAPI(student);
        Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
    }

    @Test
    public void test12SelectStudentByNoAssociation(){
        Student student = new Student();
        student.setStudId(1);
        
        Student extStd = studentService.findStudentByNoAssociation(student);
        Student extStdApi = studentService.findStudentByNoAssociationWithAPI(student);
        
        Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
    }

    @Test
    public void test13InsertEnumStudent() {
        Calendar newDate = GregorianCalendar.getInstance();
        newDate.set(1990, 2, 28);
        Student student = new Student();
        student.setName("test");
        student.setEmail("test@test.co.kr");
        student.setDob(newDate.getTime());
        student.setPhone(new PhoneNumber("010-1234-1234"));
        student.setGender(Gender.FEMALE);
        int res = studentService.insertEnumStudent(student);
        Assert.assertEquals(1, res);

    }
    @Test
    public void test14InsertEnumStudentWithAPI() {
        Calendar newDate = GregorianCalendar.getInstance();
        newDate.set(1990, 3, 28);
        Student student = new Student();
        student.setName("test2");
        student.setEmail("test2@test.co.kr");
        student.setDob(newDate.getTime());
        student.setPhone(new PhoneNumber("010-1234-1234"));
        student.setGender(Gender.MALE);
        int res = studentService.insertEnumStudentWithAPI(student);
        Assert.assertEquals(1, res);
    }
*/
	
    @Test
    public void test15FindAllStudentByParam() {
        Student student = studentService.findAllStudentByParam("Timothy", "timothy@gmail.com");
        Assert.assertNotNull(student);
    }

    @Test
    public void test16FindAllStudentByStudent() {
        Student std = new Student();
        std.setName("Timothy");
        std.setEmail("timothy@gmail.com");
        Student student = studentService.findAllStudentByStudent(std);
        Assert.assertNotNull(student);
    }

    @Test
    public void test17FindAllStudentByMap() {
        Map<String, String> maps = new HashMap<>();
        maps.put("name", "Timothy");
        maps.put("email", "timothy@gmail.com");
        Student student = studentService.findAllStudentByMap(maps);
        Assert.assertNotNull(student);
    }

    @Test
    public void testFindStudentForMap() {
        Map<Integer, String> map = studentService.findStudentForMap();
        Assert.assertNotNull(map);
        
        for(Entry<Integer, String>entry : map.entrySet()){
            System.out.printf("key(%s) - value(%s)%n", entry.getKey(), entry.getValue());
        }
    }
}
