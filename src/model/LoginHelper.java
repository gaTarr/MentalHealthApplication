package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.jpa.PersistenceProvider;

public class LoginHelper {


	//static EntityManagerFactory emfactory = new PersistenceProvider().createEntityManagerFactory("users", null);
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
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("users");
		EntityManager em = emfactory.createEntityManager();
		User results = null;
		
		try {
			TypedQuery<User> query = em.createQuery("select u.username, u.password from User u where u.username = :selectedUsername AND u.password = :selectedPassword", User.class);
			query.setParameter("selectedUsername", username);
			query.setParameter("selectedPassword", password);
			try {
				return true;
			} catch(javax.persistence.NoResultException e)
			{
				return false;
			} 
		} finally {
			em.close();
			emfactory.close();
			}
		}
	

	

	public void cleanUp() {
		emfactory.close();
	}
}
