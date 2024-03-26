package com.tattistom.clinic.clientSystem.repository;

import com.tattistom.clinic.clientSystem.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
