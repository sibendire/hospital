package com.hospital.hospitalmanagement.service.serviceImpl;

import com.hospital.hospitalmanagement.entity.Patient;
import com.hospital.hospitalmanagement.repository.PatientRepository;
import com.hospital.hospitalmanagement.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> getPatientById(long id) {
        return patientRepository.findById(id);
    }

    @Override
    public boolean updatePatient(Long id, Patient patient) {
        if (!patientRepository.existsById(id)) {
            return false;
        }
        patient.setId(id); // Ensure the ID is set for the update operation
        patientRepository.save(patient);
        return true;
    }

    @Override
    public boolean deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            return false;
        }
        patientRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
