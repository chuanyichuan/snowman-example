package cc.kevinlu.snowman.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = { "cc.kevinlu.snow.client", "cc.kevinlu.snowman.nacos.feign" })
@EnableDiscoveryClient
@SpringBootApplication
public class SnowmanNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnowmanNacosApplication.class, args);
    }

}
