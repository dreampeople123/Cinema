package com.yc.cinema.service.impl;

import java.util.List;

import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.mapper.FilmtypeMapper;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.util.MyBatisUtil;

public class TypeServiceImpl implements TypeService{
	private FilmtypeMapper filmtypeMapper;
	public TypeServiceImpl(){
		filmtypeMapper =MyBatisUtil.getSession().getMapper(FilmtypeMapper.class);
	}
	@Override
	public List<Filmtype> findAllTypes() {
		return filmtypeMapper.getAllTypes();
	}
	

}
