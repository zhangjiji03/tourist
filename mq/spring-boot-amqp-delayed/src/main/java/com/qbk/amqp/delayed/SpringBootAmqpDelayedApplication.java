package com.qbk.amqp.delayed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ttl + 死信队列
 */
@SpringBootApplication
public class SpringBootAmqpDelayedApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAmqpDelayedApplication.class,args);
    }
}
