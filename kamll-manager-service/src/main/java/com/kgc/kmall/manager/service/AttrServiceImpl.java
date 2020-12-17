package com.kgc.kmall.manager.service;

import com.kgc.kmall.bean.PmsBaseAttrInfo;
import com.kgc.kmall.bean.PmsBaseAttrInfoExample;
import com.kgc.kmall.bean.PmsBaseAttrValue;
import com.kgc.kmall.bean.PmsBaseAttrValueExample;
import com.kgc.kmall.manager.mapper.PmsBaseAttrInfoMapper;
import com.kgc.kmall.manager.mapper.PmsBaseAttrValueMapper;
import com.kgc.kmall.service.AttrService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.List;

@Component
@Service
public class AttrServiceImpl implements AttrService{
    @Resource
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Resource
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> select(Long catalog3Id) {
        PmsBaseAttrInfoExample example=new PmsBaseAttrInfoExample();
        PmsBaseAttrInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCatalog3IdEqualTo(catalog3Id);
        List<PmsBaseAttrInfo> infoList = pmsBaseAttrInfoMapper.selectByExample(example);
        return infoList;
    }

    @Override
    public Integer add(PmsBaseAttrInfo attrInfo) {
try{
    if(attrInfo.getId()==null){
        pmsBaseAttrInfoMapper.insert(attrInfo);

    }else{
        pmsBaseAttrInfoMapper.updateByPrimaryKeySelective(attrInfo);
        PmsBaseAttrValueExample example=new PmsBaseAttrValueExample();
        example.createCriteria().andAttrIdEqualTo(attrInfo.getId());
        pmsBaseAttrValueMapper.deleteByExample(example);
    }
    pmsBaseAttrValueMapper.insertBatch(attrInfo.getId(),attrInfo.getAttrValueList());
    return 1;
}catch(Exception ex){
    ex.printStackTrace();
    return -1;
}

    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(Long attrId) {
        PmsBaseAttrValueExample example=new PmsBaseAttrValueExample();
        PmsBaseAttrValueExample.Criteria criteria = example.createCriteria();
        criteria.andAttrIdEqualTo(attrId);
        List<PmsBaseAttrValue> valueList = pmsBaseAttrValueMapper.selectByExample(example);
        return valueList;
    }

}
