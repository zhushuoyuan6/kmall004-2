package com.kgc.kmall.user.mapper;

import com.kgc.kmall.bean.MemberLevel;
import com.kgc.kmall.bean.MemberLevelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberLevelMapper {
    int countByExample(MemberLevelExample example);

    int deleteByExample(MemberLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberLevel record);

    int insertSelective(MemberLevel record);

    List<MemberLevel> selectByExample(MemberLevelExample example);

    MemberLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberLevel record, @Param("example") MemberLevelExample example);

    int updateByExample(@Param("record") MemberLevel record, @Param("example") MemberLevelExample example);

    int updateByPrimaryKeySelective(MemberLevel record);

    int updateByPrimaryKey(MemberLevel record);
}