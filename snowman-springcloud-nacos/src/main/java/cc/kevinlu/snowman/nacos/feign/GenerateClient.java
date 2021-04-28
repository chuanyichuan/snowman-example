package cc.kevinlu.snowman.nacos.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chuan
 */
@FeignClient(name = "snowman", contextId = "generateClient")
public interface GenerateClient {

    @GetMapping(value = "/generate/{code}/{instance}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Object> generate(@PathVariable(name = "code") String groupCode,
                          @PathVariable(name = "instance") String instanceCode);

}
