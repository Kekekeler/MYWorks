package com.example.shopping.serivce;

import com.example.shopping.R.AjaxResult;
import com.example.shopping.model.Goods;

import java.util.ArrayList;
import java.util.Objects;

public interface GoodsService {

    AjaxResult addGoods(Goods goods);
    AjaxResult deleteGoodsById(Integer id);
    AjaxResult changeGoods(Goods goods);

    AjaxResult getGoodsById(Integer id);
    AjaxResult getGoodsByGoodsName(String goodsname);
    ArrayList<Goods> getGoodsAll();

}
