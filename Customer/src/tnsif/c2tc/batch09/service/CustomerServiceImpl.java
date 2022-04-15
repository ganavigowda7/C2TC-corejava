package tnsif.c2tc.batch09.service;

import tnsif.c2tc.batch09.Customer;

import tnsif.c2tc.dao.CustomerDao;
import tnsif.c2tc.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao cd;
	
public CustomerServiceImpl()
{
	cd=(CustomerDao) new CustomerDaoImpl();
}
	@Override
	public void addCustomer(Customer customer) {
		cd.startTransaction();
		cd.addCustomer(customer);
		cd.endTransaction();
	}
	@Override
	public void updateCustomer(Customer customer) {
		cd.startTransaction();
		cd.updateCustomer(customer);
		cd.endTransaction();
		
	}
	@Override
	public void deleteCustomer(int id) {
		cd.startTransaction();
		cd.deleteCustomer(id);
		cd.endTransaction();
	}
	@Override
	public Customer searchCustomer(int id) {
		Customer cs=cd.searchCustomer(id);
		return cs;
	}
	
}
