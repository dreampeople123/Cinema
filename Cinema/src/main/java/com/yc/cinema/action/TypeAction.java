package com.yc.cinema.action;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;






import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.yc.cinema.entity.Filmtype;
import com.yc.cinema.service.TypeService;
import com.yc.cinema.service.impl.TypeServiceImpl;
@Controller("typeAction")
@Scope("prototype")
public class TypeAction {
	@Autowired
	private TypeService typeService;
	
	private List<Filmtype> filmtypes;
	
	public List<Filmtype> getFilmtypes() {
		return filmtypes;
	}

/*	public TypeAction(){
		typeService=(TypeService) new TypeServiceImpl();
	}*/
	//异步请求处理，
	
public  void getTypes(){
	System.out.println("asfsfasdf");
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("charset=utf-8");
		try {
			List<Filmtype> types=typeService.findAllTypes();//循环注入Filmtype需要提供get方法
			Gson gson=new Gson();
			String jsonResult=gson.toJson(types);
			
			PrintWriter out=response.getWriter();
		//	out.print("给你数据");
			out.print(jsonResult);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}		
/*public String getTypes(){
		filmtypes=typeService.findAllTypes();
		return "success";
	}*/
}
