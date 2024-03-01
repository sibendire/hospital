package com.hospital.hospitalmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Diagnosis {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String period;
    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
