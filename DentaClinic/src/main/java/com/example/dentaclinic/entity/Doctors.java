package com.example.dentaclinic.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;



@Entity
    @Getter
    @Setter
    @Table(name="doctors")
    public class Doctors {
        @Id
        @GeneratedValue
        private Long id;
        public enum doctorname {
            Masiuk_N_I, Masiuk_E_M, Ivaha_M_E, Lavetskiy_R_A, Paluh_Y_V,Lisovska_O_H, Kushinska_G_B, Vavrusevish_G_Z
        }
        @Column(name = "doctorname")
        @Enumerated(EnumType.STRING)
        private ClientCard.Bite doctorname;



    }

