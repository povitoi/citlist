package com.halid.mservice.citlist.repository.database_dto;

public record DBCitizenDTO(
        String firstName,
        String lastName,
        String patronymic,

        String phoneNumber,

        String address
) {
}