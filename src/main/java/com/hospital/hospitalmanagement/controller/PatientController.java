package com.hospital.hospitalmanagement.controller;

import com.hospital.hospitalmanagement.entity.Patient;
import com.hospital.hospitalmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class PatientController {
    @Autowired
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/list")
    public String showAllPatients(Model model) {
        model.addAttribute("patient" ,patientService.getAllPatient());
        return "patient_list";
    }

    @GetMapping("/patients")
    public String showPatient(Model model) {
        model.addAttribute("patient", new Patient());
        return "patient_Form";
    }

    @PostMapping("/savePatient")
    public String saveNewPatient(Patient patient) {
        patientService.savePatient(patient);
        return "redirect:patient_list";
    }

}
