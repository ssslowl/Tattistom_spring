package com.tattistom.clinic.clientSystem.repository;

import com.tattistom.clinic.clientSystem.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
