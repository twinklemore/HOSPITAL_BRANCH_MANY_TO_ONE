package com.jsp.hospital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalZone {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("devesh");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	Branch branch=new Branch();
	branch.setBranch_name("SION-BRANCH");
	branch.setBranch_city("SION");
	branch.setC_no(3452678);
	
	Hospital hospital1=new Hospital();
	hospital1.setHospital_name("APOLLO");
	hospital1.setCity("SEAWOODS");
	
	Hospital hospital2=new Hospital();
	hospital2.setHospital_name("D.Y.PATIL HOSPITAL");
	hospital2.setCity("NERUL");
	
	Hospital hospital3=new Hospital();
	hospital3.setHospital_name("FORTIS HEALTHCARE");
	hospital3.setCity("GURGAON");
	
	entityTransaction.begin();
	entityManager.persist(hospital1);
	entityManager.persist(hospital2);
	entityManager.persist(hospital3);
	entityManager.persist(branch);
	entityTransaction.commit();
}
}
