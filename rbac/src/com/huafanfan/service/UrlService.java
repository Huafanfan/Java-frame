package com.huafanfan.service;

import java.util.List;

import com.huafanfan.pojo.Url;

public interface UrlService {
	List<Url> selByRid(int rid);
	
	List<Url> showAll();
}
