package com.mirea.homedepot.commonmodule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mortbay.util.ajax.JSON;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;
    private String title;
    private String description;
    private Integer price;
    private Long photoId;
    private Long videoId;
    private JSON option;
    private Boolean availability;
    private Long categoryId;
    private Long feedbackId;
    private Long specialConditionId;
}
