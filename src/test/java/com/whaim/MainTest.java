package com.whaim;

import com.whaim.mq.IDispatcher;
import com.whaim.service.IService;
import com.whaim.service.Service_szfs301002;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王海明 on 2017/6/30.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest implements IDispatcher {

    String key="key";

    @Autowired
    Service_szfs301002 ser;

    @Autowired
    Auto a;

    Map<String,IService> map=new HashMap<>();


    @Test
    public void testMain(){


        byte[] msg=new byte[10];
        dispatch(msg);

    }

    private void registerService(IService service){

        String code=service.getMessageTye();
        map.put(code,service);
    }

    @Override
    public boolean dispatch(byte[] msg) {

        registerService(ser);

        map.get(ser.getMessageTye()).process(msg);


        return false;
    }
}


