package tnsif.c2tc.batch09.Dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.batch09.entity.User;



public class UserDaoImpl implements UserDao {
	EntityManager enityManager;
	public UserDaoImpl() {
		 enityManager = configuration.getEntityManager();
	}
	@Override
	public void startTransaction() {
		enityManager.getTransaction().begin();
	}
		
	
	@Override
	public void addUser(User user) {
		enityManager.persist(user);
		
	}
	@Override
	public void endTransaction() {
		enityManager.getTransaction().commit();
	}
	@Override
	public void updateUser(User user) {
		enityManager.merge(user);
	}
	@Override
	public User searchUser(int id) {
		User use=enityManager.find(User.class, id);
		return use;
		
}
	@Override
	public void deleteUser(int id) {
		User use=enityManager.find(User.class, id);
		enityManager.remove(use);
		
	}
	
}
	