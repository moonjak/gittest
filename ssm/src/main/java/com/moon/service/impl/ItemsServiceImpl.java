package com.moon.service.impl;


import com.moon.mapper.ItemsMapper;
import com.moon.pojo.Items;
import com.moon.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
       return itemsMapper.deleteByPrimaryKey(id);

    }

    @Override
    public int insert(Items record) {
        return 0;
    }

    @Override
    public int insertSelective(Items record) {
        return 0;
    }

    @Override
    public Items selectByPrimaryKey(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Items record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Items record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Items record) {
        return 0;
    }
}