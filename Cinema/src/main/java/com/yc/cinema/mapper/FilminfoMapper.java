package com.yc.cinema.mapper;

import java.util.List;

import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;

public interface FilminfoMapper {
   List<Filminfo> getFilmsByFilmBean(FilmBean filmBean);

int addFilm(FilmBean filmBean);
}