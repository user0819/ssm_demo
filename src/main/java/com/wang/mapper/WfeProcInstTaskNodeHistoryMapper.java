package com.wang.mapper;

import com.wang.entity.WfeProcInstTaskNodeHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WfeProcInstTaskNodeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WfeProcInstTaskNodeHistory record);

    int insertSelective(WfeProcInstTaskNodeHistory record);

    WfeProcInstTaskNodeHistory selectByPrimaryKey(Long id);

    /**
     * CREATE DEFINER=`root`@`localhost` PROCEDURE `NewProc`(IN `num` bigint)
     * BEGIN
     * 	select * from wfe_proc_inst_task_node_history where id = num;
     * END
     */
    WfeProcInstTaskNodeHistory callProcedure(Long id);

    /**
     * CREATE DEFINER=`root`@`localhost` FUNCTION `NewFunction`() RETURNS bigint(20)
     * BEGIN
     * 	DECLARE count bigint;
     * 	select count(*) into count from wfe_proc_inst_task_node_history;
     * 	RETURN count;
     * END
     */
    Long callFunction();

    int updateByPrimaryKeySelective(WfeProcInstTaskNodeHistory record);

    int updateByPrimaryKey(WfeProcInstTaskNodeHistory record);
}