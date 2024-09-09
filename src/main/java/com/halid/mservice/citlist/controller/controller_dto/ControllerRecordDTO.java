package com.halid.mservice.citlist.controller.controller_dto;

public record ControllerRecordDTO(
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
