package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorAbnormal;
import com.xr.boot.service.sorting.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("SorAbnormal")
public class SorAbnormalController {
    @Autowired
    private SorAbnormalService sorAbnormalService;
    @PostMapping("/add")
    public void add(SorAbnormal sorAbnormal){
        try {
            sorAbnormalService.saveSorAbnormal(sorAbnormal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/query")
    public ResponseEntity<List<SorAbnormal>> query(SorAbnormal sorAbnormal){
        try {
            List<SorAbnormal> sorAbnormals = sorAbnormalService.findSorAbnormalByWhere(sorAbnormal);
            return new ResponseEntity<List<SorAbnormal>>(sorAbnormals, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorAbnormal>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
