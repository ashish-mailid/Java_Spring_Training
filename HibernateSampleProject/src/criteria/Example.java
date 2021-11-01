package criteria;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Example {
	static SessionFactory sessionFactory;
	static Configuration conf=new Configuration();
	static {
	conf.configure("hibernate.cfg.xml");
	sessionFactory = conf.buildSessionFactory();
	}
	
	public static void main(String[] args) {
		
		Session session=sessionFactory.openSession();
		Criteria c=session.createCriteria(Product.class);

		System.out.println(c.list());
		
		Criterion c1=Restrictions.gt("price", 99.0);
		c.add(c1);
		
		c.addOrder(Order.desc("code"));
		c.setMaxResults(2);
		System.out.println(c.list());
	
		c.setProjection(Projections.sum("price"));
		
		System.out.println(c.list());

		c.setProjection(Projections.property("stock"));
		System.out.println(c.list());

		c.setProjection(Projections.property("name"));
		c.add(Restrictions.isNotNull("name"));
		
		
		System.out.println(c.list());	
		
		
		
	}

}
