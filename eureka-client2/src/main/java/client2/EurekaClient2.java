package client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lizhihui on 2017-06-16 18:41.
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2.class, args);
    }
}
