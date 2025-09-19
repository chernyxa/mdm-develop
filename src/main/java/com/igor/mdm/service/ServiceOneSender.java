package com.igor.mdm.service;

import com.igor.mdm.dto.ChangePhoneDto;
import com.igor.mdm.dto.ServiceOneUpdatePhoneRequestDto;
import com.igor.mdm.dto.ServiceUpdatePhoneResponseDto;
import org.springframework.http.ResponseEntity;

public interface ServiceOneSender {

    ResponseEntity<ServiceUpdatePhoneResponseDto> send(ServiceOneUpdatePhoneRequestDto dto);
    ServiceOneUpdatePhoneRequestDto createServiceOneRequest(ChangePhoneDto dto);
}
