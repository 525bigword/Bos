package com.xr.boot.dao.PacPackaging.provider;

import com.xr.boot.entity.PacPackagingMateriarOutBoundFrom;
import org.springframework.stereotype.Component;

@Component
public class PacPackagingMateriarOutBoundFromSql {
    public String findPacPackagingMateriarWhere(PacPackagingMateriarOutBoundFrom pacPackagingMateriarOutBoundFrom) {

        StringBuffer sql=new StringBuffer("select pmo.id,pmo.outboundNumber,pmo.outboundType,pmo.transportSlip,pmo.affiliatedUnit,pmo.issuedByTheUnit,pmo.OperatorUnit,pmo.OperEmpNo,pmo.clienterid,pmo.recipientsTime from Pac_PackagingMateriarOutBoundFrom pmo,sy_emp sye,sy_units syu,pac_outtype pot " +
                "where pmo.clienterid=sye.id and pmo.affiliatedUnit=syu.id and pmo.outboundtype=pot.id ");
       if (pacPackagingMateriarOutBoundFrom.getOutboundNumber() != null && !pacPackagingMateriarOutBoundFrom.getOutboundNumber().equals("")) {
            sql.append( " and pmo.outboundNumber=#{outboundNumber}");
        }
        if (pacPackagingMateriarOutBoundFrom.getPacOutType()!=null&&pacPackagingMateriarOutBoundFrom.getPacOutType().getId() !=0) {
            sql.append( " and pmo.outboundType=#{pacOutType.id}");
        }
        if (pacPackagingMateriarOutBoundFrom.getTransportSlip() !=null&& !pacPackagingMateriarOutBoundFrom.getTransportSlip().equals("")) {
            sql.append( " and pmo.transportSlip=#{transportSlip}");
        }
        if (pacPackagingMateriarOutBoundFrom.getSaffiliatedUnit()!=null&&pacPackagingMateriarOutBoundFrom.getSaffiliatedUnit().getId() !=0) {
            sql.append( "  and pmo.affiliatedUnit=#{saffiliatedUnit.id}");
        }
        if (pacPackagingMateriarOutBoundFrom.getSissuedByTheUnit()!=null&&pacPackagingMateriarOutBoundFrom.getSissuedByTheUnit().getId()!=0) {
            sql.append( "and pmo.issuedByTheUnit= #{sissuedByTheUnit.id }");
        }
        if (pacPackagingMateriarOutBoundFrom.getSyEmpc()!=null&&pacPackagingMateriarOutBoundFrom.getSyEmpc().getId() !=0) {
            sql.append( "  and pmo.clienterid= #{syEmpc.id}");
        }
        if (pacPackagingMateriarOutBoundFrom.getRecipient() !=null&& !pacPackagingMateriarOutBoundFrom.getRecipient().equals("")) {
            sql.append( " and  pmo.recipient=#{recipient}");
        }
        if (pacPackagingMateriarOutBoundFrom.getRecipientsTime() !=null&& !pacPackagingMateriarOutBoundFrom.getRecipientsTime().equals("")) {
            sql.append( " and pmo.recipientsTime=#{recipientsTime}");
        }
        if (pacPackagingMateriarOutBoundFrom.getOrderTime()!=null&& !pacPackagingMateriarOutBoundFrom.getOrderTime().equals("")) {
            sql.append( "  and pmo.ordertime=#{orderTime}");
        }
        if(pacPackagingMateriarOutBoundFrom.getSyEmpc()!=null&&pacPackagingMateriarOutBoundFrom.getSyEmpc().getEmpName()!=null&&!pacPackagingMateriarOutBoundFrom.getSyEmpc().getEmpName().equals("")){
            sql.append("and (select s.empName from sy_emp s where s.id=pmo.clienterid and s.empname='" +
                    "${syEmpc.empName}" +
                    "' )");
        }
        sql.append(" order by id desc");

        return sql.toString();

    }
}

