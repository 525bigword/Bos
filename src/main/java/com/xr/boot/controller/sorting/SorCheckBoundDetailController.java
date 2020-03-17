package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorCheckBoundDetails;
import com.xr.boot.service.sorting.SorCheckBoundDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("SorCheckBoundDetail")
public class SorCheckBoundDetailController {
    @Autowired
    private SorCheckBoundDetailService sorCheckBoundDetailService;
    @GetMapping("/query")
    public ResponseEntity<List<SorCheckBoundDetails>> query(String packing){
        try {
            List<SorCheckBoundDetails> sorCheckBoundDetailsByPacking = sorCheckBoundDetailService.findSorCheckBoundDetailsByPacking(packing.substring(1, packing.length() - 1));
            return new ResponseEntity<List<SorCheckBoundDetails>>(sorCheckBoundDetailsByPacking, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorCheckBoundDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
