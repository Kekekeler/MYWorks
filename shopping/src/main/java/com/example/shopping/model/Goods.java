package com.example.shopping.model;

public class Goods {

    private Integer id;
    private String goodsname;
    private Double price;
    private String introduce;

    public Goods(Integer id, String goodsname, Double price, String introduce) {
        this.id = id;
        this.goodsname = goodsname;
        this.price = price;
        this.introduce = introduce;
    }

    public Goods(String goodsname, Double price, String introduce) {
        this.goodsname = goodsname;
        this.price = price;
        this.introduce = introduce;
    }

    public Goods() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
