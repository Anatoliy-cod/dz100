package academy.prog.myshortenlink;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageControler {

    @GetMapping("/stat.html")
    public String stat() {
        return "stat";
    }
}