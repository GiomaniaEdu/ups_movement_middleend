package com.msf.movement.middleend.service;

import com.msf.movement.middleend.domain.Movement;

public interface IMovementService {

    Movement createCustomer(String xCmClientRequestId, String xCmClientUserAgent, Movement customer);
}
