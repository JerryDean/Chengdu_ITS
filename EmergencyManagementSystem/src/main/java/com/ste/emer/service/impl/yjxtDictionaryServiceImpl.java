package com.ste.emer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ste.emer.dao.YjxtDictionaryMapper;
import com.ste.emer.model.YjxtDictionary;
import com.ste.emer.model.YjxtViewdictionary;
import com.ste.emer.service.YjxtDictionaryService;


@Service
public class yjxtDictionaryServiceImpl implements YjxtDictionaryService {
	
	@Autowired
	private YjxtDictionaryMapper yjxtDictionaryMapper;
	
	@Override
    public List<YjxtDictionary> getDictionary(){
        return yjxtDictionaryMapper.getDictionary();
    }
	
	@Override
    public List<YjxtViewdictionary> getViewDictionary(){
        return yjxtDictionaryMapper.getViewDictionary();
    }

    @Override
    public YjxtDictionary getDictionaryById(String dicID) {
        return yjxtDictionaryMapper.getDictionaryById(dicID);
    }

    public String insertDictionary(YjxtDictionary yjxtDictionary){
          yjxtDictionaryMapper.insertDictionary(yjxtDictionary);
          return yjxtDictionary.getDicID();
    }

    @Override
    public int updateDictionary(YjxtDictionary yjxtDictionary) {
        return yjxtDictionaryMapper.updateDictionary(yjxtDictionary);
    }

    @Override
    public YjxtDictionary deleteDictionary(String dicID) {
        return yjxtDictionaryMapper.deleteDictionary(dicID);
    }

}
