package com.kgc.kmall.service;

import com.kgc.kmall.bean.PmsBaseSaleAttr;
import com.kgc.kmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    public List<PmsProductInfo> spuList(Long catalog3Id);
    public List<PmsBaseSaleAttr> baseSaleAttrList();
}
