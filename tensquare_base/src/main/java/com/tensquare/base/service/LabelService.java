package com.tensquare.base.service;

import com.tensquare.base.dao.LabelMapper;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.IdWorker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LabelService {

    @Autowired
    private LabelMapper labelMapper;

    @Autowired
    private IdWorker idWorker;

    public List<Label> findAll(){
        return labelMapper.findAll();
    }

    public Label findById(String id) {
        return labelMapper.findById(id);
    }

    public String add(Label label) {
        Long id = idWorker.nextId();
        label.setId(id.toString());
        labelMapper.add(label);
        return id.toString();
    }

    public void update(String id, Label label) {
        labelMapper.update(label);
    }

    public void deleteById(String id) {
        labelMapper.deleteById(id);
    }

    public List<Label> findSearch(int page, int size) {
        Map<String,Integer> m = new HashMap<>();
        m.put("pageIndex",(page-1)*size);
        m.put("size",size);
        return labelMapper.findSearch(m);
    }
}
