package com.yx.admirer.service.impl;

import com.yx.admirer.dao.CelebritiesDOMapper;
import com.yx.admirer.dataobject.CelebritiesDO;
import com.yx.admirer.service.CelebritiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yangxi
 * @Date 2019/12/3 15:25
 */
@Service
public class CelebritiesServicesImpl implements CelebritiesService {

    @Autowired
    private CelebritiesDOMapper celebritiesDOMapper;

    @Override
    public void getcelebritiesById(Integer id) {
        // 调用mapper获取到对应的用户dataobject
         CelebritiesDO celebritiesDO = celebritiesDOMapper.selectByPrimaryKey(id);
    }
}
