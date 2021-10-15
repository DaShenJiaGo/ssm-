package com.bejing.service.impl;

import com.bejing.dao.LandingDao;
import com.bejing.domain.Landing;
import com.bejing.service.LandingService;
import com.bejing.uilte.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 小韦
 * @Date 2021/10/15 20:39
 * @Version 1.0
 */
@Service("landing")
public class LandingServiceImpl implements LandingService {
    @Resource
    private LandingDao landingDao;

    @Override
    public Landing addSerLanding(Landing landing, HttpServletRequest request) {
            String password =request.getParameter("password");
            String md5 = MD5Util.getMD5(password);
            landing.setPassword(md5);
            landingDao.addlanding(landing);
        return landing;
    }
}
