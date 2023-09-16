package com.jsp.hospital.branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String hospital_name;
private String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHospital_name() {
	return hospital_name;
}
public void setHospital_name(String hospital_name) {
	this.hospital_name = hospital_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
