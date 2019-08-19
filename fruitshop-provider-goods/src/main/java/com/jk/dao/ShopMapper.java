package com.jk.dao;

import com.jk.model.Comment;
import com.jk.model.Shop;
import com.jk.model.ShopLabel;
import com.jk.model.ShopType;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ShopMapper {
    List<Shop> queryAllShop();

    Integer queryCommodityGetTotal(Map<String, Object> map);

    List<Shop> queryCommodity(Map<String, Object> map);

    String deletebyid(@Param("ids") String[] ids);

    List<ShopType> querytypeid();

    List<ShopLabel> queryquality();

    void addShop(Shop shop);

    void updateShop(Shop shop);

    String updatebyids(@Param("ids") String[] ids);

    Integer queryRecycleGetTotal(Map<String, Object> map);

    List<Shop> queryRecycle(Map<String, Object> map);

    void updatebyidz(Integer id);

    Integer queryCommodityTypeGetTotal(Map<String, Object> map);

    List<ShopType> queryCommodityType(Map<String, Object> map);

    void addShopType(ShopType shopType);

    void updateShopType(ShopType shopType);

    String deletebyidShoptype(@Param("ids") String[] ids);

    Integer queryShoplabelGetTotal(Map<String, Object> map);

    List<ShopLabel> queryShoplabel(Map<String, Object> map);

    void addLabel(ShopLabel sho);


    Integer querycommshow123Gettotal(Map<String, Object> map);

    List<Comment> querycommshow123(Map<String, Object> map);

    String deletebyidcom(@Param("ids") String[] ids);

    Integer querycommshow2Gettotal(Map<String, Object> map);

    List<Comment> querycommshow2(Map<String, Object> map);
}
