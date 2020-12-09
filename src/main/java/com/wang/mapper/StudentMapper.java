package com.wang.mapper;

import com.wang.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);


    /**
     * CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc`(IN `num` bigint)
     * BEGIN
     * 	select * from student where id = num;
     * END
     */
    Student callProcedure(Long id);

    /**
     * CREATE DEFINER=`root`@`localhost` FUNCTION `NewFunction`() RETURNS bigint(20)
     * BEGIN
     * 	DECLARE count bigint;
     * 	select count(*) into count from student;
     * 	RETURN count;
     * END
     */
    Long callFunction();
}