package com.shuyun;

import com.shuyun.bean.Manager;
import com.shuyun.core.ChStr;
import com.shuyun.service.ManagerService;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Created by b on 2017/2/21.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext acx = Application.getApplicationContext();
        ManagerService managerLoginService = acx.getBean(ManagerService.class);
        List<Manager> managerList = managerLoginService.getManagerInfo();
        managerList.forEach(manager -> {
            System.out.println(manager.getId() + "+++++" + manager.getName() + "++++" + manager.getPwd());
        });

        /**
         * 测试登录验证
         */
        Manager m = new Manager();
        m.setName("小夏");
        m.setPwd("725");
        managerLoginService.validation(m);

        /**
         * 测试查询管理员权限
         */
        managerLoginService.queryPurview();


        /**
         * 测试增加新的管理员信息到数据库
         */
        Manager m1 = new Manager();
        m1.setName("小夏");
        m1.setPwd("725");
        managerLoginService.managerAdd(m1);

        /**
         * 测试管理员权限的修改
         */
        Manager m2 = new Manager();
        m2.setId(100);
        m2.setBookSet(1);
        m2.setReaderSet(1);
        m2.setSysSet(1);
        managerLoginService.purviewModify(m2);

        /**
         * 测试根据指定id删除管理员信息
         */

        managerLoginService.managerDel(3);

        /**
         * 修改指定id的管理员的密码
         */

        managerLoginService.pwdModify(12, "heheda");


    }
}
