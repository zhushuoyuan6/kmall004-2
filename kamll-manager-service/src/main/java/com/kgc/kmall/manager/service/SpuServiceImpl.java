package com.kgc.kmall.manager.service;

import com.kgc.kmall.bean.PmsBaseSaleAttr;
import com.kgc.kmall.bean.PmsProductInfo;
import com.kgc.kmall.bean.PmsProductInfoExample;
import com.kgc.kmall.manager.mapper.PmsBaseSaleAttrMapper;
import com.kgc.kmall.manager.mapper.PmsProductInfoMapper;
import com.kgc.kmall.service.SpuService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service
public class SpuServiceImpl implements SpuService{

    @Resource
    PmsProductInfoMapper pmsProductInfoMapper;
    @Resource
    PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Override
    public List<PmsProductInfo> spuList(Long catalog3Id) {
        PmsProductInfoExample example=new PmsProductInfoExample();
        PmsProductInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCatalog3IdEqualTo(catalog3Id);
        List<PmsProductInfo> infoList = pmsProductInfoMapper.selectByExample(example);
        return infoList;
    }
    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        List<PmsBaseSaleAttr> saleAttrList = pmsBaseSaleAttrMapper.selectByExample(null);
        return saleAttrList;
    }
}
