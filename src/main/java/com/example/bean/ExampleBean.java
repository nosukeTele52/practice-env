package com.example.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("com.example.properties")
@Data
@Component
public class ExampleBean {
    private String[] value;
}
