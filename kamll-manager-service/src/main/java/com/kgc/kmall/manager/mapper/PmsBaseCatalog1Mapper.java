package com.kgc.kmall.manager.mapper;

import com.kgc.kmall.bean.PmsBaseCatalog1;
import com.kgc.kmall.bean.PmsBaseCatalog1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseCatalog1Mapper {
    int countByExample(PmsBaseCatalog1Example example);

    int deleteByExample(PmsBaseCatalog1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsBaseCatalog1 record);

    int insertSelective(PmsBaseCatalog1 record);

    List<PmsBaseCatalog1> selectByExample(PmsBaseCatalog1Example example);

    PmsBaseCatalog1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsBaseCatalog1 record, @Param("example") PmsBaseCatalog1Example example);

    int updateByExample(@Param("record") PmsBaseCatalog1 record, @Param("example") PmsBaseCatalog1Example example);

    int updateByPrimaryKeySelective(PmsBaseCatalog1 record);

    int updateByPrimaryKey(PmsBaseCatalog1 record);
}