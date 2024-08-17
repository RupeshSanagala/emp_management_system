package employeedata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import employeedata.dto.Employee;



@Component
public class EmployyeDao {
	@Autowired
	EntityManager em;
	
	public Employee saveEmployee(Employee emp) {
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		return emp;
	}
	
	public Employee findEmployee(int empId)
	{
		return em.find(Employee.class, empId);
	}
	
	public Employee deleteEmployee(int id) {
		Employee emp = em.find(Employee.class, id);
	    em.getTransaction().begin();
	    em.remove(emp);
	    em.getTransaction().commit();
	    return emp;
	}
	public Employee updateEmployee(Employee empNew, int empId) {
		Employee oldEmployee = em.find(Employee.class, empId);
		if(oldEmployee !=null ) {
			empNew.setEmpid(empId);
			em.getTransaction().begin();
			em.merge(empNew);
			em.getTransaction().commit();
			return empNew;
		}
		return null;
	}
	public List<Employee> findAll(){
		Query query = em.createQuery("select e from Employee e");
	    return query.getResultList();	
	}
	
	public Employee findByEmailId(String email) {
		Query query = em.createQuery("select e from Employee e where email = ?");
		query.setParameter(1, email);
	    return (Employee)query.getSingleResult();	
	}
	
}
