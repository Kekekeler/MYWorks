package com.example.shopping.dao;

import com.example.shopping.model.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Objects;

@Mapper
@Repository
public interface GoodsMapper {
    int addGoods(Goods goods);
    int deleteGoodsById(int id);
    int changeGoods(Goods goods);

    int countByGoodsName(String name);

    Goods getGoodsById(int id);
    Goods getGoodsByGoodsName(String goodsname);
    ArrayList<Goods> getGoodsAll();
}
