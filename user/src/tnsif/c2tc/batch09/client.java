package tnsif.c2tc.batch09;

import tnsif.c2tc.batch09.entity.User;
import tnsif.c2tc.batch09.service.UserService;
import tnsif.c2tc.batch09.service.UserServiceImpl;

public class client {

	public static void main(String[] args) {
		UserService service=new UserServiceImpl();
		User user=new User();
		user.setId(748006567);
		user.setName("Ram");
		user.setType("New customer");
		user.setPassword("kushal BS");
		service.addUser(user);
		//service.updateUser(user);
	//System.out.println(service.searchUser(67480011));
	//service.deleteUser(67480011);
	}

}
