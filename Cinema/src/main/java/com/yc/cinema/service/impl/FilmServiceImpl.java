package com.yc.cinema.service.impl;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.mapper.FilminfoMapper;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.util.MyBatisUtil;

public class FilmServiceImpl implements FilmService {
	private FilminfoMapper filminfoMapper;
	public FilmServiceImpl(){
		filminfoMapper=MyBatisUtil.getSession(true).getMapper(FilminfoMapper.class);
	}
	@Override
	public List<Filminfo> getFilmsByFilmBean(FilmBean filmBean) {
		List<Filminfo>  ls=filminfoMapper.getFilmsByFilmBean(filmBean);
		return ls;
	}
	@Override
	public int addFilm(FilmBean filmBean) {
		int reusult=filminfoMapper.addFilm(filmBean);
		return reusult;
		
	}

}
