package com.liang.ssm.test;

import com.liang.ssm.domain.SysUser;
import com.liang.ssm.service.Impl.SysUserServiceImpl;
import com.liang.ssm.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class myTest {

    @Autowired
    private SysUserServiceImpl sysUserService;

    @Test
    public void testIsSuccess(){
        List<SysUser> sysUsers = sysUserService.selectAll();
        for (SysUser sysUser : sysUsers) {
            System.out.println(sysUser.getId() + "---" + sysUser.getUsername());
        }
    }
}
