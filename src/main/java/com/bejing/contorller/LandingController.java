package com.bejing.contorller;

import com.bejing.domain.Landing;
import com.bejing.service.LandingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author 小韦
 * @Date 2021/10/15 20:59
 * @Version 1.0
 */
@Controller
@RequestMapping("/landing")
public class LandingController {
    @Resource
    private LandingService landingService;

    @RequestMapping("/addlanding.do")
    public ModelAndView addLanding(Landing landing, HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
        String landings="注册失败";
        Landing landing1 = landingService.addSerLanding(landing,request);
        if (landing1!=null){
           landings="注册成功";
        }
        mv.addObject("landings",landings);
        mv.setViewName("Landing");
        return mv;
    }


}
