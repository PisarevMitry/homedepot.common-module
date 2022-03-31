package com.mirea.homedepot.commonmodule.dto;

import java.time.LocalDate;

public class OrderDetails {

    private Long id;
    private Long deliveryDetailsId;
    private Long paymentDetailsId;
    private Long orderId;
    private Long clientId;
    private LocalDate createDttm;
    private Long specialConditionId;
}
