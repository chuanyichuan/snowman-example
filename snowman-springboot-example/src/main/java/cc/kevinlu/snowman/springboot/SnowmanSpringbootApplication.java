package cc.kevinlu.snowman.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import cc.kevinlu.snow.autoconfigure.SnowmanClient;
import cc.kevinlu.snow.autoconfigure.SnowmanProperties;

@SpringBootApplication
public class SnowmanSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnowmanSpringbootApplication.class, args);
    }

    /**
     * We can define SnowmanClient outside the jar
     * 
     * @param properties
     * @return
     */
    @Bean
    @Primary
    public SnowmanClient snowmanClient(SnowmanProperties properties) {
        SnowmanClient client = new SnowmanClient(properties);
        return client;
    }

}
