package tests;

import model.Clinics;
import model.Facilities;
import model.Medications;

/**
 * @author Craig Longnecker
 * Tests for Medications, Clinics and Facilities
 *
 */
public class MedsClinicsFacTests { // class MedsClinicsFacTests
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) { // Begin main.
		// Test Medications.
		Medications testMedications = new Medications("Med Brand Name", "Med Generic Name", "Med Type", "testmedications@test.com");
		testMedications.setIdMed(90);
		System.out.print("Test Medication - ");
		System.out.println(testMedications.toString());
		
		// Test Clinics.
		Clinics testClinics = new Clinics("Clinic Name", "Clinic City", "IA", "testclinics@test.com");
		testClinics.setIdClinic(99);
		System.out.print("Test Clinic - ");
		System.out.println(testClinics.toString());

		// Test Facilities.
		Facilities testFacilities = new Facilities("Facility Name", "Facility City", "IA", "testfacilities@test.com");
		testFacilities.setIdFacility(27);
		System.out.print("Test Facility - ");
		System.out.println(testFacilities.toString());
	} // Close main.
} // Close class MedsClinicsFacTests
