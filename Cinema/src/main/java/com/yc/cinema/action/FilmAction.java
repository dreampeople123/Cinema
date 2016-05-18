package com.yc.cinema.action;



import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.service.impl.FilmServiceImpl;

public class FilmAction implements ModelDriven<FilmBean>,SessionAware{
	private FilmService  filmService;
	private FilmBean filmBean;//接收页面数据
	private Map<String ,Object> session;
	public FilmAction (){
		filmService=new FilmServiceImpl();
	}
	//请求查询处理
	public String search(){
		LogManager.getLogger().debug("未找到符合条件的电影 "+filmBean);
		List<Filminfo> films=filmService.getFilmsByFilmBean(filmBean);
		session.put("films", films);
		return "success";
	}
	//添加电影
	public String add(){
		int result =filmService.addFilm(filmBean);
		if(result>0){
			FilmBean filmBeans=new FilmBean();
			List<Filminfo> films=filmService.getFilmsByFilmBean(filmBeans);
			session.put("films", films);
			return "success";
		}else{
			return "add_failue";
		}
	}
	@Override
	public FilmBean getModel() {
		filmBean=new FilmBean();
		return filmBean;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
