package com.ste.emer.service;

import com.ste.emer.model.Emerplanstate;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface IEmerplanstate {
    public List<Emerplanstate> getEmerplanstate();
    public Emerplanstate findEmerplanstateById(String psID);
    public String addEmerplanstate(Emerplanstate emerplanstate);
    public Emerplanstate deleteEmerplanstate(String psID);
    public int updateEmerplanstate(Emerplanstate emerplanstate);
}
