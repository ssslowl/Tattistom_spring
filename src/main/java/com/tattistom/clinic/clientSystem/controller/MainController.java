package com.tattistom.clinic.clientSystem.controller;

import com.tattistom.clinic.clientSystem.entity.Patient;
import com.tattistom.clinic.clientSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    PatientService service = new PatientService();
    @GetMapping("/")
    public String greeting(Model model) {
        return "Home";
    }


    @GetMapping("/patients")
    public String patientTable(Model model){



        List<Patient> patients = service.getPatientList();

        model.addAttribute("patients", patients);

        return "patients";
    }


    @PostMapping("/patients")
    public String addPatient(Patient patient){
        service.addPatient(patient);
        return ("redirect:/patients");
    }

}