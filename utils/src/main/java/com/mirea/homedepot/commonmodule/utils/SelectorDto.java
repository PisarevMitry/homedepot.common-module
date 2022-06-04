package com.mirea.homedepot.commonmodule.utils;
/*

import com.mirea.homedepot.commonmodule.dto.Dto;
import com.mirea.homedepot.commonmodule.model.Entity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

*/
/**
 * Класс для изменения представления dto и entity.
 *//*

@Component
public class SelectorDto {

    private static SelectorDtoMapper<Entity> mapFromEntityClass;

    private static SelectorDtoMapper<Dto> mapFromDtoClass;

    public SelectorDto(ModelMapper modelMapper) {
        mapFromEntityClass = new SelectorDtoMapper<Entity>(modelMapper);
        mapFromDtoClass = new SelectorDtoMapper<Dto>(modelMapper);
    }

    public static SelectorDtoMapper<Entity> mapFromEntity() {
        return mapFromEntityClass;
    }

    public static SelectorDtoMapper<Dto> mapFromDto() {
        return mapFromDtoClass;
    }

    public static class SelectorDtoMapper<T> {

        private final ModelMapper modelMapper;

        SelectorDtoMapper(ModelMapper modelMapper) {
            this.modelMapper = modelMapper;
        }

        public Dto select(T t, Class<? extends Dto> resultClass) {
            return map(t, resultClass);
        }

        public List<Dto> select(List<T> list,
                                Class<? extends Dto> resultClass) {
            return mapList(list, resultClass);
        }

        private Dto map(T t, Class<? extends Dto> resultClass) {
            return modelMapper.map(t, resultClass);
        }

        private List<Dto> mapList(List<T> list,
                                  Class<? extends Dto> resultClass) {
            return list.stream().map(el -> map(el, resultClass))
                    .collect(Collectors.toList());
        }
    }
}
*/
