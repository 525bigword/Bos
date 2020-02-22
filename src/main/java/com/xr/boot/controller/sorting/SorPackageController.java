package com.xr.boot.controller.sorting;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SorPackageController")
@Slf4j
public class SorPackageController {

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody JSONObject json){
        System.out.println(json.getObject("sorPackage",SorPackage.class));
        JSONArray sorPackageDetails = json.getJSONArray("sorPackageDetails");
        List<SorPackageDetails> sorPackageDetails1 = JSONObject.parseArray(sorPackageDetails.toJSONString(), SorPackageDetails.class);
        System.out.println(sorPackageDetails1.size());
        sorPackageDetails1.forEach(System.out::print);
        return new ResponseEntity(HttpStatus.OK,HttpStatus.OK);
    }
}
