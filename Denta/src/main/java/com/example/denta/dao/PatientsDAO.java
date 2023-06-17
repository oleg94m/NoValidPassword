package com.example.denta.dao;

import com.example.denta.entity.Doctor;
import com.example.denta.entity.Patients;
import java.util.List;

public interface PatientsDAO {
    void add(Patients patients);
    void delete(long[] ids);
    List<Patients> list(Doctor doctor, int start, int count);
    List<Patients> list(String pattern);
    long count();
}
