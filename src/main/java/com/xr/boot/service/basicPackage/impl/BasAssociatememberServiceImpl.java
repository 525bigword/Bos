package com.xr.boot.service.basicPackage.impl;

import com.xr.boot.dao.basicPackage.BasAssociatememberMapper;
import com.xr.boot.entity.BasAssociateMember;
import com.xr.boot.service.basicPackage.BasAssociatememberService;
import com.xr.boot.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.klock.annotation.Klock;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Slf4j
public class BasAssociatememberServiceImpl implements BasAssociatememberService {
    @Autowired
    private BasAssociatememberMapper basAssociatememberMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Transactional
    @Override
    public Object findBasAssociateMember() {
        Map<String, List<Object>> maps=new ConcurrentHashMap<String, List<Object>>();
        maps.put("BasAssociateMember", Collections.singletonList(basAssociatememberMapper.findBasAssociateMember()));
        redisUtil.set("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember", maps);
        return redisUtil.get("com.xr.boot.controller.BasAssociateMemberController.findBasAssociateMember");
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void upBasAssociateMemberById(BasAssociateMember basAssociateMember) {
        basAssociatememberMapper.upBasAssociateMemberById(basAssociateMember);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void saveBasAssociateMember(BasAssociateMember basAssociateMember) {
        basAssociatememberMapper.saveBasAssociateMember(basAssociateMember);
    }
    @Klock(leaseTime=Long.MAX_VALUE)
    @Transactional
    @Override
    public void delBasAssociateMemberById(BasAssociateMember basAssociateMember) {
        basAssociatememberMapper.delBasAssociateMemberById(basAssociateMember);
    }
    @Transactional
    @Override
    public List<String> findBasAssociateMemberByEmpNo(BasAssociateMember basAssociateMember) {
        return basAssociatememberMapper.findBasAssociateMemberByEmpNo(basAssociateMember);
    }
}
