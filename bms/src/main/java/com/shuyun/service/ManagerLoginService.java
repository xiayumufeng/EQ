package com.shuyun.service;

import com.shuyun.bean.Manager;
import com.shuyun.dataSource.DatabaseContextHolder;
import com.shuyun.mapper.ManagerInfoMapper;
import org.springframework.expression.Expression;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by b on 2017/2/21.
 */
@Service
public class ManagerLoginService {
    @Resource
    private ManagerInfoMapper managerInfoMapper;

    public  void validation(Manager manager)
    {
        List<Manager> managerList=getManagerInfo();
        managerList.forEach(manager1 -> {

            if (!(manager.getName().equals(manager1.getName())&&manager.getPwd().equals(manager1.getPwd())))
            {
                try {
                    throw new Exception("");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }







    public List<Manager> getManagerInfo(){
        DatabaseContextHolder.setCustomerType("dataSource");
        return managerInfoMapper.getManagerInfo();
    }


}
