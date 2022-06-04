package com.mirea.homedepot.commonmodule.repositories;

import com.mirea.homedepot.commonmodule.model.Entity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Интерфейс опряделяющий итеративные методы для работы с записями в БД.
 */
public interface ParentSearchRepository extends IterativeRepository {

    /**
     * Метод поиска дочерних элементов записи.
     *
     * @param id идентификатор родительской записи
     * @return список объектов класса Entity
     */
    List<Entity> findTreeIterationByParentId(
            @Param("id")
            Long id);

    /**
     * Метод поиска набора связаных элементов.
     *
     * @param id идентификатор родительской записи
     * @return список объектов класса Entity
     */
    List<Entity> findTreePathByParentId(
            @Param("id")
            Long id);

}
