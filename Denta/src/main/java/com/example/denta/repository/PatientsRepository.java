package com.example.denta.repository;


import com.example.denta.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patients, Long>{

}
