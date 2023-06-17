package com.example.denta.dao;

import com.example.denta.entity.Doctor;
import com.example.denta.entity.Patients;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PatientsDAOImpl implements PatientsDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(Patients patients) {
        entityManager.merge(patients);
    }

    @Override
    public void delete(long[] ids) {
        Patients c;
        for (long id : ids) {
            c = entityManager.getReference(Patients.class, id);
            entityManager.remove(c);
        }
    }

    @Override
    public List<Patients> list(Doctor doctor,
                               int start,
                               int count) {
        TypedQuery<Patients> query;

        if (doctor != null) {
            query = entityManager.createQuery("SELECT p FROM Patients p WHERE p.doctor = :doctor ORDER BY p.id DESC", Patients.class);
            query.setParameter("doctor", doctor);
        } else {
            query = entityManager.createQuery("SELECT p FROM Patients p ORDER BY p.id DESC", Patients.class);
        }

        if (start >= 0) {
            query.setFirstResult(start);
            query.setMaxResults(count);
        }

        return query.getResultList();
    }

    @Override
    public List<Patients> list(String pattern) {
        TypedQuery<Patients> query = entityManager.createQuery("SELECT p FROM Patients p WHERE p.firstName LIKE :pattern", Patients.class);
        query.setParameter("pattern", "%" + pattern + "%");
        return query.getResultList();
    }

    @Override
    public long count() {
        TypedQuery<Long> query = entityManager.createQuery("SELECT COUNT(p) FROM Patients p", Long.class);
        return query.getSingleResult();
    }
}