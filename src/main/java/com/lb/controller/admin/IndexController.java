package com.lb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description 后台主界面控制器
 */
@Controller
@RequestMapping("/admin")
public class IndexController {
    //主界面
    @RequestMapping("/index")
    public String index() {
        return "admin/index";
    }
}
