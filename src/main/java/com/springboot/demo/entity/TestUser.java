package com.springboot.demo.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 *
 * @ClassName: TestUser
 * @Description: 用户实体类
 * @author GongBo
 * @date 2018年12月27日 11:55:58
 */
@TableName("TEST_USER")
public class TestUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;

    @TableId("USER_NAME")
    private String userName;

    @TableId("PASSWORD")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
