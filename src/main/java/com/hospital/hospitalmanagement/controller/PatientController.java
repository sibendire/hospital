package com.hospital.hospitalmanagement.controller;

import com.hospital.hospitalmanagement.entity.Patient;
import com.hospital.hospitalmanagement.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/savePatient")
    public ResponseEntity<String> saveNewPatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body("Patient saved successfully");
    }

    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id) {
        Optional<Patient> patient = patientService.getPatientById(id);
        if (patient.isPresent()) {
            return ResponseEntity.ok(patient.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<Patient>> showAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        if (patients.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.ok(patients);
        }
    }

    @PutMapping("/patients/{id}")
    public ResponseEntity<String> updatePatient(@PathVariable("id") Long id, @RequestBody Patient patient) {
        boolean updated = patientService.updatePatient(id, patient);
        if (updated) {
            return ResponseEntity.ok("Patient updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable("id") Long id) {
        boolean deleted = patientService.deletePatient(id);
        if (deleted) {
            return ResponseEntity.ok("Patient deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
