package com.kgc.kmall.manager.mapper;

import com.kgc.kmall.bean.PmsBaseCatalog2;
import com.kgc.kmall.bean.PmsBaseCatalog2Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseCatalog2Mapper {
    int countByExample(PmsBaseCatalog2Example example);

    int deleteByExample(PmsBaseCatalog2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog2 record);

    int insertSelective(PmsBaseCatalog2 record);

    List<PmsBaseCatalog2> selectByExample(PmsBaseCatalog2Example example);

    PmsBaseCatalog2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBaseCatalog2 record, @Param("example") PmsBaseCatalog2Example example);

    int updateByExample(@Param("record") PmsBaseCatalog2 record, @Param("example") PmsBaseCatalog2Example example);

    int updateByPrimaryKeySelective(PmsBaseCatalog2 record);

    int updateByPrimaryKey(PmsBaseCatalog2 record);
}