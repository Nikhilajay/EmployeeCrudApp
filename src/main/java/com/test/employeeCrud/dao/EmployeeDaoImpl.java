package com.test.employeeCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.test.employeeCrud.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@PersistenceContext
    private EntityManager entityManager;
	
	
	
	public List<Employee> getEmpDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Employee.class);
		return criteria.list();
	}
	
	public Employee getEmployeeById(int id )
	{
		Employee emp = null;
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		criteria.setMaxResults(1);
		emp = (Employee) criteria.uniqueResult();
		return emp;
	}
	
	public String deleteEmployee(int id)
	{
		Session session = entityManager.unwrap(Session.class);
		Transaction tx = session.beginTransaction();
		Employee camp = (Employee ) session.createCriteria(Employee.class)
                   .add(Restrictions.eq("id", id)).uniqueResult();
		session.delete(camp);
		tx.commit();
		session.close();
		return id+"deleted!!";
	}
	
	public 	String updateEmp(Employee employee)
	{
		 Session session = entityManager.unwrap(Session.class);
		 Transaction tx = session.beginTransaction();
		 session.update(employee);
		 tx.commit();
		 session.close();
		 return "updated!!";
	}
	
	public String createEmployee(Employee employee)
	{
		Session session = entityManager.unwrap(Session.class);
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
		return "created!!";
	}


}
