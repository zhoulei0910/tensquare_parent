package com.tensquare.qa.dao;

import com.tensquare.qa.pojo.Problem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProblemMapper {

    List<Problem> findNewListByLabelId(Map<String, Object> m);

    long findTotals(@Param("labelId") String labelId);

    List<Problem> findHostListByLabelId(Map<String, Object> m);

    long findHostListTotals(@Param("labelId")String labelId);

    List<Problem> findWaitListByLabelId(Map<String, Object> m);

    long findWaitListTotals(@Param("labelId")String labelId);
}
