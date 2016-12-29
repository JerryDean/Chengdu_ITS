package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtDictionaryTypeMapper;
import com.ste.emer.model.YjxtDictionaryType;
import com.ste.emer.service.YjxtDictionaryTypeService;

@Service
public class YjxtDictionaryTypeServiceImpl implements YjxtDictionaryTypeService {

	@Autowired
	private YjxtDictionaryTypeMapper iyjxtDictionaryTypeMapper;
	
	@Override
	public List<YjxtDictionaryType> getDictionaryType() {
		return iyjxtDictionaryTypeMapper.getDictionaryType();
	}

}
