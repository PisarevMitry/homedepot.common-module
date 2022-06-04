package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

/**
 * Интерфейс с методами работы с древовидными сущностями базовых типов.
 */
public interface ParentSearchForDefaultDto {

    /**
     * Метод поиска всех дочерних сущностей первого уровня.
     *
     * @param id идентификатор родительской сущности
     * @return список сущностей базового типа
     */
    List<Dto> findTreeIterationByParentId(Long id);

    /**
     * Метод поиска всех родительских сущностей.
     *
     * @param id идентификатор родительской сущности
     * @return список сущностей базового типа
     */
    List<Dto> findTreePathByParentId(Long id);
}
