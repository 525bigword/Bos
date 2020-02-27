package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.service.sorting.SorPackageDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("SorPackageDetailController")
public class SorPackageDetailController {
    @Autowired
    private SorPackageDetailsService sorPackageDetailsService;
    @GetMapping("/query")
    public ResponseEntity<List<SorPackageDetails>> query(SorPackageDetails sorPackageDetails){
        List<SorPackageDetails> sorPackageDetailsNoPack=null;
        try {
            sorPackageDetailsNoPack = sorPackageDetailsService.findSorPackageDetailsNoPack(sorPackageDetails);
            return new ResponseEntity<List<SorPackageDetails>> (sorPackageDetailsNoPack, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorPackageDetails>> (HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/query/{packging}")
    public ResponseEntity<List<SorPackageDetails>> queryDetailByPack(@PathVariable("packging") String packging){
        try {
            System.out.println(packging);
            List<SorPackageDetails> sorPackageDetailsByPackage = sorPackageDetailsService.findSorPackageDetailsByPackage(packging);
            return new ResponseEntity<List<SorPackageDetails>>(sorPackageDetailsByPackage,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorPackageDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
