package com.halid.mservice.citlist.service.impl;

import com.halid.mservice.citlist.repository.CitizenRepository;
import com.halid.mservice.citlist.service.CitizenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultCitizenService implements CitizenService {

    private final CitizenRepository citizenRepository;

    @Override
    public long getCitizenCount() {
        return citizenRepository.count();
    }
}
