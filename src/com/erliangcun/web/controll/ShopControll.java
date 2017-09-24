package com.erliangcun.web.controll;


import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import vo.FoodVo;
import vo.ShopVo;

import com.erliangcun.log.LogUtil;
import com.erliangcun.service.ShopService;
import com.erliangcun.utils.GeneralUtils;
import com.relingcun.json.ResponseMsg;


@Controller
@RequestMapping("/shop")
public class ShopControll {
	
	@Autowired
	private ShopService shopService ;
	
	
    public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
    /**
     * 添加店铺
     * @param shop
     * @return
     */
	@RequestMapping("/addShop") 
    @ResponseBody
	public Object addShop(ShopVo shop) {
		System.out.println("addShop shop " + shop.getName());
		boolean isSave = shopService.saveShop(shop);
		ResponseMsg respMsg = null ;
		int code = isSave?1:0;
		String msg = isSave?"ok":"save error";
		respMsg = GeneralUtils.getResponseMsg(code, msg, "");
		return respMsg;

	}
	/**
	 * 获取所有店铺
	 * @return
	 */
	@RequestMapping("/allShops") 
    @ResponseBody
	public Object allShops(){
		List<ShopVo> shops = shopService.allShop();
		ResponseMsg respMsg = null ;
		int code = shops != null?1:0;
		String msg = shops != null?"ok":"query error";
		respMsg = GeneralUtils.getResponseMsg(code, msg, shops);
		return respMsg;
	}
	
	
	/**
     * 上传图片
     */
    @ResponseBody
    @RequestMapping(value = "/foodImageUpload",method = RequestMethod.POST)
    public Object photoUpload(MultipartFile file,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IllegalStateException, IOException{
        ResponseMsg resultData=new ResponseMsg();
        /*User user=(User) session.getAttribute("user");
        if (user==null) {
            resultData.setCode(40029);
            resultData.setMsg("鐢ㄦ埛鏈櫥褰�");
            return resultData;
        }*/
        if (file!=null) {
            String path=null;
            String type=null;
            String fileName=file.getOriginalFilename();
            System.out.println("fileName:"+fileName);
            
            type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
            if (type!=null) {
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
                  
                    String realPath=request.getSession().getServletContext().getRealPath("/");
                  
                    String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
                  
                    path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
                    System.out.println("path:"+path);
                    file.transferTo(new File(path));
                }else {
                    System.out.println("不符合格式");
                    return null;
                }
            }else {
                System.out.println("类型错误");
                return null;
            }
        }else {
            System.out.println("文件为null");
            return null;
        }
        return resultData;
    }
    
    /**
     * 添加菜品
     * @param shop
     * @return
     */
	@RequestMapping("/addFood") 
    @ResponseBody
    public Object addFood(FoodVo foodVo)
    {
    	LogUtil.log("add food " + foodVo.getName());
    	boolean isSave = shopService.saveFood(foodVo);
		ResponseMsg respMsg = null ;
		int code = isSave?1:0;
		String msg = isSave?"ok":"save error";
		respMsg = GeneralUtils.getResponseMsg(code, msg, "");
		return respMsg;
    }
	
	/**
	 * 获取所有菜品信息
	 * @param count
	 * @return
	 */
	@RequestMapping("/allFoods") 
    @ResponseBody
	public Object AllFood(int shopId)
	{
		List<FoodVo> foods = shopService.allFood(shopId);
		ResponseMsg respMsg = null ;
		int code = foods != null?1:0;
		String msg = foods != null?"ok":"query error";
		respMsg = GeneralUtils.getResponseMsg(code, msg, foods);
		return respMsg;
	}
	
	@RequestMapping("/deleteFoodById") 
    @ResponseBody
	public Object deleteFoodById(int id)
	{
		boolean result = shopService.deleteFoodById(id);
		ResponseMsg respMsg = null ;
		int code = result?1:0;
		String msg = result?"ok":"query error";
		respMsg = GeneralUtils.getResponseMsg(code, msg, "");
		return respMsg;

	}
	
	
    
	
	

}
