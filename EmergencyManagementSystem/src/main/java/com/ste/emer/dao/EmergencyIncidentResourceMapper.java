package com.ste.emer.dao;

import com.ste.emer.model.EmergencyIncidentResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
 * <p>ClassName   : EmergencyIncidentResourceMapper.java </p>
 * <p>Description : This is a ...
 * ... class doing ... </p>
 * <p>Created On  :2015-10-29</p>
 *
 * @author DengBW
 * @version 1.0
 *
 */

public interface EmergencyIncidentResourceMapper {

	int addEmergencyIncidentResource(EmergencyIncidentResource resource);
	
	int updateEmergencyIncidentResource(EmergencyIncidentResource resource);
	
	int deleteEmergencyIncidentResource(String resourceId);
	
	List<EmergencyIncidentResource> getEmergencyIncidentResource(@Param("resourceType")int resourceType,@Param("location")String location);
	
	EmergencyIncidentResource findEmergencyIncidentResource();

}
