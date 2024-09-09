package com.halid.mservice.citlist.controller.controller_dto;

public record ControllerTransportDTO(
        String brand,
        String model,
        String body,
        String color,

        String tailNumber,

        String description
) {
}
