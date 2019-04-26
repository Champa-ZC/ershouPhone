package com.qianfeng.login;

import com.qianfeng.recycle.service.impl.DamageServiceImpl;
import com.qianfeng.recycle.service.impl.PhoneBrandServiceImpl;
import com.qianfeng.recycle.vo.DamageVO;
import com.qianfeng.recycle.vo.PhoneBrandVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class PhoneTest {

    @Autowired
    private PhoneBrandServiceImpl phoneBrandService;

    @Autowired
    private DamageServiceImpl damageService;

    @Test
    public void testCase1(){
        PhoneBrandVO phoneBrandVO = phoneBrandService.queryPhoneByPhoneId(2);
        System.out.println(phoneBrandVO.toString());
    }

    @Test
    public void testCase2(){
        List<DamageVO> damageVOS = damageService.queryDamageAndInfo3(1);
        System.out.println(damageVOS);
    }
}
