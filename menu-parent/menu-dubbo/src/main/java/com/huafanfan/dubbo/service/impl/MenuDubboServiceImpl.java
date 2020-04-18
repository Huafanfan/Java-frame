package com.huafanfan.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.huafanfan.dubbo.service.MenuDubboService;
import com.huafanfan.mapper.MenuMapper;
import com.huafanfan.pojo.Menu;

public class MenuDubboServiceImpl implements MenuDubboService {
	@Resource
	private MenuMapper menuMapper;
	@Override
	public List<Menu> selAll() {
		List<Menu> list = menuMapper.selAll();
		for (Menu menu : list) {
			if(menu.getPid()!=0){
				menu.setParent(menuMapper.selById(menu.getPid()));
			}
			menu.setChildren(menuMapper.selByPid(menu.getId()));
		}
		return list;
	}
	@Override
	public int updMenu(Menu menu) {
		return menuMapper.updMenu(menu);
	}
	@Override
	public Menu selById(int id) {
		return menuMapper.selById(id);
	}

}

