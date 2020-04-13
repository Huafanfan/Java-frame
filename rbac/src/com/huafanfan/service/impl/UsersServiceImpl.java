package com.huafanfan.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huafanfan.mapper.UsersMapper;
import com.huafanfan.pojo.Users;
import com.huafanfan.service.ElementService;
import com.huafanfan.service.MenuService;
import com.huafanfan.service.UrlService;
import com.huafanfan.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	@Resource
	private MenuService menuServiceImpl;
	@Resource
	private ElementService elementServiceImpl;
	@Resource
	private UrlService urlServiceImpl;
//	@Override
//	public Users login(Users users) {
//		Users user = usersMapper.selByUser(users);
//		if(user!=null){
//			user.setMenus(menuServiceImpl.showMenu(user.getRid()));
//			user.setElements(elementServiceImpl.selByRid(user.getRid()));
//			user.setUrls(urlServiceImpl.selByRid(user.getRid()));
//		}
//		return user;
//	}
	@Override
	public Map<String,Object> login(Users users) {
		Map<String,Object> map =new HashMap<>();
		Users user = usersMapper.selByUser(users);
		if(user!=null){
			user.setMenus(menuServiceImpl.showMenu(user.getRid()));
			user.setElements(elementServiceImpl.selByRid(user.getRid()));
			user.setUrls(urlServiceImpl.selByRid(user.getRid()));
			map.put("allurl", urlServiceImpl.showAll());
		}
		map.put("user", user);
		return map;
	}
}
