package com.yc.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.mapper.FilmtypeMapper;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.util.MyBatisUtil;
@Service("typeService")
public class TypeServiceImpl implements TypeService{
	@Autowired
	private FilmtypeMapper filmtypeMapper;
	
/*	public TypeServiceImpl(){
		filmtypeMapper =MyBatisUtil.getSession().getMapper(FilmtypeMapper.class);
	}*/
	@Override
	public List<Filmtype> findAllTypes() {
		return filmtypeMapper.getAllTypes();
	}
	

}
