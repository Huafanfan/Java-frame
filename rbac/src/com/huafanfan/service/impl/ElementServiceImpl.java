package com.huafanfan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huafanfan.mapper.ElementMapper;
import com.huafanfan.pojo.Element;
import com.huafanfan.service.ElementService;

@Service
public class ElementServiceImpl implements ElementService {
	@Resource
	private ElementMapper elementMapper;
	@Override
	public List<Element> selByRid(int rid) {
		return elementMapper.selByRid(rid);
	}

}
