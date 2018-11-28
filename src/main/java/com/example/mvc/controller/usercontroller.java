package com.example.mvc.controller;

import com.example.mvc.pojo.user;
import com.example.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class usercontroller {
    @Autowired
    private UserService userservice;

    @GetMapping("find")
    public ModelAndView findid(int id){

      user u = userservice.findbyid(id);
      ModelAndView m =new ModelAndView();
      m.addObject("user",u);
      m.setViewName("user");
      return m;


    }

    @RequestMapping("add")
    public void add(HttpServletRequest request, HttpServletResponse response){
        user u = new user(5,"王五",25);
        int i =userservice.add(u);
       // response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        if (i==1){
            try {
                response.getWriter().print("添加成功");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            try {
                response.getWriter().print("添加失败");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
