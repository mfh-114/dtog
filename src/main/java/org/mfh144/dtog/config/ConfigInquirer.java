package org.mfh144.dtog.config;

import java.util.Map;

public interface ConfigInquirer {

	public void setConfigMap(Map<String, Object> configMap);

	public Boolean getValueAsBoolean(String key);

	public Integer getValueAsInt(String key);

	public String getValueAsString(String key);

	public String getValueAsList(String key);

}
