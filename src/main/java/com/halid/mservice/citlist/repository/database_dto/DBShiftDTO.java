package com.halid.mservice.citlist.repository.database_dto;

public record DBShiftDTO(
        // Citizen data
        String firstName,
        String lastName,
        String patronymic,
        String phoneNumber,
        String address,

        // Transport data
        String brand,
        String model,
        String body,
        String color,
        String tailNumber,
        String description
) {
}
