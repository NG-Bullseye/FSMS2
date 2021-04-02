package FishstoneMSAzure.FSMSApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @GetMapping("/")
    public String hello()
    {
        return "Hello, Azure!";
    }
}