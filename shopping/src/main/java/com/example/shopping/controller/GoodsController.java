package com.example.shopping.controller;

import com.example.shopping.R.AjaxResult;
import com.example.shopping.dao.GoodsMapper;
import com.example.shopping.model.Goods;
import com.example.shopping.serivce.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping("/addGoods")
    public AjaxResult addGoods(@RequestBody Goods goods){return goodsService.addGoods(goods);}
    @PostMapping("/deleteGoodsById/{id}")
    public AjaxResult deleteGoodsById(@PathVariable("id") Integer id){return goodsService.deleteGoodsById(id);}
    @PostMapping("/changeGoods")
    public AjaxResult changeGoods(@RequestBody Goods goods){return goodsService.changeGoods(goods);}

    @PostMapping("/getGoodsById/{id}")
    public AjaxResult getGoodsById(@PathVariable("id") Integer id){return goodsService.getGoodsById(id);}
    @PostMapping("/getGoodsByGoodsName/{goodsname}")
    public AjaxResult getGoodsByGoodsName(@PathVariable("goodsname") String goodsname){return goodsService.getGoodsByGoodsName(goodsname);}
    @PostMapping("/getGoodsAll")
    public ArrayList<Goods> getGoodsAll(){return goodsService.getGoodsAll();}
}
