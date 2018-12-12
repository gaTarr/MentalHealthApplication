package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.jpa.PersistenceProvider;

public class LoginHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MentalHealthApplication");
	
	public void insertUser(User u) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}
	
	/**This Method serves to insert
	 * a score in the database.  
	 * @param s
	 * added by Greg Tarr
	 */
	public void insertScore(Score s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
		System.out.println("In LoginHelper>insertScore method");
	}
	
	/**Used to get created user to 
	 * access UserId primary key to create
	 * score object
	 * @param userName
	 * @return
	 * added by Greg Tarr
	 */
	public User getUserByUsername(String uName){
		System.out.println("In LoginHelper>getUserByUsername");
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();	
		TypedQuery<User> query = em.createQuery("select u from User u where u.username = :selectedUsername", User.class);
		query.setParameter("selectedUsername", uName);
		User found = query.getSingleResult();
		em.close();
		return found;
	}

	public boolean login(String username, String password) {
		EntityManager em = emfactory.createEntityManager();
		User results = null;
		boolean st = false;
		
		try {
			TypedQuery<User> query = em.createQuery("SELECT * FROM User u WHERE u.username=? and u.password=?", User.class);
			query.setParameter(1, username);
			query.setParameter(2, password);
			results = query.getSingleResult();
			try { 
				st = true;
			} catch(javax.persistence.NoResultException e)
			{
				st = false;
			} 
		} finally {
			em.close();
			return st;
			}
		}


}
