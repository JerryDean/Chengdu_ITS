package com.ste.emer.dao;

import com.ste.emer.model.Emeraccidentgrade;

/**
 * Created by st on 2014/12/30.
 */
@Deprecated
public interface EmeraccidentgradeMapper {
	// 查询所有的Emeraccidentgrade对象，返回集合
	// public List<Emeraccidentgrade> getEmeraccidentgrade();
	public Emeraccidentgrade findEmeraccidentgradeById(String dagID);

	public String addEmeraccidentgrade(Emeraccidentgrade emeraccidentgrade);

	// public Emeraccidentgrade deleteEmeraccidentgrade(String dagID);
	public int updateEmeraccidentgrade(Emeraccidentgrade emeraccidentgrade);

}
