package com.huafanfan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.huafanfan.mapper.PicMapper;
import com.huafanfan.pojo.Pic;
import com.huafanfan.service.PicService;

@Service
public class PicServiceImpl implements PicService {
	@Value("${management.url}")
	private String path;
	@Resource
	private PicMapper picMapper;
	@Override
	public List<Pic> show() {
		List<Pic> list = picMapper.selAll();
		for (Pic pic : list) {
			pic.setPath(path+pic.getPath());
			System.out.println(pic.getPath());
		}
		return list;
	}

}
