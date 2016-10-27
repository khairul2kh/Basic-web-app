package basic.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Khairul on 27/10/2016.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
