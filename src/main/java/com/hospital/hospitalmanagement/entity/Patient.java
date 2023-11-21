package com.hospital.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String otherName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String PhoneNumber;
    private String email;
    private String postCode;
    private String address;
    private String currentAddress;
    private String nationality;
    private String nextName;
    private String phone;
    private String relationShip;
    @OneToOne
    @JoinColumn(name = "diagnosis_id")
    private Diagnosis diagnosis;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    @ManyToMany
    @JoinTable(name = "patient_diagnosis",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "institute_id")

    )
    private List<Institute> institute;


}
