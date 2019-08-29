package com.itheima.domain;

import java.util.Date;

/**

 `id` int(11) NOT NULL auto_increment,
 `username` varchar(32) NOT NULL COMMENT '用户名称',
 `birthday` datetime default NULL COMMENT '生日',
 `sex` char(1) default NULL COMMENT '性别',
 `address` varchar(256) default NULL COMMENT '地址',
 PRIMARY KEY  (`id`)


 */
public class User {

    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
