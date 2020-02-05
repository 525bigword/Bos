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
        if (pacPackagingMateriarOutBoundFrom.getPacOutType().getId() !=0) {
            sql.append( " and pmo.outboundType=#{pacOutType.id}");
        }
        if (pacPackagingMateriarOutBoundFrom.getTransportSlip() !=null&& pacPackagingMateriarOutBoundFrom.getTransportSlip().equals("")) {
            sql.append( " and pmo.transportSlip=#{transportSlip}");
        }
        if (pacPackagingMateriarOutBoundFrom.getSaffiliatedUnit().getId() !=0) {
            sql.append( "  and pmo.affiliatedUnit=#{saffiliatedUnit.id}");
        }
        if (pacPackagingMateriarOutBoundFrom.getSissuedByTheUnit().getId()!=0) {
            sql.append( "and pmo.issuedByTheUnit= #{sissuedByTheUnit.id }");
        }
        if (pacPackagingMateriarOutBoundFrom.getSyEmpc().getId() !=0) {
            sql.append( "  and pmo.clienterid= #{syEmpc.id}");
        }
        if (pacPackagingMateriarOutBoundFrom.getRecipient() !=null&& pacPackagingMateriarOutBoundFrom.getRecipient().equals("")) {
            sql.append( " and  pmo.recipient=#{recipient}");
        }
        if (pacPackagingMateriarOutBoundFrom.getRecipientsTime() !=null&& pacPackagingMateriarOutBoundFrom.getRecipientsTime().equals("")) {
            sql.append( " and pmo.recipientsTime=#{recipientsTime}");
        }
        if (pacPackagingMateriarOutBoundFrom.getOrderTime()!=null&& pacPackagingMateriarOutBoundFrom.getOrderTime().equals("")) {
            sql.append( "  and pmo.ordertime=#{orderTime}");
        }
        sql.append(" order by id desc");

        return sql.toString();

    }
}

