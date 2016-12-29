package com.ste.emer.service;

import com.ste.emer.model.EmergencyIncidentProposal;
import com.ste.emer.model.EmergencyIncidentTypeEnum;
import com.ste.emer.model.EmergencyIncidentTypeSubEnum;
import com.stee.dsms.model.PageInfo;
import com.stee.dsms.model.PageResult;
import com.stee.dsms.model.Result;

/**
 * Copyright @ 2007, ST Electronics Info-comm Systems PTE. LTD All rights
 * reserved.
 *
 * This software is confidential and proprietary property of ST Electronics
 * Info-comm Systems PTE. LTD. The user shall not disclose the contents of this
 * software and shall only use it in accordance with the terms and conditions
 * stated in the contract or licence agreement with ST Electronics Info-comm
 * Systems PTE. LTD.
 *
 * Project Name : emergency
 * <p>
 * PackageName : com.ste.emer.service
 * </p>
 * <p>
 * ClassName : EmergencyIncidentProposalService.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-28
 * </p>
 *
 * @author chenshaoyin
 * @version 1.0
 *
 */

public interface EmergencyIncidentProposalService {

	/**
	 * 创建应急预案
	 * 
	 * @param proposal
	 * @return
	 * @author chenshaoyin
	 */
	public Result addEmergencyIncidentProposal(
			EmergencyIncidentProposal proposal);

	/**
	 * 修改应急预案
	 * 
	 * @param proposal
	 * @return
	 * @author chenshaoyin
	 */
	public Result updateEmergencyIncidentProposal(
			EmergencyIncidentProposal proposal);

	/**
	 * 删除应急预案
	 * 
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	public Result deleteEmergencyIncidentProposal(String proposalId);

	/**
	 * 分页模糊查询应急预案
	 * 
	 * @param type
	 * @param subType
	 * @param name
	 * @return
	 * @author chenshaoyin
	 */
	public PageResult findEmergencyIncidentProposal(
			EmergencyIncidentTypeEnum type,
			EmergencyIncidentTypeSubEnum subType, String name, PageInfo pageInfo);// name模糊查询，为empty/null时，返回全部

	/**
	 * 通过编号查询应急预案
	 * 
	 * @param proposalId
	 * @return
	 * @author chenshaoyin
	 */
	public EmergencyIncidentProposal getEmergencyIncidentProposalById(
			String proposalId);

}
