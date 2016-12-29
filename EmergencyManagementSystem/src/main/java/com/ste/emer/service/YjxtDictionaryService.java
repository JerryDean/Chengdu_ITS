package com.ste.emer.service;

import java.util.List;

import com.ste.emer.model.YjxtDictionary;
import com.ste.emer.model.YjxtViewdictionary;

public interface YjxtDictionaryService {
	
    public List<YjxtDictionary> getDictionary();
    public List<YjxtViewdictionary> getViewDictionary();
    public YjxtDictionary getDictionaryById(String dicID);
    public String insertDictionary(YjxtDictionary yjxtDictionary);
    public int updateDictionary(YjxtDictionary yjxtDictionary);
    public YjxtDictionary deleteDictionary(String dicID);

}
