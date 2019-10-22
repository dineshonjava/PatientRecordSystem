/**
 * 
 */
package com.doj.patientrecord.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doj.patientrecord.model.Patient;
import com.doj.patientrecord.service.PatientService;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class PatientController {
	
	protected Logger logger = Logger
			.getLogger(PatientController.class.getName());
	
	@Autowired
	PatientService patientService;
	
	
	@GetMapping("/patients")
	public List<Patient> all() {
		logger.info("patients-microservice all() invoked");
		List<Patient> accounts = patientService.findAll();
		logger.info("patients-microservice all() found: " + accounts.size());
		return accounts;
	}
	
	@RequestMapping("/patients/{id}")
	public Patient byId(@PathVariable("id") int id) {
		logger.info("patients-microservice byId() invoked: " + id);
		Patient patient = patientService.findById(id);
		logger.info("patients-microservice byId() found: " + patient);
		return patient;
	}
	
	@PostMapping("/patients")
	public Patient save (@RequestBody Patient patient){
		logger.info("patients-microservice save() invoked");
		patient = patientService.save(patient);
		logger.info("patients-microservice save() invoked");
		return patient;
	}
}
