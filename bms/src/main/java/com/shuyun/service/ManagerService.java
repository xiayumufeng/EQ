package com.shuyun.service;

import com.shuyun.bean.Manager;
import com.shuyun.mapper.ManagerInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by b on 2017/2/21.
 */
@Service
public class ManagerService {
    @Resource
    private ManagerInfoMapper managerInfoMapper;

    /**
     * 管理员登录信息验证
     *
     * @param manager 管理员对象
     */
    public void validation(Manager manager) {
        List<Manager> managerList = getManagerInfo();
        boolean flag = false;
        for (Manager manager1 : managerList) {
            if (manager.getName().equals(manager1.getName()) && manager.getPwd().equals(manager1.getPwd())) {
                flag = true;

            }
        }

        if (flag == false) {
            System.out.println("登录失败，请重新登录");
        } else {
            System.out.println("验证通过！");
        }

    }


    /**
     * 查看数据库中所有管理员的权限
     */
    public void queryPurview() {
        List<Manager> purviewList = getPurviewInfo();
        List<Manager> managerList = getManagerInfo();
        purviewList.forEach(purview -> {
            managerList.forEach(manager -> {
                if (purview.getId() == manager.getId()) {
                    purview.setName(manager.getName());
                }
            });
        });

        purviewList.forEach(purview -> System.out.println(purview.getId() + "++++++" + purview.getPwd() + "++++++" + purview.getName()
                + "++++++" + purview.getSysSet() + "++++++" + purview.getReaderSet() + "++++++" + purview.getBookSet() + "++++++"
                + purview.getBorrowBack() + "++++++" + purview.getSysQuery()));

    }

    /**
     * 添加新的管理员信息
     */
    public void managerAdd(Manager manager) {
        List<Manager> managerList = getManagerInfo();
        boolean flag = true;
        for (Manager manager1 : managerList) {
            if (manager1.getName().equals(manager.getName()) && manager1.getPwd().equals(manager.getPwd())) {
                System.out.println("添加失败，该管理员信息已经存在！");
                flag = false;
            }
        }

        if (flag == true) {
            saveManagerToDatabase(manager);
        }

    }

    /**
     * 设置管理员的权限
     *
     * @param manager 待设置的管理员及权限
     */

    public void purviewModify(Manager manager) {


        managerInfoMapper.purviewModify(manager);

    }


    /**
     * 删除指定id的管理员信息
     *
     * @param id 待删除的管理员的ID
     */

    public void managerDel(int id) {

        managerInfoMapper.managerDelete(id);
    }


    /**
     * 修改指定id的管理员的密码
     *
     * @param id 待修改密码的管理员的id
     */

    public void pwdModify(int id, String newPwd) {
        List<Manager> managerList = getManagerInfo();
        Manager manager = null;
        for (Manager manager1 : managerList) {
            if (manager1.getId() == id)
                manager = manager1;

        }

        if (manager != null) {
            manager.setPwd(newPwd);

            managerInfoMapper.pwdModify(manager);
        }


    }


    /**
     * 保存指定的管理员对象到数据库
     *
     * @param manager 待保存的管理员对象
     */
    public void saveManagerToDatabase(Manager manager) {

        managerInfoMapper.ManagerAdd(manager);
    }


    /**
     * 获取数据库中保存的所有的管理员信息
     */
    public List<Manager> getManagerInfo() {

        return managerInfoMapper.getManagerInfo();
    }


    /**
     * 获取数据库中保存的所有的管理员权限信息
     *
     * @return
     */
    public List<Manager> getPurviewInfo() {

        return managerInfoMapper.getPurviewInfo();
    }


}
