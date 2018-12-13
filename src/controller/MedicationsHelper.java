package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Medications;

/**
 * @author Craig Longnecker Class MedicationsHelper
 *
 */
public class MedicationsHelper { // Class MedicationsHelper
	/**
	 * EntityManagerFactory
	 */
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MentalHealthApplication");

	/**
	 * CleanUp Method.
	 */
	public void cleanUp() { // Begin cleanUp method.
		emfactory.close();
	} // Close cleanUp method.

	/**
	 * ShowAllMedications method.
	 * 
	 * @return
	 */
	public List<Medications> showAllMedications() { // Begin showAllMedications method.
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Medications> typedQuery = em.createQuery("select li from Medications li", Medications.class);
		List<Medications> allMedications = typedQuery.getResultList();
		em.close();
		return allMedications;
	} // Close showAllItems method.
} // Close class MedicationsHelper.
