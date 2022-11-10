package com.suyu.toolbox.utils;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("feedback")  // 可以指定哪张表
public class feedback {
    private Integer id;
    private String phone;
    private String  content;

    public feedback() {
    }

    public feedback(Integer id, String name, String content) {
        this.id = id;
        this.phone = name;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return phone;
    }

    public void setName(String name) {
        this.phone = name;
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
                ", name='" + phone + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
