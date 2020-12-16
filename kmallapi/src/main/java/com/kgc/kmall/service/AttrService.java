package com.kgc.kmall.service;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {
    public List<PmsBaseAttrInfo> select(Long catalog3Id);

    public Integer add(PmsBaseAttrInfo attrInfo);

    public List<PmsBaseAttrValue> getAttrValueList(Long attrId);
}
