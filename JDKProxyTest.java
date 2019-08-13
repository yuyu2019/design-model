package com.gupaoedu.vip.pattern.proxy;


import java.lang.reflect.Method;

public class JDKProxyTest {

    public static void main(String[] args) {
        try {

            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findHouse",null);
            method.invoke(obj);


        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
