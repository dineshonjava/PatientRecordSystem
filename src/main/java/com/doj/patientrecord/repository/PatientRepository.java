/**
 * 
 */
package com.doj.patientrecord.repository;

import org.springframework.data.repository.CrudRepository;

import com.doj.patientrecord.model.Patient;

/**
 * @author Dinesh.Rajput
 *
 */
public interface PatientRepository extends CrudRepository<Patient, Integer>{
	
}
