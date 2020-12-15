package com.kgc.kmall.user.mapper;

import com.kgc.kmall.bean.MemberReceiveAddress;
import com.kgc.kmall.bean.MemberReceiveAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberReceiveAddressMapper {
    int countByExample(MemberReceiveAddressExample example);

    int deleteByExample(MemberReceiveAddressExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberReceiveAddress record);

    int insertSelective(MemberReceiveAddress record);

    List<MemberReceiveAddress> selectByExample(MemberReceiveAddressExample example);

    MemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MemberReceiveAddress record, @Param("example") MemberReceiveAddressExample example);

    int updateByExample(@Param("record") MemberReceiveAddress record, @Param("example") MemberReceiveAddressExample example);

    int updateByPrimaryKeySelective(MemberReceiveAddress record);

    int updateByPrimaryKey(MemberReceiveAddress record);
}