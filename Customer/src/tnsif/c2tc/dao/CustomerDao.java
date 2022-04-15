package tnsif.c2tc.dao;

import tnsif.c2tc.batch09.Customer;

public interface CustomerDao {

	public void startTransaction();

	public void addCustomer(Customer customer);

	public void endTransaction();

	public void updateCustomer(Customer customer);

	public void deleteCustomer(int id);

	public Customer searchCustomer(int id);

}
