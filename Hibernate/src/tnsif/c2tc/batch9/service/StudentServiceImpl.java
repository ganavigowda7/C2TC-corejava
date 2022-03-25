package tnsif.c2tc.batch9.service;
import tnsif.c2tc.batch9.entity.student;
import tnsif.c2tc.batch9.dao.StudentDao;
import tnsif.c2tc.batch9.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
 StudentDao sd;
 public StudentServiceImpl()
 {
	 sd=new StudentDaoImpl();


	 
 }
@Override
public void addStudent(student student) {
	sd.startTransaction();
	sd.addStudent(student);
	sd.endTransaction();
	
}


}
