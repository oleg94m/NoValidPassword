package com.example.denta;

import com.example.denta.repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DentaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DentaApplication.class, args);
    }

    @Autowired
    private PatientsRepository patientsRepository;

}