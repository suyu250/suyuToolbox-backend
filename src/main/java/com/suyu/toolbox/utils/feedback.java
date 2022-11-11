package com.suyu.toolbox.utils;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("feedback")  // 可以指定哪张表
public class feedback {
    @TableId(value = "id", type = IdType.AUTO)  // 设置自增 解决插入数据 id为负数的情况
    private Integer id;
    private String score;
    private String name;
    private String phone;
    private String content;

    public feedback() {
    }

    public feedback(Integer id, String score, String name, String phone, String content) {
        this.id = id;
        this.score = score;
        this.name = name;
        this.phone = phone;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "feedback{" +
                "id=" + id +
                ", score='" + score + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
