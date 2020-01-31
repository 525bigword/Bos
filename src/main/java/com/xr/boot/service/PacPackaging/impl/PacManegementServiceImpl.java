package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacManegementMapper;
import com.xr.boot.entity.PacManegement;
import com.xr.boot.service.PacPackaging.PacManegementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacManegementServiceImpl implements PacManegementService {
    @Autowired
    private PacManegementMapper pacManegementMapper;
    /**
     * 包装材料库存管理新增
     */
    @Override
    public void addPacManegement(PacManegement pacManegement) {
pacManegementMapper.addPacManegement(pacManegement);
    }
    /**
     * 查看包装材料库存管理
     * @return
     */
    @Override
    public List<PacManegement> findAllPacManegement() {
        return pacManegementMapper.findAllPacManegement();
    }
    /**
     * 查询库存里是否有该物品
     * @param goodsCode
     * @return
     */
    @Override
    public int findBygoodsCode(String goodsCode) {
        return pacManegementMapper.findBygoodsCode(goodsCode);
    }
    /**
     * 根据物品编码查询库存数量
     * @param goodsCode
     * @return
     */
    @Override
    public String findNumBygoodsCode(String goodsCode) {
        return pacManegementMapper.findNumBygoodsCode(goodsCode);
    }

    @Override
    public void updatePacNum(int storageNum,String goodsCode) {
        pacManegementMapper.updatePacNum(storageNum,goodsCode);
    }
}
