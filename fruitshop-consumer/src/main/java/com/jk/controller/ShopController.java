package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Comment;
import com.jk.model.Shop;
import com.jk.model.ShopLabel;
import com.jk.model.ShopType;
import com.jk.service.ShopService;

import com.jk.util.FileUtil;
import com.jk.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("shop")
public class ShopController {

    @Reference
    private ShopService shopService;

    //测试
    @RequestMapping("queryAllShop")
    public String queryAllShop(Model model){
        List<Shop> list = shopService.queryAllShop();
        model.addAttribute("shop",list);
        for (Shop shop:list) {
            System.out.println(shop);
        }
        return "demo";
    }
    //跳转查询页面
    @RequestMapping("queryshouw")
    public  String  queryshouw(){



        return  "show";
    }



    //商品管理查询
    @RequestMapping("queryCommodity")
    @ResponseBody
    public  Map<String,Object>   queryCommodity(Integer page,Integer rows,String shapi,Integer lx1){
        System.out.println(shapi);
        Map<String,Object>  map=new HashMap();
        map.put("start",(page-1)*rows);
        map.put("end",rows);
        map.put("shapi",StringUtil.formatLike(shapi));
        map.put("xl1",lx1);
       Integer total=shopService.queryCommodityGetTotal(map);
       List<Shop> list=shopService.queryCommodity(map);
        System.out.println(total);
        Map<String,Object>  map1=new HashMap();
         map1.put("total",total);
         map1.put("rows",list);
         return map1;
    }
    //删除
    @RequestMapping("deletebyid")
    @ResponseBody
    public  String   deletebyid(String [] ids){

       String idd=shopService.deletebyid(ids);


       return idd;

    }
    //查询类型
    @RequestMapping("querytypeid")
    @ResponseBody
    public  List<ShopType> querytypeid(){
        List<ShopType>  list=shopService.querytypeid();

        return list;
    }
   //查询产品认证
    @RequestMapping("queryquality")
    @ResponseBody
    public   List<ShopLabel>  queryquality(){

        List<ShopLabel>  list=shopService.queryquality();

        return list;
    }

    //上传下载
    @RequestMapping("uploadNewsImg")
    @ResponseBody
    public String uploadNewsImg(MultipartFile img, HttpServletRequest request){
        String path = FileUtil.upload(img, request);
        return path;
    }
    //新增商品
    @RequestMapping("addShop")
    @ResponseBody
    public  void  addShop(Shop shop){

        if (shop.getId()==null){

            shop.setShopdate(new Date());
            shop.setShopstate(1);
            String ss = UUID.randomUUID().toString();
            shop.setShopmanifest(ss);
            System.out.println(shop+"*******");
            shopService.addShop(shop);
        }else {
            shopService.updateShop(shop);

        }
    }
    //跳转回收
    @RequestMapping("query")
    public  String  query(){

      return "clientShou";
    }
     //商品批量回收
    @RequestMapping("updatebyids")
    @ResponseBody
    public  String  updatebyids(String [] ids){

        String idd=shopService.updatebyids(ids);

        return idd;
    }
    //查询回收
    @RequestMapping("queryRecycle")
    @ResponseBody
    public  Map<String,Object>   queryRecycle(Integer page,Integer rows){

        Map<String,Object>  map=new HashMap();
        map.put("start",(page-1)*rows);
        map.put("end",rows);
        Integer total=shopService.queryRecycleGetTotal(map);
        List<Shop> list=shopService.queryRecycle(map);
        System.out.println(total);
        Map<String,Object>  map1=new HashMap();
        map1.put("total",total);
        map1.put("rows",list);
        return map1;
    }

    //回收修改1
    @RequestMapping("updatebyidz")
    @ResponseBody
    public  void   updatebyidz(Integer id){

        shopService.updatebyidz(id);

    }
    //进入分类

    @RequestMapping("typeShow")
    public  String  typeShow(){


        return   "typeShow";
    }
    //查询分类
    @RequestMapping("queryCommodityType")
    @ResponseBody
    public  Map<String,Object>   queryCommodityType(Integer page,Integer rows){

        Map<String,Object>  map=new HashMap();
        map.put("start",(page-1)*rows);
        map.put("end",rows);
        Integer total=shopService.queryCommodityTypeGetTotal(map);
        List<ShopType> list=shopService.queryCommodityType(map);
        System.out.println(total);
        Map<String,Object>  map1=new HashMap();
        map1.put("total",total);
        map1.put("rows",list);
        return map1;
    }
    //新增分类加修改
    @RequestMapping("addShopType")
    @ResponseBody
    public  void addShopType(ShopType shopType){

        if (shopType.getId()==null){
            shopService.addShopType(shopType);
        }else {
            shopService.updateShopType(shopType);

        }

    }
     //删除分类
    @RequestMapping("deletebyidShoptype")
    @ResponseBody
    public  String   deletebyidShoptype(String [] ids){

        String idd=shopService.deletebyidShoptype(ids);


        return idd;

    }
    //跳转标签
    @RequestMapping("qyerylabel")
    public String  qyerylabelShow(){

        return "labelShow";
    }
    @RequestMapping("queryShoplabel")
    @ResponseBody
    public  Map<String,Object>   queryShoplabel(Integer page,Integer rows){

        Map<String,Object>  map=new HashMap();
        map.put("start",(page-1)*rows);
        map.put("end",rows);
        Integer total=shopService.queryShoplabelGetTotal(map);
        List<ShopLabel> list=shopService.queryShoplabel(map);
        System.out.println(total);
        Map<String,Object>  map1=new HashMap();
        map1.put("total",total);
        map1.put("rows",list);
        return map1;
    }
     //新增标签
    @RequestMapping("addLabel")
    @ResponseBody
    public   void   addLabel(ShopLabel sho){

        shopService.addLabel(sho);
    }
    //跳传评论
    @RequestMapping("querycomm")
    public String  querycomm(){

       return "commentShow";
    }

    //评论管理
   @RequestMapping("querycommshow123")
   @ResponseBody
   public  Map<String,Object>   querycommshow123(Integer page,Integer rows,String commname){

       Map<String,Object>  map=new HashMap();
       map.put("start",(page-1)*rows);
       map.put("end",rows);
       map.put("commname",StringUtil.formatLike(commname));
       Integer total=shopService.querycommshow123Gettotal(map);
       List<Comment> list=shopService.querycommshow123(map);
       System.out.println(total);
       Map<String,Object>  map1=new HashMap();
       map1.put("total",total);
       map1.put("rows",list);
       return map1;
   }
    //删除 评论
   @RequestMapping("deletebyidcom")
   @ResponseBody
   public  String   deletebyidcom(String [] ids) {

       String idd = shopService.deletebyidcom(ids);
       return idd;
     }

    //跳传评论
    @RequestMapping("querycomm2")
    public String  querycomm2(){

        return "comment2Show";
    }

    @RequestMapping("querycommshow2")
    @ResponseBody
    public  Map<String,Object>   querycommshow2(Integer page,Integer rows,String commname){
        System.out.println("11111111111");
        Map<String,Object>  map=new HashMap();
        map.put("start",(page-1)*rows);
        map.put("end",rows);
        map.put("commname",StringUtil.formatLike(commname));
        Integer total=shopService.querycommshow2Gettotal(map);
        List<Comment> list=shopService.querycommshow2(map);
        System.out.println(total);
        Map<String,Object>  map1=new HashMap();
        map1.put("total",total);
        map1.put("rows",list);
        return map1;
    }

}
