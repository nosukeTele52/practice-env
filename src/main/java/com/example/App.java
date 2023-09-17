package com.example;

import com.example.bean.ExampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App implements CommandLineRunner {

    private final ExampleBean exampleBean;

    App(ExampleBean exampleBean){
        this.exampleBean = exampleBean;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        // アプリを終了させる
        context.close();
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello world");
        System.out.println(Arrays.toString(exampleBean.getValue()));
    }
}
