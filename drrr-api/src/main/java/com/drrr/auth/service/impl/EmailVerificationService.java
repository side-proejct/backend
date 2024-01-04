package com.drrr.auth.service.impl;

import com.drrr.auth.payload.request.EmailVerificationRequest;
import com.drrr.auth.payload.request.VerificationRequest;
import com.drrr.domain.email.service.VerificationService;
import com.drrr.domain.email.service.VerificationService.VerificationDto;
import com.drrr.infra.notifications.kafka.email.EmailProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailVerificationService {
    private final VerificationService verificationService;

    public VerificationDto execute(final EmailVerificationRequest request){
        return verificationService.verifyCode(request.providerId(),
                request.verificationCode());
    }
}
