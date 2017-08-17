package com.winsion.controller;

import com.winsion.common.Message;
import com.winsion.service.AreasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:58
 **/
@RestController
@RequestMapping(value = "/common")
@Api(value = "/common", description = "公共模块管理")
public class CommonController {

    @Autowired
    AreasService areasService;
    /**
     * 获取所有区域列表
     */
    @ApiOperation("获取所有区域列表")
    @RequestMapping(value = "findAllAreas", method = RequestMethod.POST)
    public Message findAllAreas() {
        return areasService.findAll();
    }

}
