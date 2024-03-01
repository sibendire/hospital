package com.hospital.hospitalmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Doctor {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private Long phone;
    @OneToMany(mappedBy = "doctor")
   private List<Patient> patients;
}
