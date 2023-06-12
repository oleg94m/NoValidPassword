package com.example.denta.entity;

import java.util.Date;

public class ClientCard {

    private long id;
    private String lastName;
    private String firstName;
    private String midlName;
    public enum Gender {
        MAN,
        Woman
    }
    private Gender gender;
    private Date DateBirthday;
    private String phone;
    private String pastConditions;
    private String relatedConditions;
    private String allergies;
    private String medications;
    private String bite;
    private String complaints;


}
