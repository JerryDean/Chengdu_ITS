package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.EmergencyIncidentGISStatus;

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
 * PackageName : com.ste.emer.dao
 * </p>
 * <p>
 * ClassName : EmergencyIncidentGISStatusMapper.java
 * </p>
 * <p>
 * Description : This is a ... ... class doing ...
 * </p>
 * <p>
 * Created On :2015-10-29
 * </p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public interface EmergencyIncidentGISStatusMapper {

	int addEmergencyIncidentGISStatus(EmergencyIncidentGISStatus status);

	List<EmergencyIncidentGISStatus> getEmergencyIncidentGISStatus(
			String emergencyIncidentId);

	EmergencyIncidentGISStatus findGISStatus();
	
	int deleteEmergencyIncidentGISStatus(String emergencyIncidentId);
}
