package com.huafanfan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.huafanfan.pojo.Pic;

public interface PicMapper {
	@Select("select * from pic")
	List<Pic> selAll();
}
