package com.sj.oa.project.mapper;

import com.sj.oa.project.po.GuestBook;

public interface GuestBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    int insert(GuestBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    int insertSelective(GuestBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    GuestBook selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GuestBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(GuestBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_guestbook
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GuestBook record);
}