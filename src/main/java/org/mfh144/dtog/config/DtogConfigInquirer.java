package org.mfh144.dtog.config;

import java.util.Map;

public class DtogConfigInquirer implements ConfigInquirer {

	private final Map<String, Object> configMap;

	public DtogConfigInquirer(final Map<String, Object> configMap) {
		this.configMap = configMap;
	}

	/***
	 * Query the configuration map by key and return object.
	 * 
	 * @param key
	 * @return value as Object
	 */
	private Object getValue(String key) {
		return null;
	}

	@Override
	public Boolean getValueAsBoolean(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getValueAsInt(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueAsString(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValueAsList(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfigMap(Map<String, Object> configMap) {
		
	}
}
