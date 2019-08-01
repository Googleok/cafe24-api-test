package com.cafe24.api.dto;

import java.util.List;

public class ScriptTagResult {

	private Long shop_no;
	private List<ScriptTag> scripttags;
	
	public ScriptTagResult() {
	}
	
	public Long getShop_no() {
		return shop_no;
	}



	public void setShop_no(Long shop_no) {
		this.shop_no = shop_no;
	}

	public List<ScriptTag> getScripttags() {
		return scripttags;
	}

	public void setScripttags(List<ScriptTag> scripttags) {
		this.scripttags = scripttags;
	}

	@Override
	public String toString() {
		return "ScriptTagResult [shop_no=" + shop_no + ", scripttags=" + scripttags + "]";
	}
	
}
