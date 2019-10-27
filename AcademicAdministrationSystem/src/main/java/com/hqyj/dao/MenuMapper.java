package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Menu;

@Repository
public interface MenuMapper {
	//查询所有的权限表
	public List<Menu> findMenuAll();
}
