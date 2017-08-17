package com.winsion.message.comsumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
public class QueueReceiver1 implements MessageListener {
    Log log = LogFactory.getLog(QueueReceiver1.class);

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("QueueReceiver1:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
