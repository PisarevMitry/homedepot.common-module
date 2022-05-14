package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

public interface ParentSearchForDefaultDto {
    List<Dto> findTreeIterationByParentId(Long id);

    List<Dto> findTreePathByParentId(Long id);
}
