package com.doj.patientrecord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doj.patientrecord.model.Patient;
import com.doj.patientrecord.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> findAll() {
		return (List<Patient>) patientRepository.findAll();
	}

	@Override
	public Patient findById(int patientId) {
		return patientRepository.findById(patientId).get();
	}

}
