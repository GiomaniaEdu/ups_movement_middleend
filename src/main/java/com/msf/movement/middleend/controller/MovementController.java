package com.msf.movement.middleend.controller;

import com.msf.movement.middleend.service.IMovementService;
import com.msf.movement.middleend.domain.Movement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movement")
@RequiredArgsConstructor
public class MovementController {

    private final IMovementService iCustomerService;

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Movement> createCustomer(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                                   @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                                   @RequestBody Movement customer){
        return new ResponseEntity<>(iCustomerService.createCustomer(xCmClientRequestId, xCmClientUserAgent,customer), HttpStatus.CREATED);
    }
}
