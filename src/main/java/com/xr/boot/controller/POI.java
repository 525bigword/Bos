package com.xr.boot.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class POI {

    @RequestMapping("/ExcelDownload")
    public void orderAnomalyListExcel(@RequestBody JSONObject json, HttpServletResponse response,
                                      HttpServletRequest request){
        JSONArray jsonSorPackageDetails = json.getJSONArray("vue");
        response.setCharacterEncoding("UTF-8");
        System.out.println(jsonSorPackageDetails);
        PrintWriter out=null;
        try {
            out = response.getWriter();

            StringBuffer arrbufffer=new StringBuffer(jsonSorPackageDetails.toJSONString());
            arrbufffer.insert(1, "[\"用户名\",\"性别\",\"身份证号码\",\"联系方式\",\"检测次数\",\"最后检测时间\",\"所属总店\",\"所属分店\"],");
            System.out.println(arrbufffer);
            out.print(arrbufffer.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            out.close();
        }
    }

}
