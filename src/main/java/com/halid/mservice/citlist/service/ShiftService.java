package com.halid.mservice.citlist.service;

import com.halid.mservice.citlist.controller.controller_dto.ControllerRecordDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.sql.Timestamp;

public interface ShiftService {

    public long getRecordCount();

    public boolean getOpenedShift();

    public void createNewRecord(ControllerRecordDTO controllerRecordDTO);

    public Page<ControllerRecordDTO> findAllRecords(
            int pageNumber, int pageSize, String sortBy, Sort.Direction sortDirection);

    public void setShiftStatusInOpen(Timestamp timestamp);
}
