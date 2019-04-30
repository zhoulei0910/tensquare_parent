package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LabelMapper {

    List<Label> findAll();

    Label findById(@Param("id") String id);

    void add(Label label);

    void update(Label label);

    void deleteById(@Param("id") String id);

    List<Label> findSearch(Map m);
}
