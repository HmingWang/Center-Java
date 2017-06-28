package service;

import com.whaim.IService;

/**
 * Created by whaim on 2017/6/28.
 */
public class Service_szfs301002 implements IService{

    //message type
    private static final String msgType="301.002";

    @Override
    public String getMessageTye() {
        return msgType;
    }

    @Override
    public void process(byte[] msg) {

    }
}
