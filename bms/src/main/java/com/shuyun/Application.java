package com.shuyun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by b on 2017/2/21.
 */
public class Application {
    public static String APPLICATION_CONTEXT = "applicationContext.xml";
    public static ApplicationContext getApplicationContext(){
        return new ClassPathXmlApplicationContext(APPLICATION_CONTEXT);
    }

}
