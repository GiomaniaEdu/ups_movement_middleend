package com.msf.movement.middleend.service.impl;

import com.msf.movement.middleend.client.MovementServiceClient;
import com.msf.movement.middleend.service.IMovementService;
import com.msf.movement.middleend.domain.Movement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovementServiceImpl implements IMovementService {

    private final MovementServiceClient customerServiceClient;


    @Override
    public Movement createCustomer(String xCmClientRequestId, String xCmClientUserAgent, Movement customer) {
        return customerServiceClient
                .createCustomer(xCmClientRequestId,xCmClientUserAgent,customer).getBody();
    }


}
