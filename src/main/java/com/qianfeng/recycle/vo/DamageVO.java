package com.qianfeng.recycle.vo;

import java.util.List;

public class DamageVO {

    private Long damageId;
    private String damageName;
    private List<DamageInfoVO> damageInfoVOList;

    public Long getDamageId() {
        return damageId;
    }

    public void setDamageId(Long damageId) {
        this.damageId = damageId;
    }


    public String getDamageName() {
        return damageName;
    }

    public void setDamageName(String damageName) {
        this.damageName = damageName;
    }

    public List<DamageInfoVO> getDamageInfoVOList() {
        return damageInfoVOList;
    }

    public void setDamageInfoVOList(List<DamageInfoVO> damageInfoVOList) {
        this.damageInfoVOList = damageInfoVOList;
    }

}
