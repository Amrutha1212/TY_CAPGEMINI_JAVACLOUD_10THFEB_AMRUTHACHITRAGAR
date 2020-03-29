package com.tyss.capgemini.lps.factory;

import com.tyss.capgemini.lps.DAO.AdminDAO;
import com.tyss.capgemini.lps.DAO.AdminDAOImpl;
import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.DAO.ApplicationDAOImpl;
import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.DAO.CustomerDAOImpl;
import com.tyss.capgemini.lps.DAO.LoanDAO;
import com.tyss.capgemini.lps.DAO.LoanDAOImpl;

public class FactoryDAO {

	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	}

	public static AdminDAO getAdminDAO() {
		return new AdminDAOImpl();
	}

	public static ApplicationDAO getApplicationDAO() {
		return new ApplicationDAOImpl();
	}

	public static LoanDAO getLoanDAO() {
		return new LoanDAOImpl();
	}

}
