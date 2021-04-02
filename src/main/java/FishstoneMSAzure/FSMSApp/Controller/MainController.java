package FishstoneMSAzure.FSMSApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @GetMapping("/")
    public String hello()
    {
        return "HelloWorld";
    }
}