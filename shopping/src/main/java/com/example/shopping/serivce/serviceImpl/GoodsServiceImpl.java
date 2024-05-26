package com.example.shopping.serivce.serviceImpl;

import com.example.shopping.R.AjaxResult;
import com.example.shopping.R.Status;
import com.example.shopping.dao.GoodsMapper;
import com.example.shopping.model.Goods;
import com.example.shopping.serivce.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.ArrayList;
import java.util.Objects;

@ControllerAdvice(basePackages = "com.example.shopping.controller")
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public AjaxResult addGoods(Goods goods) {
        if(goodsMapper.countByGoodsName(goods.getGoodsname())>0){
            AjaxResult<Goods> ajaxResult=new AjaxResult(goods, Status.ADDREX.getCode(), Status.ADDREX.getMsg());
            return ajaxResult;
        }if(goodsMapper.addGoods(goods)==1){
            AjaxResult ajaxResult=new AjaxResult(goods,Status.ADDSUCCESS.getCode(), Status.ADDSUCCESS.getMsg());
            return ajaxResult;
        }
        return new AjaxResult(null,Status.ADDFAIL.getCode(), Status.ADDFAIL.getMsg());
    }

    @Override
    public AjaxResult deleteGoodsById(Integer id) {
        if(goodsMapper.deleteGoodsById(id)>0){
            return new AjaxResult(1,Status.DELETESUCCESS.getCode(), Status.DELETESUCCESS.getMsg());
        }
        return new AjaxResult(0,Status.DELETEFAIL.getCode(), Status.DELETEFAIL.getMsg());
    }

    @Override
    public AjaxResult changeGoods(Goods goods) {
        if(goodsMapper.changeGoods(goods)>0){
            return new AjaxResult(1,Status.CHANGESUCCESS.getCode(), Status.CHANGESUCCESS.getMsg());
        }
        return new AjaxResult(0,Status.CHANGEFAIL.getCode(), Status.CHANGEFAIL.getMsg());
    }

    @Override
    public AjaxResult getGoodsById(Integer id) {
        Goods goods=goodsMapper.getGoodsById(id);
        if(goods!=null){
            return new AjaxResult(goods,Status.INSERTSUCCESS.getCode(), Status.INSERTSUCCESS.getMsg());
        }
        return new AjaxResult(null,Status.INSERTFAIL.getCode(), Status.INSERTFAIL.getMsg());
    }

    @Override
    public AjaxResult getGoodsByGoodsName(String goodsname) {
        Goods goods=goodsMapper.getGoodsByGoodsName(goodsname);
        if(goods!=null){
            return new AjaxResult(goods,Status.INSERTSUCCESS.getCode(), Status.INSERTSUCCESS.getMsg());
        }
        return new AjaxResult(null,Status.INSERTFAIL.getCode(), Status.INSERTFAIL.getMsg());
    }

   @Override
   public ArrayList<Goods> getGoodsAll() {
        ArrayList<Goods> list=goodsMapper.getGoodsAll();
        if(list!=null){
            return goodsMapper.getGoodsAll();
        }
        return new ArrayList<>();
   }
}
