package com.bejing.dao;

import com.bejing.domain.YingHang;

import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/16 0:04
 * @Version 1.0
 */
public interface YinghangDao {

    YingHang updatZhuanZhang(YingHang yingHang);
    YingHang updatShouKuan(YingHang yingHang);
    List<YingHang> selectYingHang(Integer id);
}
