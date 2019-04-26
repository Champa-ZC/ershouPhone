package com.qianfeng.recycle.service;

import com.qianfeng.recycle.vo.PriceVO;

public interface IPriceService {

    PriceVO queryPrice(Integer phoneId,Integer infoId);
}
