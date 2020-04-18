package com.huafanfan.service;

import java.util.List;
import java.util.Map;

import com.huafanfan.pojo.Menu;

public interface MenuService {
	List<Menu> show();
	
	Map<String,Object> showMenu(int id);
	
	int update(Menu menu);
}
