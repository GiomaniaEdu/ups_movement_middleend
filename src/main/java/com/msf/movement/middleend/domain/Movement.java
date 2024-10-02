package com.msf.movement.middleend.domain;

import lombok.Data;

@Data
public class Movement {

    private Integer id;

    private String typeMovement;

    private Number amount;

    private Integer accountId;

}
