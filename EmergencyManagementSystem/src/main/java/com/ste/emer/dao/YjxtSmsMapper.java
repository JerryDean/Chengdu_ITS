package com.ste.emer.dao;

import java.util.List;

import com.ste.emer.model.YjxtSms;

/**
 * Created by st on 2015/1/8.
 */
@Deprecated
public interface YjxtSmsMapper {
	public List<YjxtSms> getYjxtSms();

	public Integer insertYjxtSms(YjxtSms yjxtSms);

	public YjxtSms deleteYjxtSms(Integer smsID);

	public int updateYjxtSms(YjxtSms yjxtSms);

	public YjxtSms findYjxtSmsById(Integer smsID);
}
