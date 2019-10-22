/**
 * 
 */
package com.doj.patientrecord.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Table
@Entity
public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="PATIENTID")
	private int patientId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="HEIGHT")
	private int height;
	
	@Column(name="WEIGHT")
	private double weight;
	
	@Column(name="BLOODPRESSURE")
	private int bloodPressure;
	
	
	public Patient() {
		super();
	}

	public Patient(int patientId, String name, int age, int height, double weight, int bloodPressure) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bloodPressure = bloodPressure;
	}
	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", bloodPressure=" + bloodPressure + "]";
	}
	

}
