package com.hospital.hospitalmanagement.service;

import com.hospital.hospitalmanagement.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    Patient savePatient(Patient patient);

    Optional<Patient> getPatientById(long id);

    boolean updatePatient(Long id, Patient patient);

    boolean deletePatient(Long id);

    List<Patient> getAllPatients();
}
