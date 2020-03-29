package com.tyss.capgemini.lps.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;

public class ApplicationDAOTestImpl {
	private ApplicationBean application = new ApplicationBean();
	private CustomerBean customer = new CustomerBean();

	private ApplicationDAO applicationDao = FactoryDAO.getApplicationDAO();

	@Test
	void addApplicationTest() {
		application.setApplicationId(702);
		try {
			boolean flag = applicationDao.addApplication(customer);
			assertEquals(true, flag);
		} catch (Exception e) {
			applicationDao.addApplication(customer);
		}
		;
	} // end of catch block

	@Test
	void getAllApplicationTest() {
		List<ApplicationBean> allApplication = applicationDao.viewApplication();
		assertNotNull(allApplication);
	}

	@Test
	void updateApplication() {
		application.setApplicationId(702);
		application.setStatus("Accept");
		try {
			boolean flag = applicationDao.updateApplicationStatus(702, "Accept");
			assertEquals(flag, true);
		} catch (Exception e) {
			applicationDao.updateApplicationStatus(702, "Accept");
		}
	} // end of catch block

	@Test
	void getApplicationByStatausTest() {
		application.setLoanType("Home Construction");
		try {
			ApplicationBean applicationBean = applicationDao.getAllApplication("Home Construction");
			assertNotNull(applicationBean);
		} catch (Exception e) {
			applicationDao.getAllApplication(application.getStatus());
		}
	}
}
