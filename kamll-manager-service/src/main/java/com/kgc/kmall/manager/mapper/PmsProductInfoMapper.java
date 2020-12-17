package com.kgc.kmall.manager.mapper;

import com.kgc.kmall.bean.PmsProductInfo;
import com.kgc.kmall.bean.PmsProductInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductInfoMapper {
    int countByExample(PmsProductInfoExample example);

    int deleteByExample(PmsProductInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductInfo record);

    int insertSelective(PmsProductInfo record);

    List<PmsProductInfo> selectByExample(PmsProductInfoExample example);

    PmsProductInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductInfo record, @Param("example") PmsProductInfoExample example);

    int updateByExample(@Param("record") PmsProductInfo record, @Param("example") PmsProductInfoExample example);

    int updateByPrimaryKeySelective(PmsProductInfo record);

    int updateByPrimaryKey(PmsProductInfo record);
}