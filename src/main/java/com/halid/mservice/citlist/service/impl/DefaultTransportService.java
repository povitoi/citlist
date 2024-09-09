package com.halid.mservice.citlist.service.impl;

import com.halid.mservice.citlist.repository.TransportRepository;
import com.halid.mservice.citlist.service.TransportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultTransportService implements TransportService {

    private final TransportRepository transportRepository;

    @Override
    public long getTransportCount() {
        return transportRepository.count();
    }
}
