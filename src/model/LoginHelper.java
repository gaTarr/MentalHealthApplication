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
		em.flush();
		em.getTransaction().commit();
		em.close();
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
