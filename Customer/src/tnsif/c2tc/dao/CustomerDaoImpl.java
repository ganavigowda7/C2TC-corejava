package tnsif.c2tc.dao;

import javax.persistence.EntityManager;

import tnsif.c2tc.batch09.Customer;

public class CustomerDaoImpl implements CustomerDao {
	EntityManager entityManager;
	public CustomerDaoImpl()
	{
		 entityManager = configuration.getEntityManager();
	}
	

	
	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
		
	}
	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
		
	}
	@Override
	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
	}



	@Override
	public void deleteCustomer(int id) {
		Customer cus=entityManager.find(Customer.class, id);
		entityManager.remove(cus);
	}



	@Override
	public Customer searchCustomer(int id) {
		Customer cus=entityManager.find(Customer.class, id);
		return cus;
	}



	
	
}