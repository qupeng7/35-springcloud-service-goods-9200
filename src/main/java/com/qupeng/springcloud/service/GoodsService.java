package com.qupeng.springcloud.service;

import com.qupeng.springcloud.model.Goods;

import java.util.List;

public interface GoodsService {

    public List<Goods> getAllGoods();

    public Goods getGoodsById(Integer goodsId);
}