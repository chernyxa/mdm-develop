package com.igor.mdm.client;

import com.igor.mdm.dto.ServiceOneUpdatePhoneRequestDto;
import com.igor.mdm.dto.ServiceUpdatePhoneResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${mdm.integration.service1-host}/user-data-service-one/update-phone", name = "service-one-client")
public interface ServiceOneClient {

    @PostMapping
    ResponseEntity<ServiceUpdatePhoneResponseDto> send(ServiceOneUpdatePhoneRequestDto dto);
}
