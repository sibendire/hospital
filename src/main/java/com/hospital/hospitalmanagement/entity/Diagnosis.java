package com.hospital.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
