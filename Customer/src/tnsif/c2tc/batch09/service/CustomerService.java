package tnsif.c2tc.batch09.service;

import tnsif.c2tc.batch09.Customer;

public interface CustomerService {

	public void addCustomer(Customer  customer);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(int id);

	public Customer searchCustomer(int id);

}	

	
	
