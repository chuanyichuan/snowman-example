package cc.kevinlu.snowman.springboot;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kevinlu.snow.autoconfigure.SnowmanClient;

/**
 * @author chuan
 */
@RestController
public class TestController {

    @Resource
    private SnowmanClient snowmanClient;

    @RequestMapping(value = "/index")
    public List<Object> query() {
        return snowmanClient.generateSnowId();
    }

}
