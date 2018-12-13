package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Parameter;
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
	
	public String getScores(int userID) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		List<Integer> query = em.createQuery("select s.score from Score s where s.idUser = "+userID+"", Integer.class).getResultList();
		int[] scores = new int[query.size()];
		
		for (int i = 0; i < query.size(); i++) {
			scores[i] = query.get(i);
		}
		
		String result = "";
		for(int i = 0; i < scores.length; i++) {
			result += scores[i];
			if(i < scores.length -1) {
				result += ", ";
			}
		}
		System.out.println(result);
		return result;
	}

	public boolean login(String uname, String pword) {
		EntityManager em = emfactory.createEntityManager();
		User results = null;
		boolean st = false;
		System.out.println("0");
		try {
			em.getTransaction().begin();	
			TypedQuery<User> queryU = em.createQuery("select u from User u where u.username = :selectedUsername", User.class);
			
			queryU.setParameter("selectedUsername", uname);
			User found = queryU.getSingleResult();

			System.out.println(uname);
			if(found.getUsername() != null) {
				System.out.println(uname);
				st = true;
				return st;
			} else {
				st = false;
			}
			System.out.println("5");
			em.close();
			return st;
		} catch (Exception e) {
			System.out.println("2");
			e.printStackTrace();
			st = false;
		} finally { 
			em.close();
			System.out.println("3");
			return st;
			}
		}
}