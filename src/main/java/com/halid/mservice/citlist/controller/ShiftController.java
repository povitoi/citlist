package com.halid.mservice.citlist.controller;

import com.halid.mservice.citlist.controller.controller_dto.ControllerRecordDTO;
import com.halid.mservice.citlist.service.CitizenService;
import com.halid.mservice.citlist.service.ShiftService;
import com.halid.mservice.citlist.service.TransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
@RequiredArgsConstructor
@RequestMapping("shifts")
public class ShiftController {

    private final CitizenService citizenService;
    private final TransportService transportService;
    private final ShiftService shiftService;

    @GetMapping("new_shift")
    @Transactional
    public String newShift(
            Model model,
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "ASC")Sort.Direction sortDirection) {

        if (!shiftService.getOpenedShift()) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            shiftService.setShiftStatusInOpen(timestamp);
        }

        model.addAttribute("records",
                shiftService.findAllRecords(pageNumber, pageSize, sortBy, sortDirection));
        return "shifts/new_shift";
    }

    @GetMapping("close_shift")
    public String closeShift(Model model) {
        model.addAttribute("recordCount", shiftService.getRecordCount());
        model.addAttribute("citizenCount", citizenService.getCitizenCount());
        model.addAttribute("transportCount", transportService.getTransportCount());
        return "shifts/close_shift";
    }

    @GetMapping("new_record")
    public String getNewRecordPage() {
        return "shifts/new_record";
    }

    @PostMapping("new_record")
    public String createNewRecord(ControllerRecordDTO recordDTO, Model model) {
        shiftService.createNewRecord(recordDTO);
        return "redirect:/shifts/new_shift";
    }

}
