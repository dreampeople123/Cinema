package com.yc.cinema.serviceimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.service.impl.FilmServiceImpl;

public class FilmServiceImplTest {

	@Test
	public void testGetFilmsByFilmBean() {
		FilmService filmService=new FilmServiceImpl();
		FilmBean filmBean=new FilmBean();
	//	filmBean.setMaxprice(80.0);
	//	filmBean.setFilmname("大");
		List<Filminfo> films=filmService.getFilmsByFilmBean(filmBean);
	}

}
