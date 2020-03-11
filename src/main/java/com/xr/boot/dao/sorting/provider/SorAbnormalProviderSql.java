package com.xr.boot.dao.sorting.provider;

import com.xr.boot.entity.SorAbnormal;
import jodd.util.StringUtil;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class SorAbnormalProviderSql {
    public String findSorAbnormal(SorAbnormal sorAbnormal){
        SQL sql=new SQL();
        sql.SELECT("ID,LaunchDate,LaunchPerson,LaunchCompany,AbnormalType,TransferInt,PackageInt,HedgeAbnInt," +
                "AboState,HandleDate,Textare");
        sql.FROM("sor_abnormal");
        if(StringUtil.isNotEmpty(sorAbnormal.getId())){
            sql.WHERE("ID=#{id}");
        }
        if(StringUtil.isNotEmpty(sorAbnormal.getLaunchDate())){
            sql.WHERE("LaunchDate=#{launchDate}");
        }
        if(StringUtil.isNotEmpty(sorAbnormal.getLaunchPerson())){
            sql.WHERE("LaunchPerson like %"+sorAbnormal.getLaunchPerson()+"%");
        }
        if(StringUtil.isNotEmpty(sorAbnormal.getLaunchCompany())){
            sql.WHERE("LaunchCompany like %"+sorAbnormal.getLaunchCompany()+"%");
        }
        if(StringUtil.isNotEmpty(sorAbnormal.getAbnormalType())){
            sql.WHERE("AbnormalType=#{abnormalType}");
        }
        if(StringUtil.isNotEmpty(sorAbnormal.getTransferInt())){
            sql.WHERE("TransferInt=#{transferInt}");
        }
        if(StringUtil.isNotEmpty(sorAbnormal.getAboState())){
            sql.WHERE("AboState=#{aboState}");
        }
        return sql.toString();
    }
}
