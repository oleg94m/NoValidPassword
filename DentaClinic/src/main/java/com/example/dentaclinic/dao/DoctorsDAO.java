package com.example.dentaclinic.dao;

import com.example.dentaclinic.entity.Doctors;

import java.util.List;

public interface DoctorsDAO {

        void add(Doctors doctors);
        void delete(Doctors doctors);
        Doctors findOne(long id);

    }


