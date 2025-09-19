package com.igor.mdm.service;

import com.igor.mdm.dto.ChangePhoneDto;

public interface MessageProcessingService {

    void process(ChangePhoneDto dto);
}
