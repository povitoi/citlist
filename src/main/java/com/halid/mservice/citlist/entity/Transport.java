package com.halid.mservice.citlist.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "citlist", name = "t_transport")
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "c_brand", nullable = false)
    private String brand;
    @Column(name = "c_model", nullable = false)
    private String model;
    @Column(name = "c_color", nullable = false)
    private String color;
    @Column(name = "c_body", nullable = false)
    private String body;
    @Column(name = "c_description")
    private String description;

}
