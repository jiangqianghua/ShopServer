package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.relingcun.json.ResponseMsg;

import vo.User;
 
 @Controller
 public class HelloWorld {
 
     /**
      * 1. 使用RequestMapping注解来映射请求的URL
      * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
      * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
      * "/WEB-INF/views/success.jsp"
      * @return
      */
     @RequestMapping("/helloworld")
     public String hello(){
         System.out.println("hello world33");
         return "success";
     }
     
     @RequestMapping("/showImage")
     public String showImage(){
    	 System.out.println("hello world");
         return "image1";
     }
     //http://127.0.0.1:8080/Shop/login?firstName=jiang&lastName=hua
     @RequestMapping("/login") 
     @ResponseBody
     public Object login(User user)
     {
//    	 System.out.println(user.getFirstName() + ":" + user.getLastName());
//    	 return "success";
         //把对象序列化为json类型
         //设置响应类型和编码类型
    	 System.out.println("login 111");
    	 ResponseMsg msg = new ResponseMsg();
    	 msg.setCode("1");
    	 msg.setMsg("ok");
    	 msg.setBody(user);
    	  return msg ;
     
     }
 }