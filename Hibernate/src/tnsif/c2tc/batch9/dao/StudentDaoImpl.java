package tnsif.c2tc.batch9.dao;

import tnsif.c2tc.batch9.entity.student;
import javax.persistence.EntityManager;;

public class StudentDaoImpl implements StudentDao {
	EntityManager entityManager;
	public StudentDaoImpl() {
		entityManager=configuration.getEntityManager();
	}

	@Override
	public void addStudent(student student) {
		entityManager.persist(student);
		
	}

	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}

	

	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
