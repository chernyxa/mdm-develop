package com.igor.mdm.service;

import com.igor.mdm.dto.ChangePhoneDto;
import com.igor.mdm.dto.ServiceTwoUpdatePhoneRequestDto;
import com.igor.mdm.dto.ServiceUpdatePhoneResponseDto;
import org.springframework.http.ResponseEntity;

public interface ServiceTwoSender {

    ResponseEntity<ServiceUpdatePhoneResponseDto> send(ServiceTwoUpdatePhoneRequestDto dto);
    ServiceTwoUpdatePhoneRequestDto createServiceTwoRequest(ChangePhoneDto dto);
}
