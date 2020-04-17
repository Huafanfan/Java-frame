package com.huafanfan.service;

import java.util.List;

import com.huafanfan.pojo.Pic;

public interface PicService {
	int insPic(Pic pic);
	
	List<Pic> show();
	
	int delById(int id);
}
