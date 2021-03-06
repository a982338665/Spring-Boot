package pers.li.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:luofeng
 * @createTime : 2018/9/12 11:30
 */
@SpringBootApplication(scanBasePackages = {"pers.li.web"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
