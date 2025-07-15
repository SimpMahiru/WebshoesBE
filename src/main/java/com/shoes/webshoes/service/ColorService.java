package com.shoes.webshoes.service;

import com.shoes.webshoes.common.utils.Pagination;
import com.shoes.webshoes.entity.Color;
import com.shoes.webshoes.model.StoreProcedureListResult;

import java.util.List;

public interface ColorService {
    void create(Color color);

    Color findOne(int id);

    void update(Color color);

    List<Color> getAll();

    StoreProcedureListResult<Color> spGListColor(String keySearch,int status,Pagination pagination) throws Exception;

    Color findByName(String name);

    List<Color> findByIds(List<Integer> ids);
}
