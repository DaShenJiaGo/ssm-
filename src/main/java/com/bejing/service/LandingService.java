package com.bejing.service;

import com.bejing.domain.Landing;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 小韦
 * @Date 2021/10/15 20:38
 * @Version 1.0
 */
@Service
public interface LandingService {
    Landing addSerLanding(Landing landing, HttpServletRequest request);
}
