package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorCheckBound;
import com.xr.boot.service.sorting.SorCheckBoundService;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("SorCheckBound")
public class SorCheckBoundController {
    @Autowired
    private SorCheckBoundService sorCheckBoundService;
    @PostMapping("/add")
    public void add(SorCheckBound sorCheckBound){
        try {
            sorCheckBoundService.saveSorCheckBound(sorCheckBound);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/query")
    public ResponseEntity<List<SorCheckBound>> query(SorCheckBound sorCheckBound){
        try {
            List<SorCheckBound> sorCheckBounds = sorCheckBoundService.findSorCheckBound(sorCheckBound);
            return new ResponseEntity<List<SorCheckBound>>(sorCheckBounds, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorCheckBound>>( HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
