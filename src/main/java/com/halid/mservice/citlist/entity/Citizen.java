package com.halid.mservice.citlist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "citlist", name = "t_citizen")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
}
