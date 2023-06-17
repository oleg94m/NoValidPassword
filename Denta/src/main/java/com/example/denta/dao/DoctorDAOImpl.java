package com.example.denta.dao;

import com.example.denta.entity.Doctor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DoctorDAOImpl implements DoctorDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Doctor findOne(long id) {
        return entityManager.getReference(Doctor.class, id);
    }

    @Override
    public List<Doctor> list() {
        TypedQuery<Doctor> query = entityManager.createQuery("SELECT g FROM Doctor g", Doctor.class);
        return query.getResultList();
    }
}