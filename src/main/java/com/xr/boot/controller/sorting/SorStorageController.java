package com.xr.boot.controller.sorting;

import com.xr.boot.entity.SorStorage;
import com.xr.boot.entity.SorStorageDetails;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("SorStorageController")
@Slf4j
@Api(tags = "分拣模块入库相关接口")
public class SorStorageController {

    @PostMapping("/add")
    public void add(SorStorage sorStorage, List<SorStorageDetails> sorStorageDetails){

    }
}
