package com.springboot.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.springboot.demo.entity.TestUser;

import java.util.List;
import java.util.Map;

/**
 *
 * @ClassName: ITestUserService
 * @Description: 用户数据访问service
 * @author GongBo
 * @date 2018年12月27日 12:46:05
 */
public interface ITestUserService extends IService<TestUser> {

    TestUser selectUserByMap(Map<String, Object> parameterMap);

    void batchUpdateTestUser(List<TestUser> testUserList);
}
