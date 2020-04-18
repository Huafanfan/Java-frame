package com.huafanfan.dubbo.service;

import java.util.List;

import com.huafanfan.pojo.Menu;

public interface MenuDubboService {
	List<Menu> selAll();
	
	int updMenu(Menu menu);
	
	Menu selById(int id);
}
