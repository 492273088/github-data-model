package com.winsion.service.impl;

import com.winsion.common.Message;
import com.winsion.common.RequestCode;
import com.winsion.entity.Areas;
import com.winsion.repository.AreasRepository;
import com.winsion.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/16:58
 **/
@Service
public class AreasServiceImpl implements AreasService{

    @Autowired
    AreasRepository areasRepository;
    @Override
    public Message findAll() {
        List<Areas> list = areasRepository.findAll();
        return Message.create(RequestCode.SUCCESS,"",list);
    }
}
