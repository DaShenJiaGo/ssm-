package com.bejing.contorller;

import com.bejing.domain.Studerssm;
import com.bejing.service.StuderssmService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Author 小韦
 * @Date 2021/10/10 15:52
 * @Version 1.0
 */
@Controller
@RequestMapping("/studer")
public class StduerssmController {
    @Resource
    private StuderssmService service;

    @RequestMapping("/addStuder.do")
    public ModelAndView addStuder(Studerssm studerssm){
        ModelAndView mv=new ModelAndView();
        String tips="注册失败";
        int number = service.addStuder(studerssm);
        if (number>0){
            tips="学生"+studerssm.getName()+"注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }
}
