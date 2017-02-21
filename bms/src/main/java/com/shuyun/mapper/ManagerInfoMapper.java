package com.shuyun.mapper;

import com.shuyun.bean.Manager;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by b on 2017/2/21.
 */
@Component
public interface ManagerInfoMapper {
    public List<Manager> getManagerInfo();
}
