package com.whaim;

import org.junit.Test;

import java.io.FileReader;

/**
 * Created by whaim on 2017/6/28.
 */
public class DataParserTest {


    private class T<Integer>
    {
        public void outName(){
            //System.out.println(((ParameterizedType)T.class).getActualTypeArguments()[0]);
        }
    }

    private T t;

    @Test
    public void getClassName(){
        t=new T();
        t.outName();
    }


    @Test
    public void parser() throws Exception {




        DataParser parser=  new DataParser();

        FileReader fr= new FileReader("Z:\\git\\Center-Java\\src\\main\\resources\\xml\\sample.xml");
        char[] buffer=new char[2048];
        fr.read(buffer);


        String msg=new String(buffer).trim();
        System.out.println(msg);

    }

}