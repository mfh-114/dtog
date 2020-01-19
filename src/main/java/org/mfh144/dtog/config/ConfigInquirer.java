package org.mfh144.dtog.config;

import java.util.Map;

public interface ConfigInquirer {

	public void setConfigMap(Map<String, Object> configMap);

	public <T> T getValue(String key);

}
