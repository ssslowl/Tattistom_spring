package com.tattistom.clinic.clientSystem.service;


import com.tattistom.clinic.clientSystem.entity.Doctor;
import com.tattistom.clinic.clientSystem.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getDoctorList(){
        return doctorRepository.findAll();
    }


    public Doctor addDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }
}
