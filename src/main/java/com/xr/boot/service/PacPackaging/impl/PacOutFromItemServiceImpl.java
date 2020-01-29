package com.xr.boot.service.PacPackaging.impl;

import com.xr.boot.dao.PacPackaging.PacOutFromItemMapper;
import com.xr.boot.entity.PacOutFromItem;
import com.xr.boot.service.PacPackaging.PacOutFromItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacOutFromItemServiceImpl implements PacOutFromItemService {
    @Autowired
    private PacOutFromItemMapper pacOutFromItemMapper;
    @Override
    public void addPacOutFromItem(PacOutFromItem pacOutFromItem) {
        pacOutFromItemMapper.addPacOutFromItem(pacOutFromItem);
    }

    @Override
    public List<PacOutFromItem> findAllPacOutFromItem(String outhouseNo) {
        return pacOutFromItemMapper.findAllPacOutFromItem(outhouseNo);
    }

    @Override
    public void updatePacOutFromItem(PacOutFromItem pacOutFromItem) {
pacOutFromItemMapper.updatePacOutFromItem(pacOutFromItem);
    }
}
