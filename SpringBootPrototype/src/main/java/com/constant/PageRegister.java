package com.constant;

public enum PageRegister {

	wellcome("welcome", "welcome"),
	loginAdmin("loginAdmin","loginAdmin")
	;
	
	
	

	private String key;

	private String path;

	PageRegister(String key, String path) {
		this.key = key;
		this.path = path;
	}

	public String getKey() {
		return key;
	}

	public String getPath() {
		return path;
	}

}
