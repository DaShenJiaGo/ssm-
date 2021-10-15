package com.bejing.dao;

import com.bejing.domain.Studerssm;

import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/10 15:09
 * @Version 1.0
 */
public interface StuderssmDao {
    int addStuderssm(Studerssm studerssm);
    List<Studerssm> selcetStduerssm();
}
