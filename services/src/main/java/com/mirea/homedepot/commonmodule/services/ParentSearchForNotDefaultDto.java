package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

/**
 * Интерфейс с методами работы с древовидными сущностями, отличными от базовых типов.
 *
 * @param <T> тип сущности
 */
public interface ParentSearchForNotDefaultDto<T> {

    /**
     * Метод поиска всех дочерних сущностей первого уровня.
     *
     * @param type тип сущности, которую необходимо вернуть
     * @param id   идентификатор родительской сущности
     * @return список сущностей заданного типа
     */
    List<Dto> findTreeIterationByParentId(T type, Long id);

    /**
     * Метод поиска всех родительских сущностей.
     *
     * @param type тип сущности, которую необходимо вернуть
     * @param id   идентификатор родительской сущности
     * @return список сущностей заданного типа
     */
    List<Dto> findTreePathByParentId(T type, Long id);
}
