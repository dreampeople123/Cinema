package com.yc.cinema.action;



import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FilmBean;
import com.yc.cinema.entity.Filminfo;
import com.yc.cinema.service.FilmService;
import com.yc.cinema.service.impl.FilmServiceImpl;
@Controller("filmAction")
@Scope("prototype")
public class FilmAction implements ModelDriven<FilmBean>{
	@Autowired
	private FilmService  filmService;
	@Autowired
	private FilmBean filmBean;//接收页面数据 ,SessionAware
	@Autowired
	private FilmBean  filmBeans;
	
	/*
	private Map<String ,Object> session;*/
	
/*	public FilmAction (){
		filmService=new FilmServiceImpl();
	}*/
/*	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}*/
	
	//请求查询处理
	public String search(){
		LogManager.getLogger().debug("未找到符合条件的电影 "+filmBean);
		
		List<Filminfo> films=filmService.getFilmsByFilmBean(filmBean);
		
		Map<String ,Object> session=ActionContext.getContext().getSession();
		session.put("films", films);
		
		return "success";
	}
	//添加电影
	public String add(){
		System.out.println("此时的fibean"+filmBean);
		int result =filmService.addFilm(filmBean);
		if(result>0){
			List<Filminfo> films=filmService.getFilmsByFilmBean(filmBeans);
			Map<String ,Object> session=ActionContext.getContext().getSession();
			session.put("films", films);
			return "success";
		}else{
			return "add_failue";
		}
	}
	@Override
	public FilmBean getModel() {
	//	filmBean=new FilmBean();
		return filmBean;
	}


}
