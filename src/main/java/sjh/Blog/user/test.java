package sjh.Blog.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class test {
    @GetMapping("/hello")
    @ResponseBody
    public String return_hello () {

        return "hello world !!";
    }
}
