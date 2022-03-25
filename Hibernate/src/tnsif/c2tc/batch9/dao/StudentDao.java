package tnsif.c2tc.batch9.dao;

import tnsif.c2tc.batch9.entity.student;

public interface StudentDao {

	void addStudent(student student);

	void startTransaction();

	void endTransaction();



	

}

	




