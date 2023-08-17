package com.careerit.iplstats.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class MapperUtil {

    private MapperUtil(){}
    public static <T> T convert(Object object, Class<T> cls) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(object, cls);
    }

    public static <T> T convert(Object object, TypeReference<T> cls) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(object, cls);
    }


}
