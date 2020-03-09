package com.xr.boot.controller.sorting;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import com.xr.boot.entity.SorStorage;
import com.xr.boot.entity.SorStorageDetails;
import com.xr.boot.service.sorting.SorStorAgeService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SorStorageController")
@Slf4j
@Api(tags = "分拣模块入库相关接口")
public class SorStorageController {
    @Autowired
    private SorStorAgeService sorStorAgeService;
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody JSONObject json){
        SorPackage sorPackage = json.getObject("sorPackage", SorPackage.class);
        String AcceptCompany = json.getString("AcceptCompany");
        JSONArray jsonSorPackageDetails = json.getJSONArray("sorPackageDetails");
        List<SorPackageDetails> sorPackageDetails = JSONObject.parseArray(jsonSorPackageDetails.toJSONString(), SorPackageDetails.class);
        sorPackageDetails.forEach(System.out::println);
        try {
            sorStorAgeService.addSorStorAge(sorPackage,sorPackageDetails,AcceptCompany);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity(HttpStatus.OK,HttpStatus.OK);
    }
    @GetMapping("/query")
    public ResponseEntity<List<SorStorage>> query(SorStorage sorStorage){
        try {
            List<SorStorage> sOrStorAgeByIdAndDate = sorStorAgeService.findSOrStorAgeByIdAndDate(sorStorage);
            return new ResponseEntity<List<SorStorage>>(sOrStorAgeByIdAndDate,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<List<SorStorage>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
