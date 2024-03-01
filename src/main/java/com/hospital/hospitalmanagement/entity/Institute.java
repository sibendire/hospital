package com.hospital.hospitalmanagement.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
