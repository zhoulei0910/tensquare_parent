package com.tensquare.recruit.dao;

import com.tensquare.recruit.pojo.Enterprise;
import com.tensquare.recruit.pojo.Recruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecruitMapper {

    List<Enterprise> findHotList();

    List<Recruit> findTop4ByStateOrderByCreatetimeDesc(@Param("state") String state);

    List<Recruit> findTop12ByStateNotOrderByCreatetimeDesc();
}
