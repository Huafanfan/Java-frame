package com.huafanfan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huafanfan.mapper.MenuMapper;
import com.huafanfan.pojo.Menu;
import com.huafanfan.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService{
	@Resource
	
	private MenuMapper menuMapper;
	@Override
	public List<Menu> showMenu(int rid) {
		return menuMapper.selByRid(rid, 0);
	}

}
