package com.hospital.hospitalmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Institute {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    @ManyToMany(mappedBy = "institute")
    private List<Patient> patient;
}
