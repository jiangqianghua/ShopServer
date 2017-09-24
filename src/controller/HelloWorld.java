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
      * 1. ʹ��RequestMappingע����ӳ�������URL
      * 2. ����ֵ��ͨ����ͼ����������Ϊʵ�ʵ�������ͼ, ����InternalResourceViewResolver��ͼ���������������½���
      * ͨ��prefix+returnVal+suffix �����ķ�ʽ�õ�ʵ�ʵ�������ͼ��Ȼ���ת������
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
         //�Ѷ������л�Ϊjson����
         //������Ӧ���ͺͱ�������
    	 System.out.println("login 111");
    	 ResponseMsg msg = new ResponseMsg();
    	 msg.setCode("1");
    	 msg.setMsg("ok");
    	 msg.setBody(user);
    	  return msg ;
     
     }
 }