package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lizhihui on 2017-06-17 11:53.
 */
@FeignClient(value = "eureka-client1")
public interface HiService {

    @RequestMapping("/hi")
    String say(@RequestParam(value = "name") String name);
}
