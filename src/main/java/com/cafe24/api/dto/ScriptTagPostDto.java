package com.cafe24.api.dto;

public class ScriptTagPostDto {

	private Long shop_no;
	private ScriptTag request;
	
	public ScriptTagPostDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getShop_no() {
		return shop_no;
	}

	public void setShop_no(Long shop_no) {
		this.shop_no = shop_no;
	}

	public ScriptTag getRequest() {
		return request;
	}

	public void setRequest(ScriptTag request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "postDto [shop_no=" + shop_no + ", request=" + request + "]";
	}
	
	
}
