package com.escuelita.demo.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateOrderRequest {

    @NotNull
    @NotBlank
    private String date;
    @NotNull
    private Long clientId;
    @NotNull
    private Long shippingId;
    @NotNull
    private Long billId;
    @NotNull
    private Long statusOrderId;
    private String Order;
    private String socketId;
}
