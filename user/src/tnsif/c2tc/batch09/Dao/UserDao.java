package tnsif.c2tc.batch09.Dao;

import tnsif.c2tc.batch09.entity.User;

public interface UserDao {

	public void startTransaction();

	

	public void endTransaction();



	public void addUser(User user);



	public void updateUser(User user);



	public User searchUser(int id);



	public void deleteUser(int id);



	
}
