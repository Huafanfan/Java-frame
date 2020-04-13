package com.huafanfan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huafanfan.mapper.UrlMapper;
import com.huafanfan.pojo.Url;
import com.huafanfan.service.UrlService;

@Service
public class UrlServiceImpl implements UrlService {
	@Resource
	private UrlMapper urlMapper;
	@Override
	public List<Url> selByRid(int rid) {
		return urlMapper.selByRid(rid);
	}
	@Override
	public List<Url> showAll() {
		return urlMapper.selAll();
	}

}
