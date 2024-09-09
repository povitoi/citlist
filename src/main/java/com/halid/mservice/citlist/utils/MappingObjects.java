package com.halid.mservice.citlist.utils;

import com.halid.mservice.citlist.controller.controller_dto.ControllerRecordDTO;
import com.halid.mservice.citlist.entity.ShiftRecord;
import com.halid.mservice.citlist.repository.database_dto.DBShiftDTO;

public class MappingObjects {

    public static ShiftRecord mapControllerRecordtoShiftRecord(
            ControllerRecordDTO controllerrecord) {
        ShiftRecord shiftRecord = new ShiftRecord();
        shiftRecord.setFirstName(controllerrecord.firstName());
        shiftRecord.setLastName(controllerrecord.lastName());
        shiftRecord.setPatronymic(controllerrecord.patronymic());
        shiftRecord.setPhoneNumber(controllerrecord.phoneNumber());
        shiftRecord.setAddress(controllerrecord.address());
        shiftRecord.setBrand(controllerrecord.brand());
        shiftRecord.setModel(controllerrecord.model());
        shiftRecord.setBody(controllerrecord.body());
        shiftRecord.setColor(controllerrecord.color());
        shiftRecord.setTailNumber(controllerrecord.tailNumber());
        shiftRecord.setDescription(controllerrecord.description());
        return shiftRecord;
    }

    public static DBShiftDTO mapControllerRecordtoDBShiftRecord(
            ControllerRecordDTO controllerrecord) {
        return new DBShiftDTO(
                controllerrecord.firstName(),
                controllerrecord.lastName(),
                controllerrecord.patronymic(),
                controllerrecord.phoneNumber(),
                controllerrecord.address(),
                controllerrecord.brand(),
                controllerrecord.model(),
                controllerrecord.body(),
                controllerrecord.color(),
                controllerrecord.tailNumber(),
                controllerrecord.description()
        );
    }

    public static ControllerRecordDTO mapShiftRecordtoControllerRecordDTO(
            ShiftRecord shiftRecord) {
        return new ControllerRecordDTO(
                shiftRecord.getFirstName(),
                shiftRecord.getLastName(),
                shiftRecord.getPatronymic(),
                shiftRecord.getPhoneNumber(),
                shiftRecord.getAddress(),
                shiftRecord.getBrand(),
                shiftRecord.getModel(),
                shiftRecord.getBody(),
                shiftRecord.getColor(),
                shiftRecord.getTailNumber(),
                shiftRecord.getDescription()
        );
    }

}
