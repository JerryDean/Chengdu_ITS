package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.Emerplanstate;

/**
 * Created by st on 2014/12/30.
 */
@Deprecated
public interface EmerplanstateMapper {
	public List<Emerplanstate> getEmerplanstate();

	public Emerplanstate findEmerplanstateById(String psID);

	public String addEmerplanstate(Emerplanstate emerplanstate);

	public Emerplanstate deleteEmerplanstate(String psID);

	public int updateEmerplanstate(Emerplanstate emerplanstate);
}
