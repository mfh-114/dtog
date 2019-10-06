package org.mfh144.dtog.config;

public enum AppConfigConvention {

	APP_NAME("Data Transfer Object Generator (DTOG)"), 
	JDBC_CONFIG_PATH("config/jdbc.json"),
	PLUGINS_CONFIG_PATH("config/plugin.json");

	private String value;

	private AppConfigConvention(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
