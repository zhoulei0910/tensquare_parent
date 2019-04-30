package com.tensquare.recruit.service;

import com.tensquare.recruit.dao.RecruitMapper;
import com.tensquare.recruit.pojo.Enterprise;
import com.tensquare.recruit.pojo.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;

    public List<Enterprise> findHotList() {
        return recruitMapper.findHotList();
    }

    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state) {
        return recruitMapper.findTop4ByStateOrderByCreatetimeDesc(state);
    }

    public List<Recruit> findTop12ByStateNotOrderByCreatetimeDesc() {
        return recruitMapper.findTop12ByStateNotOrderByCreatetimeDesc();
    }
}
