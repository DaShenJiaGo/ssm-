package com.bejing.service.impl;

import com.bejing.dao.YinghangDao;
import com.bejing.domain.YingHang;
import com.bejing.service.YingHangService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author 小韦
 * @Date 2021/10/16 0:30
 * @Version 1.0
 */
@Service
public class YingHangServiceImpl implements YingHangService {
    @Resource
    private YinghangDao yinghangDao;


    @Transactional
    @Override
    public void updatService(HttpServletRequest request) {
        String id = request.getParameter("id");
        String money = request.getParameter("money");
        List<YingHang> yingHangs = yinghangDao.selectYingHang(Integer.valueOf(id));
        for (YingHang yingHang : yingHangs) {
            if (yingHang.getMoney()<Double.parseDouble(money)){
                throw new RuntimeException("您的余额不足");
            }
        }
        YingHang yingHang=new YingHang();
        yingHang.setId(Integer.valueOf(id));
        yingHang.setMoney(Double.parseDouble(money));
        yinghangDao.updatZhuanZhang(yingHang);

        String id1 = request.getParameter("id1");
        String money1 = request.getParameter("money1");
        yingHang.setId(Integer.valueOf(id1));
        yingHang.setMoney(Double.parseDouble(money1));
        yinghangDao.updatShouKuan(yingHang);

    }
}
