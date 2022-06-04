package com.mirea.homedepot.commonmodule.services;

import com.mirea.homedepot.commonmodule.dto.Dto;

import java.util.List;

/**
 * Интерфейс с базовами методами работы с сущностями базовых типов.
 */
public interface CrudServiceForDefaultDto {

    /**
     * Метод получения всех сущностей.
     *
     * @return сущность базового типа
     */
    List<Dto> findAll();

    /**
     * Метод получения сущности по идентификатору.
     *
     * @param id идентификатор сущности
     * @return сущность базового типа
     */
    Dto findById(Long id);

    /**
     * Метод получения списка сущностей по списку идентификаторов.
     *
     * @param listId список идентификаторов сущностей
     * @return список сущностей базового типа
     */
    List<Dto> findByListId(List<Long> listId);

    /**
     * Метод сохранения сущности.
     *
     * @param d сущность
     */
    void insert(Dto d);

    /**
     * Метод сохранения списка сущностей.
     *
     * @param dList список сущностей
     */
    void insertList(List<Dto> dList);

    /**
     * Метод обновления существующей сущности.
     *
     * @param d сущность
     */
    void update(Dto d);

    /**
     * Метод удаления сущности.
     *
     * @param id идентификатор сущности
     */
    void deleteById(Long id);
}
