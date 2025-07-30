package com.shoes.webshoes.dao;

import com.shoes.webshoes.common.utils.Pagination;
import com.shoes.webshoes.entity.Size;
import com.shoes.webshoes.model.StoreProcedureListResult;

import java.util.List;

public interface SizeDao {
    void create(Size size);

    Size findOne(int id);

    void update(Size size);

    List<Size> getAll();

    StoreProcedureListResult<Size> spGListSize(String keySearch,int status,Pagination pagination) throws Exception;

    Size findByName(String name);

    List<Size> findByIds(List<Integer> ids);
}