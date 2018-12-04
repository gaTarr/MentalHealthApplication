package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.jpa.PersistenceProvider;

public class LoginHelper {


	static EntityManagerFactory emfactory = new PersistenceProvider().createEntityManagerFactory("users", null);
	
	public void insertItem(User u) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
		
	}

	public boolean login(String username, String password) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("User");
		EntityManager em = emfactory.createEntityManager();
		User results = null;
		
		try {
			TypedQuery<User> query = em.createQuery("select u from users u where u.username = :username AND u.password = :password", User.class);
			query.setParameter("username", username);
			query.setParameter("password", password);
			try {
				User u = query.getSingleResult();
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
