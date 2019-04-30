package com.tensquare.qa.controller;

import com.tensquare.qa.service.ProblemService;
import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/problem")
@CrossOrigin
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    //最新回答列表
    @RequestMapping(value = "/newlist/{labelId}/{page}/{size}",method = RequestMethod.GET)
    public Result findNewListByLabelId(@PathVariable String labelId, @PathVariable int page, @PathVariable int size){
        PageResult pageResult = problemService.findNewListByLabelId(labelId, page, size);
        return new Result(true, StatusCode.OK,"查询成功",pageResult);
    }

    @RequestMapping(value = "/hotlist/{labelId}/{page}/{size}",method = RequestMethod.GET)
    public Result findHostListByLabelId(@PathVariable String labelId,@PathVariable int page,@PathVariable int size){
        PageResult pageResult = problemService.findHostListByLabelId(labelId,page,size);
        return new Result(true, StatusCode.OK,"查询成功",pageResult);
    }

    @RequestMapping(value = "/waitlist/{labelId}/{page}/{size}",method = RequestMethod.GET)
    public Result findWaitListByLabelId(@PathVariable String labelId,@PathVariable int page,@PathVariable int size){
        PageResult pageResult = problemService.findWaitListByLabelId(labelId,page,size);
        return new Result(true, StatusCode.OK,"查询成功",pageResult);
    }
}
