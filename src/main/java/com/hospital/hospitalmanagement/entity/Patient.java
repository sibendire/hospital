package com.hospital.hospitalmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String otherName;
    private String lastName;
    private String dateOfBirth;
    private String PhoneNumber;
    private String email;
    private String postCode;
    private String address;
    private String currentAddress;
    private String nationality;
    private String nextName;
    private String phone;
    private String relationShip;


}
