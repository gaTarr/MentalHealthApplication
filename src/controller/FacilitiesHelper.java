package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Facilities;

/**
 * @author Craig Longnecker Class FacilitiesHelper
 *
 */
public class FacilitiesHelper { // class FacilitiesHelper.
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
	 * ShowAllFacilities method.
	 * 
	 * @return
	 */
	public List<Facilities> showAllFacilities() { // Begin showAllFacilities method.
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<Facilities> typedQuery = em.createQuery("select li from Facilities li", Facilities.class);
		List<Facilities> allFacilities = typedQuery.getResultList();
		em.close();
		return allFacilities;
	} // Close showAllItems method.
} // Close class FacilitiesHelper.
