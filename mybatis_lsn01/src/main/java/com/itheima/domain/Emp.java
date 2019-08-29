package com.itheima.domain;

/**

 +---------+-------------+------+-----+---------+----------------+
 | Field   | Type        | Null | Key | Default | Extra          |
 +---------+-------------+------+-----+---------+----------------+
 | id      | int(11)     | NO   | PRI | NULL    | auto_increment |
 | ename   | varchar(20) | YES  |     | NULL    |                |
 | age     | int(11)     | YES  |     | NULL    |                |
 | dept_id | int(11)     | YES  | MUL | NULL    |                |
 +---------+-------------+------+-----+---------+----------------+


 */
public class Emp {

    private Integer id;
    private String ename;
    private Integer age;

    private Dept dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
