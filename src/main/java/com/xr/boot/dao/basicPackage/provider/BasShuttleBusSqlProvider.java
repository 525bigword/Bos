package com.xr.boot.dao.basicPackage.provider;

import com.xr.boot.entity.BasShuttleBus;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class BasShuttleBusSqlProvider {
    public String findBasShuttleBusbyWhere(BasShuttleBus basShuttleBus){
        return new SQL(){
            {
                SELECT("bs.ID,bs.LineType,bs.lineID,bs.LicensePlateInt,bs.Carrier,bs.Models,bs.Driver,bs.Telephone,bs.Ton,bs.Remarks,bs.OperationUnitID,bs.OperatorID,bs.OperationTime");
                FROM("bas_shuttlebus bs,log_logistics ll");
                String tj=" bs.lineID=ll.id";
                try {
                    if (basShuttleBus.getLineType()!= null && !basShuttleBus.getLineType().equals("")) {
                        tj += " and bs.LineType=#{lineType}";
                    }

                    if (basShuttleBus.getLogLogistics().getLineName()!= null && !basShuttleBus.getLogLogistics().getLineName().equals("")) {
                        tj += " and ll.lineName=#{logLogistics.lineName}";
                    }

                    if (basShuttleBus.getLicensePlateInt()!=null&&!basShuttleBus.getLicensePlateInt().equals("")){
                        tj += " and bs.LicensePlateInt Like CONCAT('%',#{licensePlateInt},'%')";
                    }

                    if (basShuttleBus.getDriver()!= null && !basShuttleBus.getDriver().equals("")) {
                        tj += " and bs.Driver Like CONCAT('%',#{driver},'%')";
                    }

                    if (basShuttleBus.getCarrier()!= null && !basShuttleBus.getCarrier().equals("")) {
                        tj += " and bs.Carrier Like CONCAT('%',#{carrier},'%')";
                    }
                    WHERE(tj);
                }catch (Exception e){
                    WHERE(tj);
                }
            }
        }.toString()+" order by bs.operationtime desc";
    }
}
