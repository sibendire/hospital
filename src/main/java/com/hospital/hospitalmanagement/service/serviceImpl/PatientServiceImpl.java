package com.hospital.hospitalmanagement.service.serviceImpl;

import com.hospital.hospitalmanagement.entity.Patient;
import com.hospital.hospitalmanagement.repository.PatientRepository;
import com.hospital.hospitalmanagement.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> getPatientById(long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        Patient patients = patientRepository.existsById(Long);
        patients.setFirstName(patients.getFirstName());
        patients.setOtherName(patients.getOtherName());
        patients.setLastName(patients.getLastName());
        patients.setDateOfBirth(patients.getDateOfBirth());
        patients.setAddress(patients.getAddress());
        patients.setPhone(patients.getPhone());
        patients.setNationality(patients.getNationality());
        patients.setNextName(patients.getNextName());
        patients.setPostCode(patients.getPostCode());
        patients.setPhoneNumber(patients.getPhoneNumber());
        patients.setRelationShip(patients.getRelationShip());

        return patientRepository.save(patients);
    }

    @Override
    public Patient getAllPatient() {
        return (Patient) patientRepository.findAll();
    }

    @Override
    public void deletePatientById(long id) {
        if (!patientRepository.existsById(id)){
          throw new IllegalArgumentException("patient does not exist");
        }
        patientRepository.deleteById(id);
    }
}
