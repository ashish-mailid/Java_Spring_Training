package hql;

import java.util.Iterator;
import java.util.List;

import manytoone.Employee;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class Client {
	private static SessionFactory factory;
	static {
		factory=HibernateUtil.getSessionFactory();	
	}
	
	public static List<String> findCityByEmpName(String empName)
	{
		Session session=factory.openSession();
		Query q=session.createQuery("select e.address.city from Employee e where e.name like :empname");
		q.setParameter("empname", "%"+empName+"%");
		return q.list();
	}
	
	public static void getAllEmployeesLeft()
	{
		Session session=factory.openSession();
		Query q=session.createQuery("select e from Employee e left join e.address a");
		
		List<Employee> el= q.list();
		for(Employee e:el)
			System.out.println(e);
	}	
	public static void getAllEmployeesRight()
	{
		Session session=factory.openSession();
		Query q=session.createQuery("select e.name,a.addressId from Employee e right join e.address a");
		
		Iterator it= q.iterate();
		while(it.hasNext()){
			Object o[]=(Object[]) it.next();
			for(Object o1:o)
			{
				System.out.print(o1+" ");
			}
		}
	}	
	
	public static void getAllEmployeesFull()
	{
		Session session=factory.openSession();
		Query q=session.createQuery("select e.name,a.addressId from Employee e full join e.address a");
		
		Iterator it= q.iterate();
		while(it.hasNext()){
			Object o[]=(Object[]) it.next();
			for(Object o1:o)
			{
				System.out.print(o1+" ");
			}
		}
	}	
	public static void getAllEmployeesInner()
	{
		Session session=factory.openSession();
		Query q=session.createQuery("select e from Employee e Inner join e.address a");
		
		List<Employee> el= q.list();
		for(Employee e:el)
			System.out.println(e);
	}
	public static void getAllEmployees()
	{
		Session session=factory.openSession();
		Query q=session.createQuery("select e from Employee e,Address a where e.address.addressId=a.addressId");
		
		List<Employee> el= q.list();
		for(Employee e:el)
			System.out.println(e);
	}
	public static void main(String[] args) {
		
	//System.out.println(findCityByEmpName("et"));
	
		//getAllEmployeesLeft();
		//getAllEmployeesInner();
		getAllEmployeesRight();
		//getAllEmployeesFull();

	}

}
