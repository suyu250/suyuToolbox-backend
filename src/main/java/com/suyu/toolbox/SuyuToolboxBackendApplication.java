package com.suyu.toolbox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.suyu.toolbox.mapper")  // 指定要扫描的mapper的位置
@SpringBootApplication
public class SuyuToolboxBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuyuToolboxBackendApplication.class, args);
    }

}
