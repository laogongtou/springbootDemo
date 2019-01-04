package com.springboot.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.springboot.demo.entity.TestUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author GongBo
 * @ClassName: UserMapper
 * @Description: 用户数据访问接口
 * @date 2018年12月27日 12:43:52
 */
@Repository
public interface TestUserMapper extends BaseMapper<TestUser> {

    /**
     * @param parameterMap
     * @return
     * @throws Exception
     * @Title: selectTestUserByMap
     * @Description: 多条件组合查找用户
     */
    TestUser selectTestUserByMap(Map<String, Object> parameterMap) throws Exception;

    /**
     * @param testUserList
     * @return
     * @throws Exception
     * @Title: batchUpdateTestUser
     * @Description: 批量更新TestUser
     */
    void batchUpdateTestUser(@Param("testUserList") List<TestUser> testUserList) throws Exception;
}
