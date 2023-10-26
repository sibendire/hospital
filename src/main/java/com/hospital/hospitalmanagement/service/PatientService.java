package com.hospital.hospitalmanagement.service;

import com.hospital.hospitalmanagement.entity.Patient;

import java.util.Optional;

public interface PatientService {
Patient savePatient(Patient patient);
Optional<Patient> getPatientById(long id);
Patient updatePatient(Patient patient);
Patient getAllPatient();
void deletePatientById(long id);
}
