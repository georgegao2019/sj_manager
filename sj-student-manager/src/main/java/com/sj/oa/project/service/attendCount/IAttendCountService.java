package com.sj.oa.project.service.attendCount;

import com.sj.oa.project.po.AttendCount;

import java.util.List;

/**
 * @author 永健
 */
public interface IAttendCountService{
    int deleteByPrimaryKeys(Integer[] id);

    void insertSelective();

    AttendCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttendCount record);

    List<AttendCount> selectAttendCountList(AttendCount attend);

}
