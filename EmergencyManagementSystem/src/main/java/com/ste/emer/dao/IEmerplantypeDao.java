package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.Emerplantype;

/**
 * Created by st on 2014/12/30.
 */
@Deprecated
public interface IEmerplantypeDao {
	public List<Emerplantype> getEmerplantype();

	public Emerplantype findById();

}
