package com.example.denta.dao;

import com.example.denta.entity.Doctor;

import java.util.List;

public interface DoctorDAO {

    Doctor findOne(long id);
    List<Doctor> list();
}
