package com.mirea.homedepot.commonmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailablePaymentMethodDto {

    private Long id;
    private String method;
}

