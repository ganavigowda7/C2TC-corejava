package tnsif.c2tc.batch9.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class configuration {
	static EntityManager entityManager;
	static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		entityManager=entityManagerFactory.createEntityManager();
	}
	public static EntityManager getEntityManager()
	{
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}

}
	
