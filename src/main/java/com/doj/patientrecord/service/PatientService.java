/**
 * 
 */
package com.doj.patientrecord.service;

import java.util.List;

import com.doj.patientrecord.model.Patient;

/**
 * @author Dinesh.Rajput
 *
 */
public interface PatientService {
		
	Patient save(Patient patient);
	
	List<Patient> findAll();
	
	Patient findById(int patientId);

}
