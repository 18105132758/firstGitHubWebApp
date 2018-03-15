package zyj.com.cn.testControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/test")
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String test01(){
        System.out.println("你好...11111");
        return "hello world";
    }
}
