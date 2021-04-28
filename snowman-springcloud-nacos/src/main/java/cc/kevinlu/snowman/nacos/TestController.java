package cc.kevinlu.snowman.nacos;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kevinlu.snow.autoconfigure.SnowmanClient;
import cc.kevinlu.snow.autoconfigure.SnowmanProperties;
import cc.kevinlu.snow.client.snowflake.SnowflakeClient;
import cc.kevinlu.snowman.nacos.feign.GenerateClient;

/**
 * @author chuan
 */
@RestController
public class TestController {

    @Resource
    private SnowmanClient     snowmanClient;

    @Resource
    private SnowflakeClient   snowflakeClient;
    @Resource
    private SnowmanProperties snowmanProperties;

    @Resource
    private GenerateClient    generateClient;

    @RequestMapping(value = "/index")
    public List<Object> query() {
        return snowmanClient.generateSnowId();
    }

    @RequestMapping(value = "/index_rpc")
    public List<Object> query1() {
        return snowflakeClient.generate(snowmanProperties.getGroupId(), snowmanProperties.getServerId());
    }

    @RequestMapping(value = "/index_rpc_self")
    public List<Object> query2() {
        return generateClient.generate(snowmanProperties.getGroupId(), snowmanProperties.getServerId());
    }

}
