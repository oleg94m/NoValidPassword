package com.example.dentaclinic.dao;

import com.example.dentaclinic.entity.Doctors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class DoctorsDAOImpl {
    @PersistenceContext
    private EntityManager entityManager;


    public void add(Doctors doctors) {
        entityManager.persist(doctors);
    }


    public void delete(Doctors doctors) {
        entityManager.remove(doctors);
    }


    public Doctors findOne(long id) {
        return entityManager.getReference(Doctors.class, id);
    }

}
