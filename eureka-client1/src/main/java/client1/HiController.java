package client1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhihui on 2017-06-17 12:02.
 */
@RestController
public class HiController {

    @RequestMapping("/hi")
    public String hi(){
        return "hi:1";
    }
}
