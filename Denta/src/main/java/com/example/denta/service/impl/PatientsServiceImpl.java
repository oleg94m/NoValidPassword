package com.example.denta.service.impl;


import com.example.denta.dao.DoctorDAO;
import com.example.denta.dao.PatientsDAO;
import com.example.denta.entity.Doctor;
import com.example.denta.entity.Patients;
import com.example.denta.service.PatientsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientsServiceImpl implements PatientsService {

	private final PatientsDAO patientsDAO;
	private final DoctorDAO doctorDAO;

	public PatientsServiceImpl(PatientsDAO patientsDAO, DoctorDAO doctorDAO) {
		this.patientsDAO = patientsDAO;
		this.doctorDAO = doctorDAO;
	}

	@Transactional //(rollbackFor = RuntimeException.class)
	public void addPatients(Patients patients) {
		patientsDAO.add(patients);
	}

	@Transactional
	public void deletePatients(long[] ids) {
		patientsDAO.delete(ids);
	}

	@Transactional(readOnly=true)
	public List<Doctor> listDoctor() {
		return doctorDAO.list();
	}


	@Transactional(readOnly=true)
	public List<Patients> listPatients(Doctor doctor, int start, int count) {
		return patientsDAO.list(doctor, start, count);
	}

	@Transactional(readOnly=true)
	public List<Patients> listPatients(Doctor doctor) {
		return patientsDAO.list(doctor, 0, 0);
	}

	@Transactional(readOnly = true)
	public long count() {
		return patientsDAO.count();
	}

	@Transactional(readOnly=true)
	public Doctor findDoctor(long id) {
		return doctorDAO.findOne(id);
	}

	@Transactional(readOnly=true)
	public List<Patients> searchPatients(String pattern) {
		return patientsDAO.list(pattern);
	}

}
