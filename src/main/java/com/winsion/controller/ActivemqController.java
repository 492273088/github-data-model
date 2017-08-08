package com.winsion.controller;

import com.winsion.message.producer.QueueSender;
import com.winsion.message.producer.TopicSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/4/14:09
 **/
@Controller
@RequestMapping(value = "/activemq")
public class ActivemqController {

    @Resource
    QueueSender queueSender;
    @Resource
    TopicSender topicSender;

    /**
     * 发送消息到队列
     * Queue队列：仅有一个订阅者会收到消息，消息一旦被处理就不会存在队列中
     * @param message
     * @return String
     */
    @ResponseBody
    @RequestMapping(value = "/queueSender")
    public String queueSender(@RequestParam("message")String message){
        String opt="";
        try {
            queueSender.send("test.queue", message);
            opt = "suc";
        } catch (Exception e) {
            opt = e.getCause().toString();
        }
        return opt;
    }

    /**
     * 发送消息到主题
     * Topic主题 ：放入一个消息，所有订阅者都会收到
     * 这个是主题目的地是一对多的
     * @param message
     * @return String
     */
    @ResponseBody
    @RequestMapping(value = "/topicSender")
    public String topicSender(@RequestParam("message")String message){
        String opt = "";
        try {
            topicSender.send("test.topic", message);
            opt = "suc";
        } catch (Exception e) {
            opt = e.getCause().toString();
        }
        return opt;
    }
}