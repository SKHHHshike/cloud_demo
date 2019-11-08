package cn.shaines.eureka;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
//        LoggerFactory.getLogger(EurekaApplication.class);
        SpringApplication.run(EurekaApplication.class, args);
    }

}
