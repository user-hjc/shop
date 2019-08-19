package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.ShopMapper;
import com.jk.model.Comment;
import com.jk.model.Shop;
import com.jk.model.ShopLabel;
import com.jk.model.ShopType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements  ShopService{

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> queryAllShop() {
        return shopMapper.queryAllShop();
    }

    @Override
    public Integer queryCommodityGetTotal(Map<String, Object> map) {
        return shopMapper.queryCommodityGetTotal(map);
    }

    @Override
    public List<Shop> queryCommodity(Map<String, Object> map) {
        return shopMapper.queryCommodity(map);
    }

    @Override
    public String deletebyid(String[] ids) {
        return shopMapper.deletebyid(ids);
    }

    @Override
    public List<ShopType> querytypeid() {

        return shopMapper.querytypeid();
    }

    @Override
    public List<ShopLabel> queryquality() {
        return shopMapper.queryquality();
    }

    @Override
    public void addShop(Shop shop) {

        shopMapper.addShop(shop);
    }

    @Override
    public void updateShop(Shop shop) {
        shopMapper.updateShop(shop);
    }

    @Override
    public String updatebyids(String[] ids) {
        return shopMapper.updatebyids(ids);
    }

    @Override
    public Integer queryRecycleGetTotal(Map<String, Object> map) {
        return shopMapper.queryRecycleGetTotal(map);
    }

    @Override
    public List<Shop> queryRecycle(Map<String, Object> map) {
        return shopMapper.queryRecycle(map);
    }

    @Override
    public void updatebyidz(Integer id) {

        shopMapper.updatebyidz(id);
    }

    @Override
    public Integer queryCommodityTypeGetTotal(Map<String, Object> map) {
        return shopMapper.queryCommodityTypeGetTotal(map);
    }

    @Override
    public List<ShopType> queryCommodityType(Map<String, Object> map) {
        return shopMapper.queryCommodityType(map);
    }

    @Override
    public void addShopType(ShopType shopType) {

        shopMapper.addShopType(shopType);




    }

    @Override
    public void updateShopType(ShopType shopType) {
        shopMapper.updateShopType(shopType);
    }

    @Override
    public String deletebyidShoptype(String[] ids) {

        return shopMapper.deletebyidShoptype(ids);
    }

    @Override
    public Integer queryShoplabelGetTotal(Map<String, Object> map) {
        return shopMapper.queryShoplabelGetTotal(map);
    }

    @Override
    public List<ShopLabel> queryShoplabel(Map<String, Object> map) {
        return shopMapper.queryShoplabel(map);
    }

    @Override
    public void addLabel(ShopLabel sho) {
        shopMapper.addLabel(sho);
    }

    @Override
    public Integer querycommshow123Gettotal(Map<String, Object> map) {
        return shopMapper.querycommshow123Gettotal(map);
    }

    @Override
    public List<Comment> querycommshow123(Map<String, Object> map) {
        return shopMapper.querycommshow123(map);
    }

    @Override
    public String deletebyidcom(String[] ids) {
        return shopMapper.deletebyidcom(ids);
    }

    @Override
    public List<Comment> querycommshow2(Map<String, Object> map) {
        return shopMapper.querycommshow2(map);
    }

    @Override
    public Integer querycommshow2Gettotal(Map<String, Object> map) {
        return shopMapper.querycommshow2Gettotal(map);
    }


}
