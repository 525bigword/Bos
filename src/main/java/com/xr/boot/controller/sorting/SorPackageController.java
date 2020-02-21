package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorPackage;
import com.xr.boot.entity.SorPackageDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("SorPackageController")
@Slf4j
public class SorPackageController {

    @PostMapping("/add")
    public void add(SorPackage sorPackage, SorPackageDetails sorPackageDetails){
        System.out.println(sorPackage);
        System.out.println(sorPackageDetails);
    }
}
