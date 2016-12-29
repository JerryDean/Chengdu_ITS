package com.ste.emer.dao;

import com.ste.emer.model.YjxtDictionary;
import com.ste.emer.model.YjxtViewdictionary;

import java.util.List;

/**
 * Created by st on 2014/12/30.
 */
public interface YjxtDictionaryMapper {
    public List<YjxtDictionary> getDictionary();
    public List<YjxtViewdictionary> getViewDictionary();
    public YjxtDictionary getDictionaryById(String dicID);
    public void insertDictionary(YjxtDictionary yjxtDictionary);
    public int updateDictionary(YjxtDictionary yjxtDictionary);
    public YjxtDictionary deleteDictionary(String dicID);

}
