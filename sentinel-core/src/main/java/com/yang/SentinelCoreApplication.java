package com.yang;

import com.yang.controller.FlowRuleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentinelCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelCoreApplication.class, args);
        FlowRuleController.initFlowQpsRule();
    }

}
