package com.liang.ssm.dao;

import com.liang.ssm.domain.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserDao {

    List<SysUser> selectAll();
}



