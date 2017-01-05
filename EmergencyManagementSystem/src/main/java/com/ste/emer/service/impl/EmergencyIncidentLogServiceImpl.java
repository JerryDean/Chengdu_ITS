package com.ste.emer.service.impl;

import com.ste.emer.dao.EmergencyIncidentLogMapper;
import com.ste.emer.model.EmergencyIncidentLog;
import com.ste.emer.service.EmergencyIncidentLogService;
import com.stee.dsms.model.Result;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
 * PackageName : com.ste.emer.service.impl
 * </p>
 * <p>
 * ClassName : EmergencyIncidentLogServiceImpl.java
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

@Service
public class EmergencyIncidentLogServiceImpl implements
		EmergencyIncidentLogService {

	private static final String SUCCESS = "000000";
	private static final String FAILED = "900102";

	@Autowired
	private EmergencyIncidentLogMapper emergencyIncidentLogMapper;

	private static final Logger logger = Logger
			.getLogger(EmergencyIncidentLogServiceImpl.class);

	@Override
	// sysynchronized
	public synchronized Result addEmergencyIncidentLog(
			EmergencyIncidentLog emergencyIncidentLog) {

		logger.info("addEmergencyIncidentLog-->" + emergencyIncidentLog);

		Result result = new Result();

		Integer number = -1;

		Integer count = -1;

		if (isNull(emergencyIncidentLog)) {

			count = emergencyIncidentLogMapper
					.findEIIdCount(emergencyIncidentLog
							.getEmergencyIncidentId());

			// System.out.println(count);

			if (count != -1) {

				emergencyIncidentLog.setTaskName((count + 1) + "");

				number = emergencyIncidentLogMapper
						.addEmergencyIncidentLog(emergencyIncidentLog);

			}

		}

		if (number == 1) {

			// 返回taskName
			String taskName = (count + 1) + "";
			result.setId(taskName);
			result.setStatusCode(SUCCESS);
			return result;

		} else {

			result.setStatusCode(FAILED);
			return result;

		}
	}

	@Override
	public List<EmergencyIncidentLog> findLogByEmergencyIncidentId(
			String emergencyIncidentId) {

		logger.info("findLogByEmergencyIncidentId-->emergencyIncidentId:"
				+ emergencyIncidentId);

		if (emergencyIncidentId != null && emergencyIncidentId != "") {

			return emergencyIncidentLogMapper
					.findLogByEmergencyIncidentId(emergencyIncidentId);

		} else {

			return null;

		}

	}

    @Override
    public Result updateEmergencyIncidentLog(EmergencyIncidentLog emergencyIncidentLog) {
        logger.info("emergencyIncidentLog = [" + emergencyIncidentLog + "]");
        Result result = new Result();
        result.setId(emergencyIncidentLog.getId());
        int num = 0;
        if (null != emergencyIncidentLog && null != emergencyIncidentLog.getId() && !emergencyIncidentLog.getId().equals("")) {
            num = emergencyIncidentLogMapper.updateEmergencyIncidentLog(emergencyIncidentLog);
        }
        if (num == 1) {
            result.setStatusCode(SUCCESS);
        } else {
            result.setStatusCode(FAILED);
        }
        return result;
    }

    @Override
    public Result deleteEmergencyIncidentLog(String id) {
        Result result = new Result();
        result.setId(id);
        int num = 0;
        if (null != id && !id.equals("")) {
            EmergencyIncidentLog byId = emergencyIncidentLogMapper.findById(id);
            if (null != byId) {
                String taskName = byId.getTaskName();
                String emergencyIncidentId = byId.getEmergencyIncidentId();
                num = emergencyIncidentLogMapper.deleteEmergencyIncidentLog(id);
                if (null != emergencyIncidentId && !emergencyIncidentId.equals("")) {
                    List<EmergencyIncidentLog> logByEmergencyIncidentId = emergencyIncidentLogMapper.findLogByEmergencyIncidentId(emergencyIncidentId);
                    if (null != logByEmergencyIncidentId && !logByEmergencyIncidentId.isEmpty()) {
                        for (EmergencyIncidentLog emergencyIncidentLog : logByEmergencyIncidentId) {
                            Integer taskName1 = Integer.valueOf(emergencyIncidentLog.getTaskName());
                            if (taskName1 > Integer.valueOf(taskName)) {
                                emergencyIncidentLog.setTaskName(String.valueOf(taskName1 - 1));
                            }
                            emergencyIncidentLogMapper.updateEmergencyIncidentLog(emergencyIncidentLog);
                        }
                    }
                }
            } else {
                result.setStatusCode(FAILED);
            }
        }
        if (num == 1) {
            result.setStatusCode(SUCCESS);
        } else {
            result.setStatusCode(FAILED);
        }
        System.out.println(result);
        return result;
    }

    /**
	 * 方法用于判断EmergencyIncidentLog实例中相关属性是否为null
	 * 
	 * @param e
	 *            一个EmergencyIncidentLog实例
	 * @return 若满足条件，则返回true，若不满足条件，则返回false
	 * @author DengBW
	 */
	private boolean isNull(EmergencyIncidentLog e) {

		List<Object> list = new ArrayList<Object>();

		list.add(e.getEmergencyIncidentId());
		list.add(e.getDescribe());
		list.add(e.getDateTime());

		for (Object o : list) {
			if (o == null || "".equals(o)) {
				return false;
			}
		}

		return true;
	}

}
