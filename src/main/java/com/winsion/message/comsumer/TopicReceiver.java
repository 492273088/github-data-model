package com.winsion.message.comsumer;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/4/13:54
 **/
@Component
public class TopicReceiver implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("TopicReceiver:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
