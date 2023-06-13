package com.example.dentaclinic.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Table(name = "patients")
public class ClientCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String midlName;

    public enum Gender {
        чоловік,
        жінка
    }

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonProperty("date_of_birth")
    private Date DateBirthday;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "past_conditions")

    private String pastConditions;
    @Column(name = "related_conditions")

    private String relatedConditions;
    @Column(name = "allergies")

    private String allergies;
    @Column(name = "medications")

    private String medications;

    public enum Bite {
        ортогнатичний, глибокий, перехресний, дистальний, мезіальний, прямий,відкритий
    }
    @Column(name = "bite")
    @Enumerated(EnumType.STRING)
    private Bite bite;

    @Column(name = "complaints")
    private String complaints;


}


