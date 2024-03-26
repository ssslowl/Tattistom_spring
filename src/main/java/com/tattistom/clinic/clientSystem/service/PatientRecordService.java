package com.tattistom.clinic.clientSystem.service;


import com.tattistom.clinic.clientSystem.entity.PatientRecord;
import com.tattistom.clinic.clientSystem.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientRecordService {
    @Autowired
    private PatientRecordRepository patientRecordRepository;


    public PatientRecord addPatientRecord (PatientRecord record){
        return patientRecordRepository.save(record);
    }

    public List<PatientRecord> getPatientRecords(){
        return patientRecordRepository.findAll();
    }
}
