package com.example.denta.service;

import com.example.denta.entity.Doctor;
import com.example.denta.entity.Patients;

import java.util.List;

public interface PatientsService {
	void addPatients(Patients patients);
	void deletePatients(long[] ids);
	List<Doctor> listDoctor();
	List<Patients> listPatients(Doctor doctor, int start, int count);
	List<Patients> listPatients(Doctor doctor);
	long count();
	Doctor findDoctor(long id);
	List<Patients> searchPatients(String pattern);
}
