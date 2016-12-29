package com.ste.emer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ste.emer.model.EmergencyIncidentProposal;

/** Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or licence agreement with ST Electronics Info-comm Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>PackageName : com.ste.emer.dao </p>
 * <p>ClassName   : EmergencyIncidentProposalMapper.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author chenshaoyin
 * @version 1.0
 *
 */

public interface EmergencyIncidentProposalMapper {
	
	
	/**
	 * 创建应急预案
	 * @param proposal
	 * @return
	 * @author chenshaoyin
	 */
	public int addEmergencyIncidentProposal(EmergencyIncidentProposal proposal);
	/**
	 * 修改应急预案
	 * @param proposal
	 * @return
	 * @author chenshaoyin
	 */
	public int updateEmergencyIncidentProposal(EmergencyIncidentProposal proposal);
	/**
	 * 删除应急预案
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	public int deleteEmergencyIncidentProposal(int proposalId);
	/**
	 * 分页模糊查询应急预案
	 * @param type
	 * @param subType
	 * @param name
	 * @return
	 * @author chenshaoyin
	 */
	public List<EmergencyIncidentProposal> findEmergencyIncidentProposal(@Param("type")int type,@Param("subType")int subType,@Param("name")String name,@Param("currentPage")int currentPage,@Param("pageSize")int pageSize);//name模糊查询，为empty/null时，返回全部
	/**
	 * 分页模糊查询应急预案All
	 * @param type
	 * @param subType
	 * @param name
	 * @return
	 * @author chenshaoyin
	 */
	public List<EmergencyIncidentProposal> findEmergencyIncidentProposalAll(@Param("currentPage")int currentPage,@Param("pageSize")int pageSize);
	/**
	 * 
	 * 通过编号查询应急预案
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	public EmergencyIncidentProposal getEmergencyIncidentProposalById(int Id);
	/**
	 * 获取总条数
	 * @param 
	 * @return
	 * @author chenshaoyin
	 */
	public int getTotalCurrent(@Param("type")int type,@Param("subType")int subType,@Param("name")String name);
	/**
	 * 获取总条数All
	 * @param 
	 * @return
	 * @author chenshaoyin
	 */
	public int getTotalCurrentAll();
	/**
	 * 获取最近插入的数据的id(id max)
	 * @param 
	 * @return
	 * @author chenshaoyin
	 */
	public int getMaxId();

}
