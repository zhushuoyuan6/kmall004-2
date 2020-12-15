package com.kgc.kmall.user.service;

import com.kgc.kmall.bean.Member;
import com.kgc.kmall.service.MemberService;
import com.kgc.kmall.user.mapper.MemberMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import java.util.List;
@Component
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;

    @Override
    public List<Member> selectAllMember() {
        List<Member> members = memberMapper.selectByExample(null);
        return members;
    }
}
