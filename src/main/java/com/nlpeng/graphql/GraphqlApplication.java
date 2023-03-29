package com.nlpeng.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GraphqlApplication {

    public static void main(String[] args) {
        // SpringApplication.run(GraphqlApplication.class, args);
        try {
            SpringApplication.run(GraphqlApplication.class, args);
            System.out.println("---   项目  启动成功---" + "version1.0.0        => " + new Date());
        } catch (Throwable e) {
            //异常级别越大越好，我之前测试的时候，用的是Exception，但是没有日志。
            e.printStackTrace();
        }
    }

}
