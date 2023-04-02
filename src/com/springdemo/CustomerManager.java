package com.springdemo;
public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;
	// constructor injection 
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	// setter injection da var ama ci daha cok tercih ediliyor	
	public void add() {
		// is kurallari calistirilir 
		customerDal.add();
	}
}
