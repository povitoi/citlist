package com.halid.mservice.citlist.controller.controller_dto;

public record ControllerCitizenDTO(
        String firstName,
        String lastName,
        String patronymic,

        String phoneNumber,

        String address
) {
}
