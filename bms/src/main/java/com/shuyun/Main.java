package com.shuyun;

import com.shuyun.bean.Manager;
import com.shuyun.service.ManagerLoginService;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by b on 2017/2/21.
 */
public class Main {
    public static void main(String[] args)
    {
        ApplicationContext acx=Application.getApplicationContext();
        ManagerLoginService managerLoginService=acx.getBean(ManagerLoginService.class);
        List<Manager> managerList=managerLoginService.getManagerInfo();
        managerList.forEach(manager->{
            System.out.println(manager.getId()+"+++++"+manager.getName()+"++++"+manager.getPwd());
        });

    }
}
