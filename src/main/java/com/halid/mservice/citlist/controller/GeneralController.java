package com.halid.mservice.citlist.controller;

import com.halid.mservice.citlist.service.CitizenService;
import com.halid.mservice.citlist.service.ShiftService;
import com.halid.mservice.citlist.service.TransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class GeneralController {

    private final CitizenService citizenService;
    private final TransportService transportService;
    private final ShiftService shiftService;

    @GetMapping
    public String getStatisticalData(Model model) {

        if (shiftService.getOpenedShift()) {
            String shiftOpened = "Необходимо закрыть смену для выполнения других действий.";
            model.addAttribute("shiftOpenedError", shiftOpened);
            return "shifts/new_shift";
        }

        model.addAttribute("citizenCount", citizenService.getCitizenCount());
        model.addAttribute("transportCount", transportService.getTransportCount());
        return "general/index";
    }



}
