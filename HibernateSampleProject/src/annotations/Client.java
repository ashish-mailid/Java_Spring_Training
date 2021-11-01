package annotations;

import java.util.HashSet;
import java.util.Set;
 

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
 

 
public class Client {
 
    public static void main(String[] args) {
 
        Cart cart = new Cart();
        cart.setName("MyCart");
         
        Item item1 = new Item("I10", 10, 1, cart);
        Item item2 = new Item("I20", 20, 2, cart);
        Set<Item> itemsSet = new HashSet<Item>();
        itemsSet.add(item1); itemsSet.add(item2);
         
        cart.setItems(itemsSet);
        cart.setTotal(10*1 + 20*2);
         
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        try{
        //Get Session
        	AnnotationConfiguration configuration=new AnnotationConfiguration();  
        	configuration.configure("hibernate.cfg.xml");  
    		 sessionFactory=configuration.buildSessionFactory(); 
          session = sessionFactory.getCurrentSession();
        System.out.println("Session created");
        //start transaction
        tx = session.beginTransaction();
        //Save the Model object
        session.save(cart);
        session.save(item1);
        session.save(item2);
        //Commit transaction
        tx.commit();
        System.out.println("Cart1 ID="+cart.getId());
        System.out.println("item1 ID="+item1.getId()+", Foreign Key Cart ID="+item1.getCart().getId());
        System.out.println("item2 ID="+item2.getId()+", Foreign Key Cart ID="+item1.getCart().getId());
         
        }catch(Exception e){
            System.out.println("Exception occured. "+e.getMessage());
            e.printStackTrace();
        }finally{
            if(!sessionFactory.isClosed()){
                System.out.println("Closing SessionFactory");
                sessionFactory.close();
            }
        }
    }
 
}