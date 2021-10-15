package com.bejing.service;

import com.bejing.domain.Studerssm;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/10 15:18
 * @Version 1.0
 */
@Service
public interface StuderssmService {
    int addStuder(Studerssm studerssm);
    List<Studerssm> findStduer();
}
