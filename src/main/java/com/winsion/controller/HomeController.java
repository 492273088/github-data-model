package com.winsion.controller;

import com.winsion.entity.Carparking;
import com.winsion.service.CarparkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by XiaoLei Guo on 2017/6/23.
 */
@RestController
@RequestMapping("/home")
public class HomeController{

    @Autowired
    CarparkService carparkService;

    @RequestMapping("/index")
    public String index(ModelAndView modelAndView,
                        HttpServletRequest request,
                        HttpServletResponse response){
        List<Carparking> list = carparkService.findAll();
        return list.toString();
    }

}
