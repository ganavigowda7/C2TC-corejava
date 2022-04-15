package tnsif.c2tc.batch9;

import tnsif.c2tc.batch09.Customer;
import tnsif.c2tc.batch09.service.CustomerService;
import tnsif.c2tc.batch09.service.CustomerServiceImpl;

public class client {

	public static void main(String[] args) {
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		customer.setId(657489);
		customer.setName("shravani gowda");
		customer.setOrders("mobile");
		customer.setPhone(9663261);
		customer.setEmail("shravani@gmailcom");
		service.addCustomer(customer);
		//service.updateCustomer(customer);
		//service.deleteCustomer(6572489);
		//System.out.println(service.searchCustomer(657489));
	}

}
