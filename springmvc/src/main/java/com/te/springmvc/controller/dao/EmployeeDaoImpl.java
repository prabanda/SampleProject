package com.te.springmvc.controller.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.te.springmvc.dto.EmployeeBean;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	

	@Override
	public EmployeeBean authenicate(int id, String pw) {
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("SpringData");
			entityManager=entityManagerFactory.createEntityManager();
			EmployeeBean employeeBean=entityManager.find(EmployeeBean.class, id);
			if (employeeBean!=null) {
				if (employeeBean.getPw().equals(pw)) {
					System.out.println("login successfully");
					return employeeBean;
				}else {
					System.out.println("Invalid credentials");
					return null;
				}
				}else {
					System.out.println("user not found");
					return null;
				
			}

			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EmployeeBean getId(int id) {
		entityManagerFactory=Persistence.createEntityManagerFactory("SpringData");
		entityManager=entityManagerFactory.createEntityManager();
		EmployeeBean bean=entityManager.find(EmployeeBean.class, id);
		if (bean != null) {
			return bean;
		} else {
			return null;
		}

		

		
	}

	@Override
	public boolean delete() {
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("SpringData");
			entityManager=entityManagerFactory.createEntityManager();
			EmployeeBean bean=entityManager.find(EmployeeBean.class, "id");
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			if (bean!=null) {
				entityManager.remove(bean);
				entityTransaction.commit();
			}else {
				return false;
			}
			
			
			
		} catch (Exception e) {
			if (entityTransaction!=null) {
				entityTransaction.rollback();
			}
			
		}
		return false;
	}
	@Override
	public List<EmployeeBean> getAllEmployees() {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("SpringData");
		EntityManager manager = managerFactory.createEntityManager();

		String select = "from EmployeeBean";

		Query query = manager.createQuery(select);

		List<EmployeeBean> list = query.getResultList();

		if (list != null) {
			return list;
		} else {
			return null;
		}

	}// end of getAllEmployess

}
