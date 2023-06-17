package com.example.denta.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor

    @Table(name="Doctor")
    public class Doctor {
        @Id
        @GeneratedValue
        private Long id;
        private String name;

        @OneToMany(mappedBy="doctor", cascade= CascadeType.ALL)
        private List<Patients> patinets = new ArrayList<>();

    }
