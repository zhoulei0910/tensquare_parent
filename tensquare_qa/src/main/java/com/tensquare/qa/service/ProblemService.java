package com.tensquare.qa.service;

import com.tensquare.qa.dao.ProblemMapper;
import com.tensquare.qa.pojo.Problem;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProblemService {

    @Autowired
    private ProblemMapper problemMapper;

    public PageResult findNewListByLabelId(String labelId, int page, int size) {
        Map<String,Object> m = new HashMap<>();
        m.put("labelId",labelId);
        m.put("page",(page-1)*size);
        m.put("size",size);
        List<Problem> problems = problemMapper.findNewListByLabelId(m);
        long totals = problemMapper.findTotals(labelId);
        PageResult pageResult = new PageResult();
        pageResult.setRows(problems);
        pageResult.setTotals(totals);
        return pageResult;
    }

    public PageResult findHostListByLabelId(String labelId, int page, int size) {
        Map<String,Object> m = new HashMap<>();
        m.put("labelId",labelId);
        m.put("page",(page-1)*size);
        m.put("size",size);
        List<Problem> problems = problemMapper.findHostListByLabelId(m);
        long totals = problemMapper.findHostListTotals(labelId);
        PageResult pageResult = new PageResult();
        pageResult.setRows(problems);
        pageResult.setTotals(totals);
        return pageResult;
    }

    public PageResult findWaitListByLabelId(String labelId, int page, int size) {
        Map<String,Object> m = new HashMap<>();
        m.put("labelId",labelId);
        m.put("page",(page-1)*size);
        m.put("size",size);
        List<Problem> problems = problemMapper.findWaitListByLabelId(m);
        long totals = problemMapper.findWaitListTotals(labelId);
        PageResult pageResult = new PageResult();
        pageResult.setRows(problems);
        pageResult.setTotals(totals);
        return pageResult;
    }
}
