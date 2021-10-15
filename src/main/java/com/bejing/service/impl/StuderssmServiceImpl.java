package com.bejing.service.impl;

import com.bejing.dao.StuderssmDao;
import com.bejing.domain.Studerssm;
import com.bejing.service.StuderssmService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/10 15:20
 * @Version 1.0
 */
@Service
public class StuderssmServiceImpl implements StuderssmService {
    @Resource
    private StuderssmDao studerssmDao;

    @Override
    public int addStuder(Studerssm studerssm) {
        int number = studerssmDao.addStuderssm(studerssm);
        return number;
    }

    @Override
    public List<Studerssm> findStduer() {
        List<Studerssm> studerssmDaos = studerssmDao.selcetStduerssm();
        for (Studerssm dao : studerssmDaos) {
            System.out.println(dao);
        }
        return studerssmDaos;
    }
}
