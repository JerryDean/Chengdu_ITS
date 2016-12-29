package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.Emerplangrade;

/**
 * Created by st on 2014/12/30.
 */
@Deprecated
public interface EmerplangradeMapper {
	public List<Emerplangrade> getEmerplangrade();

	public Emerplangrade findEmerplangradById(String pgID);

	public String deleteEmerplangrade(String pgID);

	public String addEmerplangrade(Emerplangrade emerplangrade);

	public int updateEmerplangrade(Emerplangrade emerplangrade);
}
