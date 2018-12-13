package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Clinics;

/**
 * @author Craig Longnecker Class ClinicsHelper
 *
 */
public class ClinicsHelper {
	/**
	 * EntityManagerFactory
	 */
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("mental_health_app");

	/**
	 * CleanUp Method.
	 */
	public void cleanUp() { // Begin cleanUp method.
		emfactory.close();
	} // Close cleanUp method.

	/**
	 * ShowAllClinics method.
	 * 
	 * @return
	 */
	public List<Clinics> showAllClinics() { // Begin showAllClinics method.
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Clinics> typedQuery = em.createQuery("select li from Clinics li", Clinics.class);
		List<Clinics> allClinics = typedQuery.getResultList();
		em.close();
		return allClinics;
	} // Close showAllItems method.
}
