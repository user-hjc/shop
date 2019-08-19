package com.jk.service;

import com.jk.model.Comment;
import com.jk.model.Shop;
import com.jk.model.ShopLabel;
import com.jk.model.ShopType;

import java.util.List;
import java.util.Map;

public interface ShopService {
    List<Shop> queryAllShop();

    Integer queryCommodityGetTotal(Map<String, Object> map);

    List<Shop> queryCommodity(Map<String, Object> map);

    String deletebyid( String[] ids);

    List<ShopType> querytypeid();

    List<ShopLabel> queryquality();

    void addShop(Shop shop);

    void updateShop(Shop shop);

    String updatebyids(String[] ids);

    Integer queryRecycleGetTotal(Map<String, Object> map);

    List<Shop> queryRecycle(Map<String, Object> map);

    void updatebyidz(Integer id);

    Integer queryCommodityTypeGetTotal(Map<String, Object> map);

    List<ShopType> queryCommodityType(Map<String, Object> map);

    void addShopType(ShopType shopType);

    void updateShopType(ShopType shopType);

    String deletebyidShoptype(String[] ids);

    Integer queryShoplabelGetTotal(Map<String, Object> map);

    List<ShopLabel> queryShoplabel(Map<String, Object> map);

    void addLabel(ShopLabel sho);

    Integer querycommshow123Gettotal(Map<String, Object> map);

    List<Comment> querycommshow123(Map<String, Object> map);

    String deletebyidcom(String[] ids);

    List<Comment> querycommshow2(Map<String, Object> map);

    Integer querycommshow2Gettotal(Map<String, Object> map);
}
