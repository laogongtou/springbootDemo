package com.springboot.demo.controller;

import com.springboot.demo.entity.TestUser;
import com.springboot.demo.service.ITestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther:GongBo
 * @Time:2018年12月26日 23:02:43
 * Description：Druid+mybatisPlus Controller
 */
@Api("Druid+mybatisPlus相关api")
@RestController
@RequestMapping("/testDruid")
public class TestDruidController {

    @Autowired
    private ITestUserService testUserService;

    @ApiOperation(value = "获取用户信息", notes = "注意事项")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "Integer", name = "id", value = "用户ID", required = true, paramType="query"),
            @ApiImplicitParam(dataType = "String", name = "userName", value = "用户名", required = false, paramType="query")
    })
    @RequestMapping("/getTestUser")
    public TestUser getTestUser(@Param("id") Integer id, @Param("userName") String userName) {
        HashMap params = new HashMap();
        params.put("id", id);
        params.put("userName", userName);
        TestUser testUser = testUserService.selectUserByMap(params);
        return testUser;
    }

    @RequestMapping("/batchUpdateTestUser")
    public void batchUpdateTestUser() {
        List<TestUser> testUserList = new ArrayList<TestUser>();
        TestUser testUser = new TestUser();
        testUser.setId(1);
        testUser.setUserName("ggggggggg");
        testUserList.add(testUser);
        testUser.setId(2);
        testUser.setUserName("bbbbbbbb");
        testUserList.add(testUser);
        testUserService.batchUpdateTestUser(testUserList);
    }
}
