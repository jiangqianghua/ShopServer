package com.erliangcun.utils;

import com.relingcun.json.ResponseMsg;

import vo.ShopVo;

public class GeneralUtils {
	
	public static ResponseMsg getResponseMsg(int code , String msg , Object obj)
	{
		ResponseMsg respMsg = new ResponseMsg();
		respMsg.setCode(code+"");
		respMsg.setMsg(msg);
		respMsg.setBody(obj);
		return respMsg;
	}

}
