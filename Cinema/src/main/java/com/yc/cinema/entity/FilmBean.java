package com.yc.cinema.entity;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("filmBean")
public class FilmBean implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 2397886663097235769L;

	private String filmname;

	    private String typeid;
		private String actor;
	    private String director;
	    private Double minprice;
	    private Double maxprice;
	    private Double ticketprice;
		public Double getMinprice() {
		return minprice;
	}



	public Double getTicketprice() {
			return ticketprice;
		}



		public void setTicketprice(Double ticketprice) {
			this.ticketprice = ticketprice;
		}



	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}



	public Double getMaxprice() {
		return maxprice;
	}



	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}

	

	/*	public static long getSerialversionuid() {
			return serialVersionUID;
		}*/



	
	

		
		public String getFilmname() {
			return filmname;
		}

		public void setFilmname(String filmname) {
			this.filmname = filmname;
		}

		public String getTypeid() {
			return typeid;
		}

		public void setTypeid(String typeid) {
			this.typeid = typeid;
		}

		public String getActor() {
			return actor;
		}

		public void setActor(String actor) {
			this.actor = actor;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}
		@Override
		public String toString() {
			return "FilmBean [filmname=" + filmname + ", typeid=" + typeid
					+ ", actor=" + actor + ", director=" + director
					+ ", minprice=" + minprice + ", maxprice=" + maxprice
					+ ", ticketprice=" + ticketprice + "]";
		}



/*		public FilmBean(String filmname, String typeid, String actor,
				String director, Double minprice, Double maxprice,
				Double ticketprice) {
			super();
			this.filmname = filmname;
			this.typeid = typeid;
			this.actor = actor;
			this.director = director;
			this.minprice = minprice;
			this.maxprice = maxprice;
			this.ticketprice = ticketprice;
		}



		public FilmBean() {
			super();
			// TODO Auto-generated constructor stub
		}*/
	    


}
