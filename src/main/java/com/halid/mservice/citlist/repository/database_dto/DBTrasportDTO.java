package com.halid.mservice.citlist.repository.database_dto;

public record DBTrasportDTO(
        String brand,
        String model,
        String body,
        String color,

        String tailNumber,

        String description
) {
}