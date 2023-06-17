package com.example.denta.controller;

import com.example.denta.entity.Doctor;
import com.example.denta.service.PatientsService;
import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Getter
@Setter
public class DoctorController {

    static final int DEFAULT_GROUP_ID = -1;

    private final PatientsService patientsService;

    public DoctorController(PatientsService patientsService) {
        this.patientsService = patientsService;
    }

    @RequestMapping("/doctor/{id}")
    public String listDoctor(@PathVariable(value = "id") long doctorId,
                            Model model) {
        Doctor doctor = (doctorId != DEFAULT_GROUP_ID) ?
                patientsService.findDoctor(doctorId) : null;

        model.addAttribute("doctor", patientsService.listDoctor());
        model.addAttribute("patients", patientsService.listPatients(doctor));

        return "patients";
    }
}
