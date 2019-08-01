package com.cafe24.api.dto;

import java.util.List;

public class ScriptTag {
	
	private Long shop_no;
	private String script_no;
	private String client_id;
	private String src;
	private List<String> display_location;
	private List<Long> skin_no;
	private List<String> exclude_path;
	private String created_date;
	private String updated_date;
	
	public ScriptTag() {
		// TODO Auto-generated constructor stub
	}
	
	public ScriptTag(Long shop_no, String script_no, String client_id, String src, List<String> display_location,
			List<Long> skin_no, List<String> exclude_path, String created_date, String updated_date) {
		super();
		this.shop_no = shop_no;
		this.script_no = script_no;
		this.client_id = client_id;
		this.src = src;
		this.display_location = display_location;
		this.skin_no = skin_no;
		this.exclude_path = exclude_path;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}



	public Long getShop_no() {
		return shop_no;
	}

	public void setShop_no(Long shop_no) {
		this.shop_no = shop_no;
	}

	public String getScript_no() {
		return script_no;
	}

	public void setScript_no(String script_no) {
		this.script_no = script_no;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public List<String> getDisplay_location() {
		return display_location;
	}

	public void setDisplay_location(List<String> display_location) {
		this.display_location = display_location;
	}

	public List<Long> getSkin_no() {
		return skin_no;
	}

	public void setSkin_no(List<Long> skin_no) {
		this.skin_no = skin_no;
	}

	public List<String> getExclude_path() {
		return exclude_path;
	}

	public void setExclude_path(List<String> exclude_path) {
		this.exclude_path = exclude_path;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "ScriptTag [shop_no=" + shop_no + ", script_no=" + script_no + ", client_id=" + client_id + ", src="
				+ src + ", display_location=" + display_location + ", skin_no=" + skin_no + ", exclude_path="
				+ exclude_path + ", created_date=" + created_date + ", updated_date=" + updated_date + "]";
	}
	
}
