package com.msf.movement.middleend.client;

import com.msf.movement.middleend.domain.Movement;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "movement-service")
public interface MovementServiceClient {

    @PostMapping("/api/v1/movements")
    ResponseEntity<Movement> createCustomer(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                            @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                            @RequestBody Movement customer);
}