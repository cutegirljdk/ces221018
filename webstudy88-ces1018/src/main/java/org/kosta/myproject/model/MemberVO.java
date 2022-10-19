package org.kosta.myproject.model;

import java.io.Serializable;

public class MemberVO implements Serializable {
	private static final long serialVersionUID = 1L;
	String id;
	public MemberVO(String id) {
		super();
		this.id = id;
	}
	public MemberVO() {
		super();

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
