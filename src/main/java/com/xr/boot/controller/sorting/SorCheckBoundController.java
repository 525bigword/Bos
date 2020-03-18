package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorCheckBound;
import com.xr.boot.service.sorting.SorCheckBoundService;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SorCheckBound")
public class SorCheckBoundController {
    @Autowired
    private SorCheckBoundService sorCheckBoundService;
    @PostMapping("/add")
    public ResponseEntity add(SorCheckBound sorCheckBound){
        try {
            sorCheckBoundService.saveSorCheckBound(sorCheckBound);
            return new ResponseEntity(HttpStatus.OK,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR);
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
    @PostMapping("/del")
    public ResponseEntity del(@RequestParam("packgings[]")String[] packgings){
        try {
            sorCheckBoundService.delSorCheckBoundByPackings(packgings);
            return new ResponseEntity(HttpStatus.OK,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
