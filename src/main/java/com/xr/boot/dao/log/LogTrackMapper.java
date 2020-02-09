package com.xr.boot.dao.log;

import com.xr.boot.entity.LogTrack;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface LogTrackMapper {
    /**
     * 跟踪表登记
     */
    @Insert("insert into Log_track(id,LineType,LineName,LogisticsCar,LineState,dispatchingName,NodeName,CarInt,NextNodeLoad,Describes) values(#{id},#{lineType},#{lineName},#{logisticsCar},#{lineState},#{dispatchingName},#{nodeName},#{carInt},#{nextNodeLoad},#{describes})")
    void saveLogTrack(LogTrack logTrack);
    /**
     * 确认发车时间，到达时间
     */
@Update("update Log_Track set StartTime=#{startTime},ArrivalTime=#{arrivalTime} where id=#{id}")
    void updateLogTrackByid(LogTrack logTrack);
/**
 * 确认物流车处理完成
 */
@Update("update Log_Track set LineState=1 where carInt=#{carInt}")
void updateLogTrackByCarInt(String carInt);
/**
 * 查询跟踪时刻表
 */
@Select("select id,LineType,LineName,LogisticsCar,LineState,dispatchingName,NodeName,CarInt,NextNodeLoad,Describes from Loc_Track")
@Results({
        @Result(id=true,column ="ID",property = "id"),
        @Result(column = "LineType", property = "lineType"),
        @Result(column = "LineName", property = "lineName"),
        @Result(column = "LogisticsCar", property = "logisticsCar"),
        @Result(column = "LineState", property = "lineState"),
        @Result(column = "dispatchingName", property = "dispatchingName"),
        @Result(column = "NodeName", property = "nodeName"),
        @Result(column = "carInt", property = "carInt"),
        @Result(column = "NextNodeLoad", property = "nextNodeLoad"),
        @Result(column = "Describes", property = "describes")
})
    List<LogTrack> findAllLogTrack();
}
