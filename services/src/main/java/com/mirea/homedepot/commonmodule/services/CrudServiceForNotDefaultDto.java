package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

public interface CrudServiceForNotDefaultDto<T> {

    List<Dto> findAll(T type);

    Dto findById(T type, Long id);

    List<Dto> findByListId(T type, List<Long> listId);
}
