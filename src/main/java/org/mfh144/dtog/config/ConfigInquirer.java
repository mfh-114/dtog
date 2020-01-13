package org.mfh144.dtog.config;

public interface ConfigInquirer {
	
	
	public String getValueAsString(String key);
	
	public Boolean getValueAsBoolean(String key);
	
	public String getValueAsBoolean(String key, Class<?> type);
	
}
