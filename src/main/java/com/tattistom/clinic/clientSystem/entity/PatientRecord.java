package com.tattistom.clinic.clientSystem.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "PATIENT_RECORDS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PatientRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Patient patientId;
    @ManyToOne(fetch = FetchType.LAZY)
    private Doctor doctor;
    @Column
    private String diagnosis;
    @Column
    private String treatment;

}

