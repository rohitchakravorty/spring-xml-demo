package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public void destroy() throws Exception {
        System.out.println("Destroy :");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties:");
    }
    public void customDestroy()
    {
        System.out.println("Custom destroy:");
    }
    public void customInit()
    {
        System.out.println("Custom Init");
    }
}
