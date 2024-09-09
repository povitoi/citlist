package com.halid.mservice.citlist.controller;

import com.halid.mservice.citlist.service.CitizenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("citlist/citizens")
public class CitizensController {

    private final CitizenService citizenService;

//    @GetMapping("list")
//    public String getCitizensList(
//            Model model,
//            @RequestParam(defaultValue = "0") int pageNumber,
//            @RequestParam(defaultValue = "10") int pageSize,
//            @RequestParam(defaultValue = "ASC") Sort.Direction sortDirection,
//            @RequestParam(defaultValue = "id") String sortBy,
//            @RequestParam(name = "filter", required = false) String filter) {
//
//        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortDirection, sortBy));
//
//        model.addAttribute("citizens",
//                citizenService.findAllCitizens(pageable, filter));
//        model.addAttribute("filter", filter);
//
//        return "index";
//    }

}
