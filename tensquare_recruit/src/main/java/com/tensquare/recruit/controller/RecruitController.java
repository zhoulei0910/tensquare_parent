package com.tensquare.recruit.controller;

import com.tensquare.recruit.pojo.Recruit;
import com.tensquare.recruit.service.RecruitService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enterprise")
@CrossOrigin
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    //查询热门企业列表
    @RequestMapping(value = "/search/hotlist",method = RequestMethod.GET)
    public Result findHotList(){
        return new Result(true, StatusCode.OK,"查询成功",recruitService.findHotList());
    }

    //查询推荐职位列表
    @RequestMapping(value = "/search/recommend",method = RequestMethod.GET)
    public Result findTop4ByStateOrderByCreatetimeDesc(){
        String state = "2";
        List<Recruit> recruitList = recruitService.findTop4ByStateOrderByCreatetimeDesc(state);
        return new Result(true,StatusCode.OK,"查询成功",recruitList);
    }

    //查询最新职位列表
    @RequestMapping(value = "/search/newlist",method = RequestMethod.GET)
    public Result findTop12ByStateNotOrderByCreatetimeDesc(){
        List<Recruit> recruitList = recruitService.findTop12ByStateNotOrderByCreatetimeDesc();
        return new Result(true,StatusCode.OK,"查询成功",recruitList);
    }
}
