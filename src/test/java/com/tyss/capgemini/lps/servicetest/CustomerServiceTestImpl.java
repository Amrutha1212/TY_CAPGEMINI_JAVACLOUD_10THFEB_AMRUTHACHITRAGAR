package com.tyss.capgemini.lps.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.exception.UsernameAlreadyExistException;
import com.tyss.capgemini.lps.factory.FactoryDAO;

public class CustomerServiceTestImpl {
	private CustomerBean customer = new CustomerBean();

	private CustomerDAO customerDAO = FactoryDAO.getCustomerDAO();

	@Test
	void payLoan() {
		try {
			customer.setUserName("sanant28");
			customer.setPassword("Anant@123");
			customer.getLoanAmount();
		} catch (Exception e) {
			assertThrows(UsernameAlreadyExistException.class, () -> {
				customerDAO.changePassword(customer);
			});
		}
	}

	@Test
	void changePassword() {
		customer.setPassword("Anant#1234");
		try {
			boolean flag = customerDAO.changePassword(customer);
			assertEquals(flag, true);
		} catch (Exception e) {
			assertThrows(UsernameAlreadyExistException.class, () -> {
				customerDAO.changePassword(customer);
			});
		}
	}

	@Test
	void checkBalance() {
		String userName = "sanant28";
		String password = "Anant@123";
		try {
			boolean flag = customerDAO.checkBalance(userName, password);
			assertEquals(flag, true);
		} catch (Exception e) {
			assertThrows(UsernameAlreadyExistException.class, () -> {
				customerDAO.checkBalance(userName, password);
			});
		}

	}
}
