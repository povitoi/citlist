package com.halid.mservice.citlist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "citlist", name = "t_current_shift")
public class ShiftRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Citizen data
    @Column(name = "c_firstname", nullable = false)
    private String firstName;
    @Column(name = "c_lastname", nullable = false)
    private String lastName;
    @Column(name = "c_patronymic")
    private String patronymic;
    @Column(name = "c_phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "c_address", nullable = false)
    private String address;

    // Transport data
    @Column(name = "c_brand", nullable = false)
    private String brand;
    @Column(name = "c_model")
    private String model;
    @Column(name = "c_body", nullable = false)
    private String body;
    @Column(name = "c_color", nullable = false)
    private String color;
    @Column(name = "c_tail_number", nullable = false)
    private String tailNumber;
    @Column(name = "c_description")
    private String description;
}
