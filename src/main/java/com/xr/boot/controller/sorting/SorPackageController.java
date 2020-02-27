package com.xr.boot.controller.sorting;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.service.sorting.SorPackageService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SorPackageController")
@Slf4j
public class SorPackageController {
    @Autowired
    private SorPackageService sorPackageService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody JSONObject json){
        SorPackage sorPackage = json.getObject("sorPackage", SorPackage.class);
        JSONArray jsonSorPackageDetails = json.getJSONArray("sorPackageDetails");
        List<SorPackageDetails> sorPackageDetails = JSONObject.parseArray(jsonSorPackageDetails.toJSONString(), SorPackageDetails.class);
        try {
            sorPackageService.savePackageAndPackageDetail(sorPackage,sorPackageDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.OK,HttpStatus.OK);
    }
    @GetMapping("/query")
    public ResponseEntity<List<SorPackage>> query(SorPackage sorPackage){
        List<SorPackage> SorPackages=null;
        try {
            SorPackages = sorPackageService.findSorPackageByWhere(sorPackage);
            return new ResponseEntity<List<SorPackage>>(SorPackages,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorPackage>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @ApiOperation("拆包接口")
    @PostMapping("unpacking/{package}")
    public ResponseEntity unpacking(@PathVariable String packaging){
       return null;
    }
}
