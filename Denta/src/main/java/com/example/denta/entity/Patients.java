package com.example.denta.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "patients")
public class Patients {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	@Column(name = "first_name")
	private String firstName;


	@Column(name = "last_name")
	private String lastName;


	@Column(name = "middle_name")
	private String midlName;



	//@JsonProperty("date_of_birth")
	//private LocalDate DateBirthday;

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


	@Column(name = "complaints")
	private String complaints;

	public Patients(String firstName, String lastName, String midlName, String phone, String pastConditions, String relatedConditions, String allergies, String medications, String complaints) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.midlName = midlName;
		this.phone = phone;
		this.pastConditions = pastConditions;
		this.relatedConditions = relatedConditions;
		this.allergies = allergies;
		this.medications = medications;
		this.complaints = complaints;
	}
}




