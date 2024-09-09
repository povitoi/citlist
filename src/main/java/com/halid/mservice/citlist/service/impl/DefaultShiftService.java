package com.halid.mservice.citlist.service.impl;

import com.halid.mservice.citlist.controller.controller_dto.ControllerRecordDTO;
import com.halid.mservice.citlist.entity.ShiftRecord;
import com.halid.mservice.citlist.repository.ShiftRepository;
import com.halid.mservice.citlist.service.ShiftService;
import com.halid.mservice.citlist.utils.MappingObjects;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultShiftService implements ShiftService {

    private final ShiftRepository shiftRepository;

    @Override
    public long getRecordCount() {
        return shiftRepository.count();
    }

    @Override
    public boolean getOpenedShift() {
        return shiftRepository.findOpenedShift();
    }

    @Override
    public void createNewRecord(ControllerRecordDTO controllerRecordDTO) {
        ShiftRecord shiftRecord = MappingObjects
                .mapControllerRecordtoShiftRecord(controllerRecordDTO);
        shiftRepository.save(shiftRecord);
    }

    @Override
    public Page<ControllerRecordDTO> findAllRecords(
            int pageNumber, int pageSize, String sortBy, Sort.Direction sortDirection) {
        List<ControllerRecordDTO> recordDTO = shiftRepository
                .findAllRecords(PageRequest.of(pageNumber, pageSize, Sort.by(sortDirection, sortBy)))
                .stream()
                .map(MappingObjects::mapShiftRecordtoControllerRecordDTO)
                .toList();

        return new PageImpl<>(recordDTO);
    }

    @Override
    public void setShiftStatusInOpen(Timestamp timestamp) {
        shiftRepository.setShiftStatusInOpen(timestamp);
    }
}
