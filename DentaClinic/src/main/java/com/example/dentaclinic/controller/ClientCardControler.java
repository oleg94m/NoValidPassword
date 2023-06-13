package com.example.dentaclinic.controller;


import com.example.dentaclinic.entity.ClientCard;
import com.example.dentaclinic.service.interfaces.ClientCardInterface;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


@Controller
@RequestMapping("/ClientCard")

public class ClientCardControler {
    @Autowired
    private ClientCardInterface clientCardInterface;

    public ClientCardControler(ClientCardInterface clientCardInterface) {
        super();
        this.clientCardInterface = clientCardInterface;
    }

    @GetMapping("/patients")
    public String ListClientCard(Model model) {
        model.addAttribute("patients", ClientCardInterface.getAllCardClient());
        return "ClientCards";
    }

    @PostMapping(value = "/add")
    public String addNewEmployee(HttpServletRequest request) {
        ClientCard clientCard = new ClientCard();
        clientCard.setLastName(request.getParameter("last_name"));
        clientCard.setFirstName(request.getParameter("first_name"));
        clientCard.setMidlName(request.getParameter("middle_name"));
        clientCard.setGender(ClientCard.Gender.valueOf(request.getParameter("gender")));
        String dateOfBirthString = request.getParameter("date_of_birth");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date dateOfBirth = dateFormat.parse(dateOfBirthString);
            clientCard.setDateBirthday(dateOfBirth);
        } catch (ParseException e) {
            // Handle parsing exception
            e.printStackTrace();
        }

        clientCard.setPhone(request.getParameter("phone"));
        clientCard.setPastConditions(request.getParameter("past_conditions"));
        clientCard.setPastConditions(request.getParameter("related_conditions"));
        clientCard.setRelatedConditions(request.getParameter("allergies"));
        clientCard.setMedications(request.getParameter("medications"));
        clientCard.setBite(ClientCard.Bite.valueOf(request.getParameter("bite")));
        clientCard.setComplaints(request.getParameter("complaints"));


        return "redirect:/AddClient";
    }
}

