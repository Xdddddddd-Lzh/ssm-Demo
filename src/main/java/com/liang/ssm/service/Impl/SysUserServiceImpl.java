package com.liang.ssm.service.Impl;


import com.liang.ssm.dao.SysUserDao;
import com.liang.ssm.domain.SysUser;
import com.liang.ssm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;


    public List<SysUser> selectAll() {
        return sysUserDao.selectAll();
    }

}
