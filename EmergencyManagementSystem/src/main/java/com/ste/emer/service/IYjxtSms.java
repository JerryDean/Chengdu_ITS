package com.ste.emer.service;

import com.ste.emer.model.YjxtSms;

import java.util.List;

/**
 * Created by st on 2015/1/8.
 */
public interface IYjxtSms {
     List<YjxtSms> getYjxtSms();
     Integer insertYjxtSms(YjxtSms yjxtSms);

}
