/* Copyright (C) 2016, ST Electronics Info-Comm Systems PTE. LTD
 * All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics Info-Comm Systems PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-Comm Systems PTE. LTD.
 *
 * Project Name : emergency
 * File Name    : DetailIncident
 * Author       : Jerry
 * Created      : 2016/12/29
 *
 * <p> History : <br><br>
 *
 * SNo / CR PR_No / Modified by / Date Modified / Comments <br>
 * --------------------------------------------------------------------------------
 *  
 */
package com.ste.emer.model;

import java.util.List;

/**
 * Created by SerryMiano on 2016/12/29.
 */
public class DetailIncident {
    EmergencyIncident incident;
    List<TaskForEmergencyIncident> tasks;//任务
    List<EmergencyIncidentResourceDetail> resources;//资源
    List<EmergencyIncidentLog> logs;//执行记录

    public DetailIncident() {
    }

    public DetailIncident(EmergencyIncident incident, List<TaskForEmergencyIncident> tasks, List<EmergencyIncidentResourceDetail> resources, List<EmergencyIncidentLog> logs) {
        this.incident = incident;
        this.tasks = tasks;
        this.resources = resources;
        this.logs = logs;
    }

    public EmergencyIncident getIncident() {
        return incident;
    }

    public void setIncident(EmergencyIncident incident) {
        this.incident = incident;
    }

    public List<TaskForEmergencyIncident> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskForEmergencyIncident> tasks) {
        this.tasks = tasks;
    }

    public List<EmergencyIncidentResourceDetail> getResources() {
        return resources;
    }

    public void setResources(List<EmergencyIncidentResourceDetail> resources) {
        this.resources = resources;
    }

    public List<EmergencyIncidentLog> getLogs() {
        return logs;
    }

    public void setLogs(List<EmergencyIncidentLog> logs) {
        this.logs = logs;
    }

    @Override
    public String toString() {
        return "DetailIncident{" +
                "incident=" + incident +
                ", tasks=" + tasks +
                ", resources=" + resources +
                ", logs=" + logs +
                '}';
    }
}
