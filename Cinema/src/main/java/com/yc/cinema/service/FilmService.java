package com.yc.cinema.service;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;

public interface FilmService {

	public List<Filminfo> getFilmsByFilmBean(FilmBean filmBean) ;

	public int addFilm(FilmBean filmBean);

}
