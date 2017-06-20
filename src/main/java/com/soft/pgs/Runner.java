package com.soft.pgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by phendzel on 6/20/2017.
 */
@SpringBootApplication(scanBasePackages = "com.soft.pgs")
@EnableTransactionManagement
public class Runner {

    public static void main(String[] args) {
        SpringApplication.run(Runner.class, args);
    }

}
