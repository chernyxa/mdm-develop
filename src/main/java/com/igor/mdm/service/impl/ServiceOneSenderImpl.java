package com.igor.mdm.service.impl;

import com.igor.mdm.client.service.ServiceOneClientService;
import com.igor.mdm.dto.ChangePhoneDto;
import com.igor.mdm.dto.ServiceOneUpdatePhoneRequestDto;
import com.igor.mdm.dto.ServiceUpdatePhoneResponseDto;
import com.igor.mdm.service.ServiceOneSender;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ServiceOneSenderImpl implements ServiceOneSender {

    private final ServiceOneClientService serviceOneClient;

    @Override
    @SneakyThrows
    public ResponseEntity<ServiceUpdatePhoneResponseDto> send(ServiceOneUpdatePhoneRequestDto dto) {
        return serviceOneClient.send(dto).get();
    }

    @Override
    public ServiceOneUpdatePhoneRequestDto createServiceOneRequest(ChangePhoneDto dto) {
        return ServiceOneUpdatePhoneRequestDto.builder()
                .meta(ServiceOneUpdatePhoneRequestDto.Meta.builder()
                        .systemId("@danyazaikin")
                        .sender("@danyazaikin")
                        .build())
                .body(ServiceOneUpdatePhoneRequestDto.Body.builder()
                        .id(dto.id())
                        .guid(dto.guid())
                        .phone(dto.phone())
                        .build())
                .build();
    }
}
