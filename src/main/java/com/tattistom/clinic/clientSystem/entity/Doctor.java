package com.tattistom.clinic.clientSystem.entity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "DOCTORS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String specialization;
    @Column
    private String phoneNumber;
    @Column
    private String email;
    @Column
    private String password;






}
