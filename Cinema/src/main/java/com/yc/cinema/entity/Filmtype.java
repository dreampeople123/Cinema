package com.yc.cinema.entity;

import java.io.Serializable;

public class Filmtype implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7358698334234355336L;

	private Integer typeid;

    private String typename;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

	@Override
	public String toString() {
		return "Filmtype [typeid=" + typeid + ", typename=" + typename + "]";
	}

	public Filmtype(Integer typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}

	public Filmtype() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}