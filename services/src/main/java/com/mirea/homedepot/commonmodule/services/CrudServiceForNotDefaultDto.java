package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

/**
 * Интерфейс с базовами методами работы с сущностями, отличными от базовых типов.
 *
 * @param <T> тип сущности
 */
public interface CrudServiceForNotDefaultDto<T> {

    /**
     * Метод получения всех сущностей.
     *
     * @param type тип сущности, которую необходимо вернуть
     * @return сущность заданного типа
     */
    List<Dto> findAll(T type);

    /**
     * Метод получения сущности по идентификатору.
     *
     * @param type тип сущности, которую необходимо вернуть
     * @param id   идентификатор сущности
     * @return сущность заданного типа
     */
    Dto findById(T type, Long id);

    /**
     * Метод получения списка сущностей по списку идентификаторов.
     *
     * @param type   тип сущности, которую необходимо вернуть
     * @param listId список идентификаторов сущностей
     * @return список сущностей заданного типа
     */
    List<Dto> findByListId(T type, List<Long> listId);
}