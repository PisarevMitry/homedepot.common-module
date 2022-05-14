package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

public interface ParentSearchForNotDefaultDto<T> {
    List<Dto> findTreeIterationByParentId(T type, Long id);

    List<Dto> findTreePathByParentId(T type, Long id);
}
