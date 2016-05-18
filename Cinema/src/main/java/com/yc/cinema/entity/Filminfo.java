package com.yc.cinema.entity;


public class Filminfo {
    private Integer filmid;

    private String filmname;

    private Filmtype type;

    private String actor;

    private String director;
private Double ticketprice;

  

    public Filminfo(Integer filmid, String filmname, Filmtype type, String actor,
		String director, Double ticketprice) {
	super();
	this.filmid = filmid;
	this.filmname = filmname;
	this.type = type;
	this.actor = actor;
	this.director = director;
	this.ticketprice = ticketprice;
}

	public Double getTicketprice() {
	return ticketprice;
}

public void setTicketprice(Double ticketprice) {
	this.ticketprice = ticketprice;
}

	@Override
public String toString() {
	return "Filminfo [filmid=" + filmid + ", filmname=" + filmname + ", type="
			+ type + ", actor=" + actor + ", director=" + director
			+ ", ticketprice=" + ticketprice + "]";
}

	public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname == null ? null : filmname.trim();
    }

 

    public Filmtype getType() {
		return type;
	}

	public void setType(Filmtype type) {
		this.type = type;
	}

	public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }






	



	public Filminfo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}