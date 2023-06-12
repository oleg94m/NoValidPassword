package com.example.dentaclinic.entity;


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
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "midl_Name")
    private String midlName;

    public enum Gender {
        MAN,
        Woman
    }

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "date_of_birthday")
    private Date DateBirthday;

    @Column(name = "phone", nullable = false)
    //@Pattern(regexp = "\\+380\\d{9}", message = "Phone number should start with '+380' and have 9 additional digits.")
    private String phone;

    @Column(name = "past_Conditions")

    private String pastConditions;
    @Column(name = "related_Conditions")

    private String relatedConditions;
    @Column(name = "allergies")

    private String allergies;
    @Column(name = "medications")

    private String medications;

    @Column(name = "bite")
    //@Pattern(regexp = "^( глибокий|ортогнатичний|перехресний|прямий|мезіальний)$", message = "Invalid bite option.")
    private String bite;

    @Column(name = "complaints")
    private String complaints;


}


