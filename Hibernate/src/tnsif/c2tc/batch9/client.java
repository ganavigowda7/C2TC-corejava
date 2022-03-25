package tnsif.c2tc.batch9;

import tnsif.c2tc.batch9.entity.student;
import tnsif.c2tc.batch9.service.StudentService;
import tnsif.c2tc.batch9.service.StudentServiceImpl;
   public class client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		student student=new student();
		student.setUid(2100804);
		student.setName("ganavi");
		 service.addStudent(student);
	}

}
