package com.lb.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName： HomeController
 * @Description： 前台控制台
 **/
@Controller
@RequestMapping("/home")
public class HomeController {
      //主页
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("cur","index");
        return "home/index";
    }

    //医院介绍
    @RequestMapping("/introduction")
    public String introduction(Model model) {
        model.addAttribute("cur","introduction");
        return "home/introduction";
    }

    //专家团队
    @RequestMapping("/expert")
    public String expert(Model model) {
        model.addAttribute("cur","expert");
        return "home/expert";
    }

    //患者服务
    @RequestMapping("/service")
    public String service(Model model) {
        model.addAttribute("cur","service");
        return "home/service";
    }

    //坐诊时间
    @RequestMapping("/seekGuide")
    public String seekGuide(Model model) {
        model.addAttribute("cur","seekGuide");
        return "home/seekGuide";
    }

    //就医指南
    @RequestMapping("/guide")
    public String guide(Model model) {
        model.addAttribute("cur","guide");
        return "home/guide";
    }
//关于我们
    @RequestMapping("/join")
    public String about(Model model){
        model.addAttribute("cur","join");
        return "home/join";

    }
    //医院环境
    @RequestMapping("/environment")
    public  String environment(Model model){
        model.addAttribute("cur","environment");
                return "home/environment";
    }
    //新闻列表
    @RequestMapping("/newslist")
    public  String newslist(Model model){
        model.addAttribute("cur","newslist");
        return "home/newslist";
    }
//公司文化
      @RequestMapping("/culture")
      public String culture(Model model){
        model.addAttribute("cur","culture");
        return "home/culture";
      }
     //科室1
    @RequestMapping("/Office_1")
    public String Office_1(Model model){
        model.addAttribute("cur","Office_1");
        return "home/Office_1";
    }

    //科室2
    @RequestMapping("/Office_2")
    public String Office_2(Model model){
        model.addAttribute("cur","Office_2");
        return "home/Office_2";
    }

    //科室3
    @RequestMapping("/Office_3")
    public String Office_3(Model model){
        model.addAttribute("cur","Office_3");
        return "home/Office_3";
    }

    //科室4
    @RequestMapping("/Office_4")
    public String Office_4(Model model){
        model.addAttribute("cur","Office_4");
        return "home/Office_4";
    }

    //科室5
    @RequestMapping("/Office_5")
    public String Office_5(Model model){
        model.addAttribute("cur","Office_5");
        return "home/Office_5";
    }

    //新闻中心
       @RequestMapping("/news")
    public String news(Model model) {
        model.addAttribute("cur","news");
        return "home/news";

    }

}
