package com.springboot.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.springboot.demo.entity.TestUser;
import com.springboot.demo.mapper.TestUserMapper;
import com.springboot.demo.service.ITestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 * @ClassName: ITestUserServiceImpl
 * @Description: 业务逻辑实现
 * @author GongBo
 * @date 2018年12月27日 12:46:58
 */
@Service
public class ITestUserServiceImpl extends ServiceImpl<TestUserMapper,TestUser> implements ITestUserService {

    /**
     * 用户数据访问
     */
    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public TestUser selectUserByMap(Map<String, Object> parameterMap) {
        TestUser testUser = null;
        try {
            testUser = testUserMapper.selectTestUserByMap(parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testUser;
    }

    @Override
    public void batchUpdateTestUser(List<TestUser> testUserList) {
        try {
            testUserMapper.batchUpdateTestUser(testUserList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
